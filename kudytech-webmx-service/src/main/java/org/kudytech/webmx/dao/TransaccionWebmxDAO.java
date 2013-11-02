/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.dao;

import java.util.Date;
import org.kudytech.adeamx.mexweb.model.TransaccionWebmx;
import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.GenericDAOException;

/**
 *
 * @author gcuero
 */
public interface TransaccionWebmxDAO extends GenericDAO<TransaccionWebmx, Double> {
    
    void saveTransaccionWebmx(String login, Date fechaLogin, String detalle, 
            int idAplicacion, String transaccion) throws GenericDAOException;
}
