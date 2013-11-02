/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.service.impl;

import java.util.Date;
import org.kudytech.adeamx.mexweb.model.AccesoWebmx;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.webmx.dao.AccesoWebmxDAO;
import org.kudytech.webmx.dao.TransaccionWebmxDAO;
import org.kudytech.webmx.service.AccessTraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("accessTraceService")
public class AccessTraceServiceImpl extends AbstractDebug implements AccessTraceService {

    @Autowired
    AccesoWebmxDAO accesoWebmxDAO;
    @Autowired
    TransaccionWebmxDAO transaccionWebmxDAO;

    public AccesoWebmx registerAccesoWebmx(String login, Date fechaLogin, String ipAddress)
            throws GenericServiceException {
        try {
            return this.accesoWebmxDAO.saveAccesoWebmx(login, fechaLogin, ipAddress);
        } catch (GenericDAOException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public void registerTransaction(String login, Date fechaLogin, String detalle, 
            int idAplicacion, String transaccion) throws GenericServiceException {
        try {
            this.transaccionWebmxDAO.saveTransaccionWebmx(login, fechaLogin, detalle, 
                    idAplicacion, transaccion);
        } catch (GenericDAOException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }
}
