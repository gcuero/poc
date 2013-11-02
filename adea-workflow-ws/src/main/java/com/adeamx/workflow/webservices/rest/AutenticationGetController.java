/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.webservices.rest;

import com.adeamx.workflow.domain.CodeMessageConstants;
import com.adeamx.workflow.domain.RestResponseMessage;
import com.adeamx.workflow.web.utils.StringUtils;
import org.kudytech.mobile.security.domain.UserDetail;
import org.kudytech.mobile.security.service.MobileAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author gcuero
 */
@Controller
public class AutenticationGetController extends AbstractRestController {

    @Autowired
    MobileAuthenticationService mobileAuthenticationService;

    @RequestMapping(value = "/rest/loginGet/{login}/{password}/{idAplicacion}", 
            method = RequestMethod.GET)
    public ModelAndView login(@PathVariable("login") String login,
            @PathVariable("password") String password,
            @PathVariable("idAplicacion") int idAplicacion) {
        debug("User :: " + login);
        debug("Password :: " + password);
        debug("IdAplicacion :: " + idAplicacion);
        RestResponseMessage responseMessage = new RestResponseMessage();
        UserDetail userDetail;
        /* validate fund Id parameter */
        if (StringUtils.isEmpty(login)) {
            String sMessage = "Error invoking login - Invalid login parameter";
            responseMessage.setCodeMessage(CodeMessageConstants.PARAMETER_FAILED_CODE);
            responseMessage.setErrorMessage(sMessage);
            return createResponse(AutenticationGetController.ERROR_FIELD, responseMessage);
        }

        if (StringUtils.isEmpty(password)) {
            String sMessage = "Error invoking password - Invalid password parameter";
            responseMessage.setCodeMessage(CodeMessageConstants.PARAMETER_FAILED_CODE);
            responseMessage.setErrorMessage(sMessage);
            return createResponse(AutenticationGetController.ERROR_FIELD, responseMessage);
        }
        try {
            userDetail = this.mobileAuthenticationService.login(login, password, idAplicacion);
            responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
            responseMessage.setObjectMessage(userDetail);
            debug("Returing login: " + userDetail);
            return createResponse(AutenticationGetController.DATA_FIELD, responseMessage);
        } catch (Exception e) {
            error(e);
            String sMessage = "Error invoking login. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            responseMessage.setErrorMessage(String.format(sMessage, e.getMessage()));
            return createResponse(AutenticationGetController.ERROR_FIELD, responseMessage);
        }
    }
}
