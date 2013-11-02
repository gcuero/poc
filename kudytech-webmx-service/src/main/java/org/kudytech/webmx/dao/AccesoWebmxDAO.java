/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.dao;

import java.util.Date;
import org.kudytech.adeamx.mexweb.model.AccesoWebmx;
import org.kudytech.adeamx.mexweb.model.AccesoWebmxPK;
import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.GenericDAOException;

/**
 *
 * @author gcuero
 */
public interface AccesoWebmxDAO extends GenericDAO<AccesoWebmx, AccesoWebmxPK> {

    AccesoWebmx saveAccesoWebmx(String login, Date fechaLogin, String ipAddress) throws GenericDAOException;
}
