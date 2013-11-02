/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.dao;

import org.kudytech.adeamx.mexweb.model.UsuarioWebmx;
import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.GenericDAOException;

/**
 *
 * @author gcuero
 */
public interface UsuarioWebmxDAO extends GenericDAO<UsuarioWebmx, String> {

    /**
     *
     * @param login
     * @param password
     * @param idAplicacion
     * @return
     * @throws GenericDAOException
     */
    UsuarioWebmx getUsuarioWebmxByLogin(String login, String password, int idAplicacion) throws GenericDAOException;
}
