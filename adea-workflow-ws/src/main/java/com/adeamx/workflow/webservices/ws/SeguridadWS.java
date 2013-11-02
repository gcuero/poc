/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.webservices.ws;

import com.adeamx.workflow.domain.CodeMessageConstants;
import com.adeamx.workflow.domain.web.AccesoWebmxResponseMessage;
import com.adeamx.workflow.domain.web.MenuResponseMessage;
import com.adeamx.workflow.domain.web.MenuWeb;
import com.adeamx.workflow.domain.web.UsuarioResponseMessage;
import com.adeamx.workflow.domain.web.UsuarioWeb;
import com.adeamx.workflow.web.utils.WebServiceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.kudytech.adeamx.mexweb.model.AccesoWebmx;
import org.kudytech.adeamx.mexweb.model.Authority;
import org.kudytech.adeamx.mexweb.model.MenuWebmx;
import org.kudytech.adeamx.mexweb.model.UsuarioWebmx;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.webmx.service.AccessTraceService;
import org.kudytech.webmx.service.AuthenticationService;
import org.kudytech.webmx.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author gcuero
 */
@WebService(
        targetNamespace="http://ws.webservices.seguridad.adeamx.com/", 
        serviceName="SeguridadWS",
        portName="SeguridadWSPort")
public class SeguridadWS extends AbstractDebug {

    @Autowired
    @Qualifier("menuService")
    MenuService menuService;
    @Autowired
    @Qualifier("authenticationService")
    AuthenticationService authenticationService;
    @Autowired
    @Qualifier("accessTraceService")
    AccessTraceService accessTraceService;

    @WebMethod(operationName = "getMenuByUser")
    public MenuResponseMessage getMenuByUser(@WebParam(name = "login") String login,
            @WebParam(name = "idAplicacion") int idAplicacion) {
        MenuResponseMessage mrm = new MenuResponseMessage();
        debug("Login :: " + login);
        debug("idAplicacion :: " + idAplicacion);
        debug("MenuService :: " + this.menuService);
        try {
            List<MenuWebmx> applicationMenu =
                    this.menuService.getApplicationMenu(login, idAplicacion);
            debug("Size ::" + applicationMenu.size());
            for (MenuWebmx menuWebmx : applicationMenu) {
                debug(" - " + menuWebmx.getNombre() + " - " + menuWebmx.getDescripcion());
            }
            mrm = (MenuResponseMessage) WebServiceUtils.getResponseMessageIfNull(applicationMenu, mrm);
            mrm.setApplicationMenu(this.getMenuWebList(applicationMenu));
        } catch (Exception exception) {
            error(exception);
            mrm.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            mrm.setErrorMessage(exception.getMessage());
        }
        return mrm;
    }

    @WebMethod(operationName = "getSubMenuByUser")
    public MenuResponseMessage getSubMenuByUser(@WebParam(name = "login") String login,
            @WebParam(name = "idAplicacion") int idAplicacion,
            @WebParam(name = "idParent") double idParent) {
        MenuResponseMessage mrm = new MenuResponseMessage();
        debug("Login :: " + login);
        debug("idAplicacion :: " + idAplicacion);
        debug("idParent :: " + idParent);
        try {
            List<MenuWebmx> applicationMenu =
                    this.menuService.getApplicationSubMenu(idParent, login, idAplicacion);
            mrm = (MenuResponseMessage) WebServiceUtils.getResponseMessageIfNull(applicationMenu, mrm);
            mrm.setApplicationMenu(this.getMenuWebList(applicationMenu));
        } catch (GenericServiceException exception) {
            error(exception);
            mrm.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            mrm.setErrorMessage(exception.getMessage());
        }
        return mrm;
    }

    @WebMethod(operationName = "getUsuarioWebByLogin")
    public UsuarioResponseMessage getUsuarioWebByLogin(@WebParam(name = "login") String login) {
        UsuarioResponseMessage urm = new UsuarioResponseMessage();
        debug("Login :: " + login);
        try {
            UsuarioWebmx loadUserByLogin = this.authenticationService.loadUserByLogin(login);
            urm = (UsuarioResponseMessage) WebServiceUtils.getResponseMessageIfNull(loadUserByLogin, urm);
            urm.setUsuarioWeb(this.getUsuarioWeb(loadUserByLogin));
        } catch (GenericServiceException ex) {
            error(ex);
            urm.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            urm.setErrorMessage(ex.getMessage());
        }
        return urm;
    }

    @WebMethod(operationName = "getAccesoWebmx")
    public AccesoWebmxResponseMessage getAccesoWebmx(
            @WebParam(name = "login") String login,
            @WebParam(name = "fechaLogin") Date fechaLogin,
            @WebParam(name = "ipAddress") String ipAddress) {
        AccesoWebmxResponseMessage awrm = new AccesoWebmxResponseMessage();
        try {
            AccesoWebmx accesoWebmx =
                    this.accessTraceService.registerAccesoWebmx(login, fechaLogin, ipAddress);
            awrm = (AccesoWebmxResponseMessage) WebServiceUtils.
                    getResponseMessageIfNull(accesoWebmx, awrm);
        } catch (GenericServiceException ex) {
            error(ex);
            awrm.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            awrm.setErrorMessage(ex.getMessage());
        }
        return awrm;
    }

    private UsuarioWeb getUsuarioWeb(UsuarioWebmx usuarioWebmx) throws GenericServiceException {
        UsuarioWeb usuarioWeb = new UsuarioWeb();
        usuarioWeb.setCliente(usuarioWebmx.getCliente());
        usuarioWeb.setEmail(usuarioWebmx.getEmail());
        usuarioWeb.setFechaalta(usuarioWebmx.getFechaalta());
        usuarioWeb.setFechabaja(usuarioWebmx.getFechabaja());
        usuarioWeb.setFecharevocado(usuarioWebmx.getFecharevocado());
        usuarioWeb.setIntentos(usuarioWebmx.getIntentos());
        usuarioWeb.setLogin(usuarioWebmx.getLogin());
        usuarioWeb.setNombre(usuarioWebmx.getNombre());
        usuarioWeb.setPassword(usuarioWebmx.getPassword());
        usuarioWeb.setStatus(usuarioWebmx.getStatus());
        List<Authority> authorities =
                this.authenticationService.getAuthoritiesByLogin(
                usuarioWebmx.getLogin());
        List<com.adeamx.workflow.domain.web.Authority> authoritys =
                new ArrayList<com.adeamx.workflow.domain.web.Authority>();
        com.adeamx.workflow.domain.web.Authority buffer;
        for (Authority authority : authorities) {
            buffer = new com.adeamx.workflow.domain.web.Authority();
            buffer.setDescription(authority.getDescription());
            buffer.setEnabled(authority.getEnabled());
            buffer.setIdAuthority(authority.getIdAuthority());
            authoritys.add(buffer);
        }
        usuarioWeb.setAuthoritys(authoritys);
        return usuarioWeb;
    }

    private List<MenuWeb> getMenuWebList(List<MenuWebmx> menuWebmxs) {
        List<MenuWeb> menuWebs = new ArrayList<MenuWeb>();
        MenuWeb menuWeb;
        for (MenuWebmx menuWebmx : menuWebmxs) {
            menuWeb = new MenuWeb();
            menuWeb.setDescripcion(menuWebmx.getDescripcion());
            menuWeb.setIcono(menuWebmx.getIcono());
            menuWeb.setIdAplicacion(menuWebmx.getAplicacionWebmx().getIdaplicacion());
            menuWeb.setIdMenuParent(menuWebmx.getMenuWebmx().getIdmenu());
            menuWeb.setIdmenu(menuWebmx.getIdmenu());
            menuWeb.setNombre(menuWebmx.getNombre());
            menuWeb.setOnClick(menuWebmx.getOnClick());
            menuWeb.setRuta(menuWebmx.getRuta());
            menuWeb.setSeparator(menuWebmx.getSeparator());
            menuWeb.setStatus(menuWebmx.getStatus());
            menuWebs.add(menuWeb);
        }
        return menuWebs;
    }
}
