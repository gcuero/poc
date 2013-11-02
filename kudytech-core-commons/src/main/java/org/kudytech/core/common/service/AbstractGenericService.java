/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.core.common.service;

import org.kudytech.core.AbstractDebug;

/**
 *
 * @author gcuero
 */
public class AbstractGenericService extends AbstractDebug {

    protected GenericServiceException getGenericException(Throwable t) {
        return this.getGenericException(null, t);
    }

    protected GenericServiceException getGenericException(String message, Throwable t) {
        GenericServiceException genericServiceException = new GenericServiceException(message, t);
        return genericServiceException;
    }
}
