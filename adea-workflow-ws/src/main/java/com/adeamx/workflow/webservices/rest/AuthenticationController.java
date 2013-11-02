/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.webservices.rest;

import com.adeamx.workflow.domain.CodeMessageConstants;
import com.adeamx.workflow.domain.RestResponseMessage;
import com.adeamx.workflow.domain.rest.LoginRequest;
import com.adeamx.workflow.web.utils.StringUtils;
import org.kudytech.mobile.security.domain.UserDetail;
import org.kudytech.mobile.security.service.MobileAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author gcuero
 */
@Controller
@RequestMapping("/rest")
public class AuthenticationController extends AbstractRestController {

    @Autowired
    MobileAuthenticationService mobileAuthenticationService;

    @RequestMapping(method = RequestMethod.POST, value = "login")
    @ResponseBody
    public ModelAndView login(@RequestBody final LoginRequest loginRequest) {
        debug("User :: " + loginRequest.getLogin());
        debug("Password :: " + loginRequest.getPassword());
        debug("IdAplicacion :: " + loginRequest.getIdAplicacion());
        RestResponseMessage responseMessage = new RestResponseMessage();
        UserDetail userDetail;
        /* validate fund Id parameter */
        if (StringUtils.isEmpty(loginRequest.getLogin())) {
            String sMessage = "Error invoking login - Invalid login parameter";
            responseMessage.setCodeMessage(CodeMessageConstants.PARAMETER_FAILED_CODE);
            responseMessage.setErrorMessage(sMessage);
            return createResponse(AutenticationGetController.ERROR_FIELD, responseMessage);
        }

        if (StringUtils.isEmpty(loginRequest.getPassword())) {
            String sMessage = "Error invoking password - Invalid password parameter";
            responseMessage.setCodeMessage(CodeMessageConstants.PARAMETER_FAILED_CODE);
            responseMessage.setErrorMessage(sMessage);
            return createResponse(AutenticationGetController.ERROR_FIELD, responseMessage);
        }
        try {
            userDetail = this.mobileAuthenticationService.login(loginRequest.getLogin(),
                    loginRequest.getPassword(), loginRequest.getIdAplicacion());
            if (userDetail != null) {
                responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
                responseMessage.setObjectMessage(this.getUserDetail(userDetail));
                debug("Returing login: " + userDetail);
                return createResponse(AutenticationGetController.DATA_FIELD, responseMessage);
            } else {
                responseMessage = new RestResponseMessage();
                responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
                responseMessage.setErrorMessage("Usuario o Password incorrectos.");
                return createResponse(AutenticationGetController.ERROR_FIELD, responseMessage);
            }
        } catch (Exception e) {
            error(e);
            String sMessage = "Error invoking login. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            responseMessage.setErrorMessage(String.format(sMessage, e.getMessage()));
            return createResponse(AutenticationGetController.ERROR_FIELD, responseMessage);
        }
    }

    private com.adeamx.workflow.domain.UserDetail getUserDetail(UserDetail userDetail) {
        com.adeamx.workflow.domain.UserDetail ud = 
                new com.adeamx.workflow.domain.UserDetail();
        ud.setEmail(userDetail.getEmail());
        ud.setFechaUltimoAcceso(userDetail.getFechaUltimoAcceso());
        ud.setLogin(userDetail.getLogin());
        ud.setNombre(userDetail.getNombre());
        ud.setToken(userDetail.getToken());
        return ud;
    }
}
