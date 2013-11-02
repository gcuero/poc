/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.dao;

import java.util.List;
import org.kudytech.adeamx.mexweb.model.MenuWebmx;
import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.GenericDAOException;

/**
 *
 * @author gcuero
 */
public interface MenuDAO extends GenericDAO<MenuWebmx, Double> {

    List<MenuWebmx> getApplicationMenu(String login, int idAplicacion)
            throws GenericDAOException;

    List<MenuWebmx> getApplicationSubMenu(double idParent, String login,
            int idAplicacion) throws GenericDAOException;
}
