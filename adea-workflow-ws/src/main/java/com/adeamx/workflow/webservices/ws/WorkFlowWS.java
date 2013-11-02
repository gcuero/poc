/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.webservices.ws;

import com.adeamx.workflow.domain.AbstractSimpleResponseMessageHybrid;
import com.adeamx.workflow.domain.AbstractSimpleResponseMessageHybridList;
import com.adeamx.workflow.domain.CodeMessageConstants;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.kudytech.core.AbstractDebug;
import org.kudytech.workflow.model.WorkflowCtl;
import org.kudytech.workflow.model.WorkflowState;
import org.kudytech.workflow.service.WorkflowService;
import org.kudytech.workflow.service.WorkflowStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author jaymzhck
 */
@WebService(
        targetNamespace = "http://ws.webservices.workflow.adeamx.com/",
        serviceName = "WorkFlowWS",
        portName = "WorkFlowWSPort")
public class WorkFlowWS extends AbstractDebug {

    @Autowired
    @Qualifier("workflowStateService")
    WorkflowStateService workflowStateService;
    @Autowired
    @Qualifier("workflowService")
    WorkflowService workflowService;

    @WebMethod(operationName = "getWorkflowState")
    public AbstractSimpleResponseMessageHybrid getWorkflowState(WorkflowCtl ctl) {
        AbstractSimpleResponseMessageHybrid<WorkflowState> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<WorkflowState>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowStateService.getWorkflowStateByIdWorkflowState(
                    ctl.getWorkflowCurrentState().getIdworkflowState()));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }

    @WebMethod(operationName = "getWorkflowNextState")
    public AbstractSimpleResponseMessageHybrid getWorkflowNextState(WorkflowCtl ctl) {
        AbstractSimpleResponseMessageHybrid<WorkflowState> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<WorkflowState>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowStateService.getWorkflowStateByIdWorkflowState(
                    ctl.getWorkflowCurrentState().getIdworkflowState()));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }

    @WebMethod(operationName = "canChangeWorkFlowSate")
    public AbstractSimpleResponseMessageHybrid canChangeWorkFlowSate(WorkflowCtl ctl) {
        AbstractSimpleResponseMessageHybrid<WorkflowState> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<WorkflowState>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowStateService.getWorkflowStateByIdWorkflowState(
                    ctl.getWorkflowCurrentState().getIdworkflowState()));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }

//    Boolean canTranscendObject(Long idReferencia, Long idObjecto,
//            String event, String autorithy) throws GenericServiceException;
    @WebMethod(operationName = "canTranscendObjectByIdReferenciaIdObjetoEventAuthority")
    public AbstractSimpleResponseMessageHybrid canTranscendObjectByIdReferenciaIdObjetoEventAuthority(
            Long idReferencia, Long idObjecto,
            String event, String autorithy) {
        AbstractSimpleResponseMessageHybrid<Boolean> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<Boolean>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowService.canTranscendObject(idReferencia, idObjecto, event, autorithy));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }

//    WorkflowState getNextState(Long idReferencia, Long idObjecto, String currentState,
//            String event, String autorithy) throws GenericServiceException;
    @WebMethod(operationName = "getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority")
    public AbstractSimpleResponseMessageHybrid getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority(
            Long idReferencia, Long idObjecto, String currentState,
            String event, String autorithy) {
        AbstractSimpleResponseMessageHybrid<WorkflowState> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<WorkflowState>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowService.getNextState(idReferencia, idObjecto,
                    currentState, event, autorithy));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }

//    WorkflowCtl doNextTranscendObject(Long idReferencia, Long idObjecto, String login, 
//            String autorithy) throws GenericServiceException;
    @WebMethod(operationName = "doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority")
    public AbstractSimpleResponseMessageHybrid doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority(
            Long idReferencia, Long idObjecto, String login,
            String autorithy) {
        AbstractSimpleResponseMessageHybrid<WorkflowCtl> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<WorkflowCtl>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowService.doNextTranscendObject(idReferencia, idObjecto, login, autorithy));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }

//   
//    WorkflowCtl transcendObject(Long idReferencia, Long idObjecto, String event, 
//            String login, String autorithy) throws GenericServiceException;
    @WebMethod(operationName = "transcendObjectByIdReferenciaIdObjetoEventLoginAuthority")
    public AbstractSimpleResponseMessageHybrid transcendObjectByIdReferenciaIdObjetoEventLoginAuthority(
            Long idReferencia, Long idObjecto, String event, 
            String login, String autorithy) {
        AbstractSimpleResponseMessageHybrid<WorkflowCtl> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<WorkflowCtl>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowService.transcendObject(idReferencia, idObjecto, 
                    event, login, autorithy));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }
    
//    WorkflowStateMap getWorkflowStateByObject(ModelIdProvider object) 
//            throws GenericServiceException;
    
//    WorkflowCtl doNextByObject(ModelIdProvider object, String login,
//            String autorithy) throws GenericServiceException;
    
//    WorkflowCtl doNextByObject(ModelIdProvider object, String login)
//            throws GenericServiceException;
    
    
//    WorkflowCtl doNextByIdReferenciaAndIdConfObjeto(Long idReferencia, 
//            Long idConfObjeto, String login) throws GenericServiceException;
    @WebMethod(operationName = "doNextByIdReferenciaAndIdConfObjetoLogin")
    public AbstractSimpleResponseMessageHybrid doNextByIdReferenciaAndIdConfObjetoLogin(
            Long idReferencia, 
            Long idConfObjeto, String login) {
        AbstractSimpleResponseMessageHybrid<WorkflowCtl> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<WorkflowCtl>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowService.doNextByIdReferenciaAndIdConfObjeto(
                    idReferencia, idConfObjeto, login));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }
    
//    Boolean canTranscendObject(ModelIdProvider object, String login, String event)
//            throws GenericServiceException;
//    
//    Boolean canDoNextObject(ModelIdProvider object, String login)
//            throws GenericServiceException;
//    
//    
//    Boolean canDoNextObject(Long idReferencia, Long idConfObjeto, String login)
//            throws GenericServiceException;
    @WebMethod(operationName = "canDoNextObjectByIdReferenciaAndIdConfObjetoLogin")
    public AbstractSimpleResponseMessageHybrid canDoNextObjectByIdReferenciaAndIdConfObjetoLogin(
            Long idReferencia, Long idConfObjeto, String login) {
        AbstractSimpleResponseMessageHybrid<Boolean> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<Boolean>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowService.canDoNextObject(idReferencia, idConfObjeto, login));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }
    
//    Long getIdConfObjeto(Class clazz) throws GenericServiceException;
//    
//    
//    Long getIdConfObjetoByClassName(String className) throws GenericServiceException;
    @WebMethod(operationName = "getIdConfObjetoByClassName")
    public AbstractSimpleResponseMessageHybrid getIdConfObjetoByClassName(
            String className) {
        AbstractSimpleResponseMessageHybrid<Long> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<Long>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowService.getIdConfObjetoByClassName(className));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }
    
    @WebMethod(operationName = "getListStateByName")
    public AbstractSimpleResponseMessageHybridList getListStateByName(
            String name) {
        AbstractSimpleResponseMessageHybridList<String> objectResponseMessage =
                new AbstractSimpleResponseMessageHybridList<String>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowStateService.getListStateByName(name));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }
    
//    Boolean canTranscendObjectByLogin(Long idReferencia, Long idObjeto, String login,
//            String event) throws GenericServiceException;
    @WebMethod(operationName = "canTranscendObjectByLogin")
    public AbstractSimpleResponseMessageHybrid canTranscendObjectByLogin(
            Long idReferencia, Long idObjecto, String event, String login) {
        AbstractSimpleResponseMessageHybrid<Boolean> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<Boolean>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowService.canTranscendObjectByLogin(idReferencia, 
                    idObjecto, login, event));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }
//
//    WorkflowCtl transcendObject(Long idReferencia, Long idConfObjeto,
//            String login, String event) throws GenericServiceException;
    @WebMethod(operationName = "transcendObjectByLogin")
    public AbstractSimpleResponseMessageHybrid transcendObjectByLogin(
            Long idReferencia, Long idObjecto, String event,  String login) {
        AbstractSimpleResponseMessageHybrid<WorkflowCtl> objectResponseMessage =
                new AbstractSimpleResponseMessageHybrid<WorkflowCtl>();
        try {
            objectResponseMessage.setObjectMessage(
                    this.workflowService.transcendObject(idReferencia, idObjecto, 
                    login, event));
            objectResponseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (Exception ex) {
            this.error(ex);
            objectResponseMessage.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            objectResponseMessage.setErrorMessage(ex.getMessage());
        } finally {
            return objectResponseMessage;
        }
    }
}
