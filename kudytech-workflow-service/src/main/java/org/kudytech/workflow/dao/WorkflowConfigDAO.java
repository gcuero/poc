/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao;

import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.workflow.model.Workflow;
import org.kudytech.workflow.model.WorkflowConfig;
import org.kudytech.workflow.model.WorkflowEvent;
import org.kudytech.workflow.model.WorkflowState;

/**
 *
 * @author gcuero
 */
public interface WorkflowConfigDAO extends GenericDAO<WorkflowConfig, Long> {

    WorkflowConfig getWorkflowConfig(Workflow workflow, WorkflowEvent workflowEvent,
            WorkflowState workflowCurrentState, Boolean estatus) throws GenericDAOException;
    
    WorkflowConfig getWorkflowConfig(Long idworkflow, String idworkflowEvent,
            String idworkflowState, Boolean estatus) throws GenericDAOException;
}
