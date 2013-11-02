/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.adeamx.webmex.service.impl;

import java.util.List;
import org.kudytech.adeamx.webmex.client.MenuResponseMessage;
import org.kudytech.adeamx.webmex.domain.MenuWeb;
import org.kudytech.adeamx.webmex.client.SeguridadWS;
import org.kudytech.adeamx.webmex.client.SeguridadWSService;
import org.kudytech.adeamx.webmex.domain.UsuarioWeb;
import org.kudytech.adeamx.webmex.service.SecurityClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("securityClientService")
public class SecurityClientServiceImpl implements SecurityClientService {

    @Autowired
    SeguridadWSService seguridadWSService;

    public List<MenuWeb> getMenuByUser(String login, int idAplicacion)
            throws Exception {
        SeguridadWS port = this.getSeguridadWS();
        MenuResponseMessage menuByUser = port.getMenuByUser(login, idAplicacion);
        return menuByUser.getApplicationMenu();
    }

    public List<MenuWeb> getSubMenuByUser(String login, int idAplicacion,
            double idParent) throws Exception {
        SeguridadWS port = this.getSeguridadWS();
        MenuResponseMessage menuByUser =
                port.getSubMenuByUser(login, idAplicacion, idParent);
        return menuByUser.getApplicationMenu();
    }

    public UsuarioWeb loadUsuarioWebByLogin(String login) 
            throws Exception {
        SeguridadWS port = this.getSeguridadWS();
        return port.getUsuarioWebByLogin(login).getUsuarioWeb();
    }

    private SeguridadWS getSeguridadWS() {
        return this.seguridadWSService.getSeguridadWSPort();
    }
}
