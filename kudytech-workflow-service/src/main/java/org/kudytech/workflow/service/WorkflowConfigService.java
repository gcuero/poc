/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.model.Workflow;
import org.kudytech.workflow.model.WorkflowConfig;
import org.kudytech.workflow.model.WorkflowEvent;
import org.kudytech.workflow.model.WorkflowState;

/**
 *
 * @author gcuero
 */
public interface WorkflowConfigService {

    WorkflowConfig getWorkflowConfig(Workflow workflow, WorkflowEvent workflowEvent,
            WorkflowState workflowCurrentState, Boolean estatus) 
            throws GenericServiceException;
    
    WorkflowConfig getWorkflowConfig(Long idworkflow, String idworkflowEvent, 
            String idCurrentWorkflowState, Boolean estatus) throws GenericServiceException;
}
