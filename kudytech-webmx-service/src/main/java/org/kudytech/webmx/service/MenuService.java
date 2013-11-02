/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.service;

import java.util.List;
import org.kudytech.adeamx.mexweb.model.MenuWebmx;
import org.kudytech.core.common.service.GenericServiceException;

/**
 *
 * @author gcuero
 */
public interface MenuService {

    List<MenuWebmx> getApplicationMenu(String login, int idAplicacion) throws GenericServiceException;

    List<MenuWebmx> getApplicationSubMenu(double idParent, String login,
            int idAplicacion) throws GenericServiceException;
}
