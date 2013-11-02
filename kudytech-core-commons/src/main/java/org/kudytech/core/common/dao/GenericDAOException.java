/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.core.common.dao;

/**
 *
 * @author gcuero
 */
public class GenericDAOException extends Exception {

    public GenericDAOException() {
    }

    public GenericDAOException(String message) {
        super(message);
    }

    public GenericDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericDAOException(Throwable cause) {
        super(cause);
    }
}
