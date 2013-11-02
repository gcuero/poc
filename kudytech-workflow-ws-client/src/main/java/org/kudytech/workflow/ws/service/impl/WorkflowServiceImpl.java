/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.ws.service.impl;

import java.util.List;
import org.kudytech.workflow.ws.client.WorkFlowWS;
import org.kudytech.workflow.ws.client.WorkFlowWSService;
import org.kudytech.workflow.ws.domain.Workflow;
import org.kudytech.workflow.ws.domain.WorkflowCtl;
import org.kudytech.workflow.ws.domain.WorkflowState;
import org.kudytech.workflow.ws.service.WorkflowService;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybrid;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybridList;
import org.kudytech.ws.utils.ResponseMessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("workflowService")
public class WorkflowServiceImpl implements WorkflowService {

    @Autowired
    WorkFlowWSService workFlowWSService;

    public Workflow getWorkflowById(Long idWorkFlow) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean canTranscendObject(Long idReferencia, Long idObjecto,
            String event, String autorithy) throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh =
                this.getWorkflowWS().canTranscendObjectByIdReferenciaIdObjetoEventAuthority(
                idReferencia, idObjecto, event, autorithy);
        return (Boolean) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public WorkflowState getNextState(Long idReferencia, Long idObjecto,
            String currentState, String event, String autorithy)
            throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh =
                this.getWorkflowWS().getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority(
                idReferencia, idObjecto, currentState, event, autorithy);
        return (WorkflowState) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public WorkflowCtl doNextTranscendObject(Long idReferencia, Long idObjecto,
            String login, String autorithy) throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = this.getWorkflowWS().
                doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority(
                idReferencia, idObjecto, login, autorithy);
        return (WorkflowCtl) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public WorkflowCtl transcendObject(Long idReferencia, Long idObjecto,
            String event, String login, String autorithy) throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = this.getWorkflowWS().
                transcendObjectByIdReferenciaIdObjetoEventLoginAuthority(
                idReferencia, idObjecto, event, login, autorithy);
        return  (WorkflowCtl) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public WorkflowCtl doNextByIdReferenciaAndIdConfObjeto(Long idReferencia,
            Long idConfObjeto, String login) throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWorkflowWS().doNextByIdReferenciaAndIdConfObjetoLogin(
                idReferencia, idConfObjeto, login);
        return  (WorkflowCtl) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public Boolean canDoNextObject(Long idReferencia, Long idConfObjeto,
            String login) throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWorkflowWS().canDoNextObjectByIdReferenciaAndIdConfObjetoLogin(
                idReferencia, idConfObjeto, login);
        return  (Boolean) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public Long getIdConfObjeto(Class clazz) throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWorkflowWS().getIdConfObjetoByClassName(clazz.getSimpleName());
        return (Long) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public Long getIdConfObjetoByClassName(String className) throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWorkflowWS().getIdConfObjetoByClassName(className);
        return (Long) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    private WorkFlowWS getWorkflowWS() {
        return this.workFlowWSService.getWorkFlowWSPort();
    }

    public List<String> getListStateByName(String name) throws Exception {
        AbstractSimpleResponseMessageHybridList asrmhl = 
                this.getWorkflowWS().getListStateByName(name);
        return (List<String>) ResponseMessageUtils.processResponseMessageHybrid(asrmhl);
    }

    public Boolean canTranscendObjectByLogin(Long idReferencia, Long idObjeto, 
            String login, String event) throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWorkflowWS().canTranscendObjectByLogin(idObjeto, idObjeto, 
                login, login);
        return  (Boolean) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public WorkflowCtl transcendObject(Long idReferencia, Long idConfObjeto, 
            String login, String event) throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWorkflowWS().transcendObjectByLogin(idReferencia, idReferencia, 
                login, login);
        return  (WorkflowCtl) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }
}
