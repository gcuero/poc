/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.webservices.rest;

import com.adeamx.workflow.domain.CodeMessageConstants;
import com.adeamx.workflow.domain.RestResponseMessage;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.mobile.security.service.MobileAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 *
 * @author gcuero
 */
public class AbstractRestController extends AbstractDebug {

    private static final RestResponseMessage INVALID_TOKEN_RESPONSE_MESSAGE = new RestResponseMessage();
    private static final String INVALID_TOKEN_MESSAGE =
            "El token de la sesión para el usuario [%1$s] y el token [%2$s] no es válido.";
    protected static final String DATA_FIELD = "data";
    protected static final String ERROR_FIELD = "error";
    @Autowired
    @Qualifier("mobileAuthenticationService")
    MobileAuthenticationService mobileAuthenticationService;
    @Autowired
    private View jasonView;

    /**
     * Create an REST response.
     *
     * @param sMessage the s message
     * @return the model and view
     */
    protected ModelAndView createResponse(String type, RestResponseMessage sMessage) {
        return new ModelAndView(this.jasonView, type, sMessage);
    }

    protected boolean validateAndRegisterTransaction(
            String login, String token, String transaction) throws GenericServiceException {
        try {
            if (this.mobileAuthenticationService.validateUserAndToken(login, token)) {
                this.mobileAuthenticationService.registerTransaction(login, token, transaction);
                return Boolean.TRUE;
            } else {
                this.mobileAuthenticationService.closeMobileSession(login, token);
                return Boolean.FALSE;
            }
        } catch (GenericServiceException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    protected synchronized RestResponseMessage getInvalidTokenResponseMessage(
            String login, String token) {
        AbstractRestController.INVALID_TOKEN_RESPONSE_MESSAGE.setErrorMessage(
                String.format(AbstractRestController.INVALID_TOKEN_MESSAGE, login, token));
        AbstractRestController.INVALID_TOKEN_RESPONSE_MESSAGE.setCodeMessage(
                CodeMessageConstants.TOKEN_SESSION_TIME_OUT_CODE);
        return AbstractRestController.INVALID_TOKEN_RESPONSE_MESSAGE;
    }
}
