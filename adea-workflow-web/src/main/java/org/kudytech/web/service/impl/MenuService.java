/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.web.service.impl;

import java.util.List;
import org.apache.log4j.Logger;
import org.kudytech.adeamx.webmex.domain.MenuWeb;
import org.kudytech.adeamx.webmex.service.SecurityClientService;
import org.kudytech.web.service.IMenuService;
import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;
import org.primefaces.model.DefaultMenuModel;
import org.primefaces.model.MenuModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gca
 */
@Service("menuService")
public class MenuService implements IMenuService {

    private static final Logger LOGGER = Logger.getLogger(MenuService.class);
    @Autowired
    SecurityClientService securityClientService;

    @Override
    public MenuModel getMenuModelByPerfil(String login, int idAplicacion)
            throws Exception {
        MenuModel menuModel = new DefaultMenuModel();
        Submenu submenu;
        LOGGER.debug("Entre al menu...");
        List<MenuWeb> menuByUser = this.securityClientService.getMenuByUser(
                login, idAplicacion);
        for (MenuWeb menuWeb : menuByUser) {
            submenu = new Submenu();
            submenu.setLabel(menuWeb.getNombre());
            LOGGER.debug("Entre al menu... " + menuWeb.getNombre());
            List<MenuWeb> subMenuByUser =
                    this.securityClientService.getSubMenuByUser(login, idAplicacion,
                    menuWeb.getIdmenu());
            for (MenuWeb sub : subMenuByUser) {
                LOGGER.debug("Entre al submenu... " + sub.getNombre() + " ["
                        + sub.getRuta() + "]");
                MenuItem item = new MenuItem();
                item.setValue(sub.getNombre());
                item.setUrl(sub.getRuta());
                submenu.getChildren().add(item);
            }
            menuModel.addSubmenu(submenu);
        }
        return menuModel;
    }
}
