/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.web.controller;

import com.adea.controller.AbstractSessionController;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.kudytech.web.service.IMenuService;
import org.primefaces.model.MenuModel;
import org.springframework.beans.factory.annotation.Value;

/**
 * Bean para el Menu dinamico
 *
 * @author gcuero
 */
@ManagedBean(name = "menuController")
@SessionScoped
public class MenuController extends AbstractSessionController {

    private MenuModel menuModel;
    @ManagedProperty(value = "#{menuService}")
    IMenuService menuService;
    String username;
    String terminos;
    @Value("${user.test}")
    String login = "workflow_admin";
    @Value("${app.id}")
    Integer applicationId = 48;

    /**
     * REcupera el binding de los menus asignados al usuario
     *
     * @return
     * @throws Exception
     */
    public MenuModel getMenuModel() throws Exception {
        if (this.menuModel == null) {
            this.menuModel = this.menuService.getMenuModelByPerfil(this.getUserLogged().getUsername(),
                    this.applicationId);
        }
        return this.menuModel;
    }

    public String getUserName() {
        return this.getUserLogged().getUsername();
    }

    public void setMenuModel(MenuModel menuModel) {
        this.menuModel = menuModel;
    }

    public IMenuService getMenuService() {
        return menuService;
    }

    public void setMenuService(IMenuService menuService) {
        this.menuService = menuService;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
}
