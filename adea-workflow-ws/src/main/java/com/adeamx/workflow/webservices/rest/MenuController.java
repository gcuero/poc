/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.webservices.rest;

import com.adeamx.workflow.domain.CodeMessageConstants;
import com.adeamx.workflow.domain.MobileMenu;
import com.adeamx.workflow.domain.RestResponseMessage;
import java.util.ArrayList;
import java.util.List;
import org.kudytech.adeamx.mexweb.model.MenuWebmx;
import org.kudytech.webmx.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author gcuero
 */
@Controller
public class MenuController extends AbstractRestController {

    public static final String GET_MENU_BY_USER_TRANSACTION =
            "Obtiene menu de usuario para el usuario [%1$s] y el token [%2$s].";
    @Autowired
    @Qualifier("menuService")
    MenuService menuService;

    @RequestMapping(value = "/rest/getMenuByUser/{login}/{token}/{idAplicacion}", 
            method = RequestMethod.GET)
    public ModelAndView getMenuByUser(@PathVariable("login") String login,
            @PathVariable("token") String token,
            @PathVariable("idAplicacion") int idAplicacion) {
        RestResponseMessage responseMessage = new RestResponseMessage();
        try {
            if (this.validateAndRegisterTransaction(
                    login, token, String.format(
                    MenuController.GET_MENU_BY_USER_TRANSACTION, login, token))) {
                List<MenuWebmx> applicationMenu = 
                        this.menuService.getApplicationMenu(login, idAplicacion);
                responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
                responseMessage.setObjectMessage(this.getMobileMenu(applicationMenu));
                debug("Returing : " + applicationMenu.size());
                return createResponse(ConfSistemaController.DATA_FIELD, responseMessage);
            } else {
                return createResponse(ConfSistemaController.ERROR_FIELD, 
                        this.getInvalidTokenResponseMessage(login, token));
            }
        } catch (Exception e) {
            String sMessage = "Error invoking getMenuByUser. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            responseMessage.setErrorMessage(String.format(sMessage, e.toString()));
            return createResponse(ConfSistemaController.ERROR_FIELD, responseMessage);
        }
    }

    private List<MobileMenu> getMobileMenu(List<MenuWebmx> menuWebmxs) {
        List<MobileMenu> mobileMenus = new ArrayList<MobileMenu>();
        MobileMenu buffer;
        for (MenuWebmx menuWebmx : menuWebmxs) {
            buffer = new MobileMenu();
            buffer.setNombre(menuWebmx.getNombre());
            buffer.setDescripcion(menuWebmx.getDescripcion());
            mobileMenus.add(buffer);
        }
        return mobileMenus;
    }
}
