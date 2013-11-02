/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.webservices.rest;

import com.adeamx.workflow.domain.CodeMessageConstants;
import com.adeamx.workflow.domain.RestResponseMessage;
import org.kudytech.workflow.model.WorkflowCtl;
import org.kudytech.workflow.service.WorkflowService;
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
public class WorkflowController extends AbstractRestController {

    @Autowired
    WorkflowService workflowService;

    @RequestMapping(value = "/rest/doNext/{login}/{idReferencia}/{idConfObjeto}",
    method = RequestMethod.GET)
    public ModelAndView doNext(
            @PathVariable("login") String login,
            @PathVariable("idReferencia") Long idReferencia,
            @PathVariable("idConfObjeto") Long idConfObjeto) {
        RestResponseMessage responseMessage = new RestResponseMessage();
        try {
            //            if (this.validateAndRegisterTransaction(
            //                    login, token, String.format(
            //                    MenuController.GET_MENU_BY_USER_TRANSACTION, login, token))) {
            WorkflowCtl workflowCtl =
                    this.workflowService.doNextByIdReferenciaAndIdConfObjeto(idReferencia,
                    idConfObjeto, login);
            responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
            responseMessage.setObjectMessage(workflowCtl);
            debug("Returing : " + workflowCtl.getWorkflowCurrentState().getIdworkflowState());
            return createResponse(ConfSistemaController.DATA_FIELD, responseMessage);
//            } else {
//                return createResponse(ConfSistemaController.ERROR_FIELD, 
//                        this.getInvalidTokenResponseMessage(login, token));
//            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Exception :::::  " + e);
            e.printStackTrace(System.out);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            String sMessage = "Error invoking doNext. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            String exceptionMessage = e.getMessage();
            if(e.getCause() != null ){
                exceptionMessage += e.getCause().getMessage();
            }
            responseMessage.setErrorMessage(String.format(sMessage, exceptionMessage));
            return createResponse(ConfSistemaController.ERROR_FIELD, responseMessage);
        }
    }

    @RequestMapping(value = "/rest/transcendObject/{login}/{event}/{idReferencia}/{idConfObjeto}",
    method = RequestMethod.GET)
    public ModelAndView transcendObject(
            @PathVariable("login") String login,
            @PathVariable("event") String event,
            @PathVariable("idReferencia") Long idReferencia,
            @PathVariable("idConfObjeto") Long idConfObjeto) {
        RestResponseMessage responseMessage = new RestResponseMessage();
        try {
            //            if (this.validateAndRegisterTransaction(
            //                    login, token, String.format(
            //                    MenuController.GET_MENU_BY_USER_TRANSACTION, login, token))) {
            WorkflowCtl workflowCtl =
                    this.workflowService.transcendObject(idReferencia, idConfObjeto, login, event);
            responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
            responseMessage.setObjectMessage(workflowCtl);
            debug("Returing : " + workflowCtl.getWorkflowCurrentState().getIdworkflowState());
            return createResponse(ConfSistemaController.DATA_FIELD, responseMessage);
//            } else {
//                return createResponse(ConfSistemaController.ERROR_FIELD, 
//                        this.getInvalidTokenResponseMessage(login, token));
//            }
        } catch (Exception e) {
            String sMessage = "Error invoking transcendObject. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            String exceptionMessage = e.getMessage();
            if(e.getCause() != null ){
                exceptionMessage += e.getCause().getMessage();
            }
            responseMessage.setErrorMessage(String.format(sMessage, exceptionMessage));
            return createResponse(ConfSistemaController.ERROR_FIELD, responseMessage);
        }
    }

    @RequestMapping(value = "/rest/getIdConfObjetoByClassName/{className}",
    method = RequestMethod.GET)
    public ModelAndView getIdConfObjetoByClassName(
            @PathVariable("className") String className) {
        RestResponseMessage responseMessage = new RestResponseMessage();
        try {
            //            if (this.validateAndRegisterTransaction(
            //                    login, token, String.format(
            //                    MenuController.GET_MENU_BY_USER_TRANSACTION, login, token))) {
            Long idConfObjetoByClassName = this.workflowService.getIdConfObjetoByClassName(className);

            responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
            responseMessage.setObjectMessage(idConfObjetoByClassName);
            debug("Returing : " + idConfObjetoByClassName);
            return createResponse(ConfSistemaController.DATA_FIELD, responseMessage);
//            } else {
//                return createResponse(ConfSistemaController.ERROR_FIELD, 
//                        this.getInvalidTokenResponseMessage(login, token));
//            }
        } catch (Exception e) {
            String sMessage = "Error invoking getMenuByUser. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            
            String exceptionMessage = e.getMessage();
            if(e.getCause() != null ){
                exceptionMessage += e.getCause().getMessage();
            }
            responseMessage.setErrorMessage(String.format(sMessage, exceptionMessage));
            return createResponse(ConfSistemaController.ERROR_FIELD, responseMessage);
        }
    }
    
    @RequestMapping(value = "/rest/testSayHello/{text}",
    method = RequestMethod.GET)
    public ModelAndView testSayHello(
            @PathVariable("text") String text) {
        RestResponseMessage responseMessage = new RestResponseMessage();
        try {
            //            if (this.validateAndRegisterTransaction(
            //                    login, token, String.format(
            //                    MenuController.GET_MENU_BY_USER_TRANSACTION, login, token))) {
//            Long idConfObjetoByClassName = this.workflowService.getIdConfObjetoByClassName(text);

            responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
            responseMessage.setObjectMessage("Hi... Hello :::: " + text);
            debug("Returing : " + "Hi... Hello :::: " + text);
            return createResponse(ConfSistemaController.DATA_FIELD, responseMessage);
//            } else {
//                return createResponse(ConfSistemaController.ERROR_FIELD, 
//                        this.getInvalidTokenResponseMessage(login, token));
//            }
        } catch (Exception e) {
            String sMessage = "Error invoking getMenuByUser. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            String exceptionMessage = e.getMessage();
            if(e.getCause() != null ){
                exceptionMessage += e.getCause().getMessage();
            }
            responseMessage.setErrorMessage(String.format(sMessage, exceptionMessage));
            return createResponse(ConfSistemaController.ERROR_FIELD, responseMessage);
        }
    }
}
