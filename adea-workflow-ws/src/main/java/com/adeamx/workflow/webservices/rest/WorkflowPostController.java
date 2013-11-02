/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.webservices.rest;

import com.adeamx.workflow.domain.CodeMessageConstants;
import com.adeamx.workflow.domain.RestResponseMessage;
import com.adeamx.workflow.domain.rest.WorkflowDoNextRequest;
import com.adeamx.workflow.domain.rest.WorkflowTrascendObjectRequest;
import org.kudytech.workflow.model.WorkflowCtl;
import org.kudytech.workflow.service.WorkflowService;
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
@RequestMapping("/rest/workflow")
public class WorkflowPostController extends AbstractRestController {

    @Autowired
    WorkflowService workflowService;

    @RequestMapping(method = RequestMethod.POST, value = "doNext")
    @ResponseBody
    public ModelAndView doNext(@RequestBody final WorkflowDoNextRequest request) {
        RestResponseMessage responseMessage = new RestResponseMessage();
        debug("Login :: " + request.getLogin());
        try {
//            if (this.validateAndRegisterTransaction(
//                    request.getLogin(), request.getToken(), String.format(
//                    SolicitudController.GET_SOLICITUD_COUNT_TRANSACTION,
//                    request.getLogin(), request.getToken()))) {
            WorkflowCtl workflowCtl =
                    this.workflowService.doNextByIdReferenciaAndIdConfObjeto(request.getIdReferencia(),
                    request.getIdConfObjeto(), request.getLogin());
            responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
            responseMessage.setObjectMessage(workflowCtl);
            debug("Returing : " + workflowCtl.getWorkflowCurrentState().getIdworkflowState());
            return createResponse(ConfSistemaController.DATA_FIELD, responseMessage);
//            } else {
//                return createResponse(ConfSistemaController.ERROR_FIELD,
//                        this.getInvalidTokenResponseMessage(request.getLogin(), request.getToken()));
//            }
        } catch (Exception e) {
            error(e);
            String sMessage = "Error invoking getOrdenCompraAllCount. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            responseMessage.setErrorMessage(String.format(sMessage, e.toString()));
            return createResponse(ConfSistemaController.ERROR_FIELD, responseMessage);
        }
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "trascendObject")
    @ResponseBody
    public ModelAndView trascendObject(@RequestBody final WorkflowTrascendObjectRequest request) {
        RestResponseMessage responseMessage = new RestResponseMessage();
        debug("Login :: " + request.getLogin());
        try {
//            if (this.validateAndRegisterTransaction(
//                    request.getLogin(), request.getToken(), String.format(
//                    SolicitudController.GET_SOLICITUD_COUNT_TRANSACTION,
//                    request.getLogin(), request.getToken()))) {
            WorkflowCtl workflowCtl =
                    this.workflowService.transcendObject(request.getIdReferencia(),
                    request.getIdConfObjeto(), request.getLogin(), request.getEvent());
            responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
            responseMessage.setObjectMessage(workflowCtl);
            debug("Returing : " + workflowCtl.getWorkflowCurrentState().getIdworkflowState());
            return createResponse(ConfSistemaController.DATA_FIELD, responseMessage);
//            } else {
//                return createResponse(ConfSistemaController.ERROR_FIELD,
//                        this.getInvalidTokenResponseMessage(request.getLogin(), request.getToken()));
//            }
        } catch (Exception e) {
            error(e);
            String sMessage = "Error invoking getOrdenCompraAllCount. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            responseMessage.setErrorMessage(String.format(sMessage, e.toString()));
            return createResponse(ConfSistemaController.ERROR_FIELD, responseMessage);
        }
    }
}
