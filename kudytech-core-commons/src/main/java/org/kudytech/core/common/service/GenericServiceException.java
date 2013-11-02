/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.core.common.service;

/**
 *
 * @author gcuero
 */
public class GenericServiceException extends Exception {

    public GenericServiceException() {
    }

    public GenericServiceException(String message) {
        super(message);
    }

    public GenericServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericServiceException(Throwable cause) {
        super(cause);
    }
}
