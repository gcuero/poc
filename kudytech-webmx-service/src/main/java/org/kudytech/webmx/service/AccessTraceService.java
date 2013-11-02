/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.service;

import java.util.Date;
import org.kudytech.adeamx.mexweb.model.AccesoWebmx;
import org.kudytech.core.common.service.GenericServiceException;

/**
 *
 * @author gcuero
 */
public interface AccessTraceService {

    AccesoWebmx registerAccesoWebmx(String login, Date fechaLogin, String ipAddress)
            throws GenericServiceException;

    void registerTransaction(String login, Date fechaLogin, String detalle,
            int idAplicacion, String transaccion) throws GenericServiceException;
}
