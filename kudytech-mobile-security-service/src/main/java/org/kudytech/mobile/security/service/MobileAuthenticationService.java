/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.mobile.security.service;

import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.mobile.security.domain.UserDetail;

/**
 *
 * @author gcuero
 */
public interface MobileAuthenticationService {

    UserDetail login(String login, String password, int idAplicacion) throws GenericServiceException;

    boolean validateUserAndToken(String login, String token) throws GenericServiceException;

    void registerTransaction(String login, String token, String transaction) throws GenericServiceException;

    void closeMobileSession(String login, String token) throws GenericServiceException;
}
