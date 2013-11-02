/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.web.service;

import org.primefaces.model.MenuModel;

/**
 *
 * @author gcuero
 */
public interface IMenuService {

    /**
     * Recupera el panel de menu, en base al perfil del usuario
     *
     * @param perfil
     * @return MenuModel
     * @throws Exception
     */
    MenuModel getMenuModelByPerfil(String login, int idAplicacion) throws Exception;
}
