/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service.impl;

import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.dao.WorkflowConfigDAO;
import org.kudytech.workflow.model.Workflow;
import org.kudytech.workflow.model.WorkflowConfig;
import org.kudytech.workflow.model.WorkflowEvent;
import org.kudytech.workflow.model.WorkflowState;
import org.kudytech.workflow.service.WorkflowConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("workflowConfigService")
public class WorkflowConfigServiceImpl extends AbstractDebug implements WorkflowConfigService {
    
    public static final String WORKFLOW_CONFIG_NOT_REGISTRED_MESSAGE =
            "El WORKFLOW_CONFIG con idWorkflow=[%1$s] - event[%2$s] - currentSate[%3$s], "
            + "aún no ha sido registrado previamente.";

    @Autowired
    WorkflowConfigDAO workflowConfigDAO;

    public WorkflowConfig getWorkflowConfig(Workflow workflow, WorkflowEvent workflowEvent,
            WorkflowState workflowCurrentState, Boolean estatus) throws GenericServiceException {
        try {
            return this.workflowConfigDAO.getWorkflowConfig(workflow, workflowEvent,
                    workflowCurrentState, estatus);
        } catch (GenericDAOException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public WorkflowConfig getWorkflowConfig(Long idworkflow, String idworkflowEvent, 
            String idCurrentWorkflowState, Boolean estatus) throws GenericServiceException {
        try {
            return this.workflowConfigDAO.getWorkflowConfig(idworkflow, 
                    idworkflowEvent, idCurrentWorkflowState, estatus);
        } catch (GenericDAOException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }
}
