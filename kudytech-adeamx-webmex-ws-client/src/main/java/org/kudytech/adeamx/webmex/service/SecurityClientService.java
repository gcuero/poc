/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.adeamx.webmex.service;

import java.util.List;
import org.kudytech.adeamx.webmex.domain.MenuWeb;
import org.kudytech.adeamx.webmex.domain.UsuarioWeb;

/**
 *
 * @author gcuero
 */
public interface SecurityClientService {

    /**
     *
     * @param login
     * @param idAplicacion
     * @param wsUrl
     * @return
     * @throws Exception
     */
    List<MenuWeb> getMenuByUser(String login, int idAplicacion) throws Exception;

    /**
     *
     * @param login
     * @param idAplicacion
     * @param idParent
     * @param wsUrl
     * @return
     * @throws Exception
     */
    List<MenuWeb> getSubMenuByUser(String login, int idAplicacion, double idParent) throws Exception;

    /**
     *
     * @param login
     * @param wsUrl
     * @return
     * @throws Exception
     */
    UsuarioWeb loadUsuarioWebByLogin(String login) throws Exception;
}
