/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import java.util.List;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.model.WorkflowCtl;
import org.kudytech.workflow.model.WorkflowState;

/**
 *
 * @author gcuero
 */
public interface WorkflowStateService {

    WorkflowState getWorkflowNextState(WorkflowCtl ctl)throws GenericServiceException;
    
    WorkflowState getWorkflowStateByIdWorkflowState(String idWorkflowState) throws GenericServiceException;
    
    WorkflowState canChangeWorkFlowSate(WorkflowCtl ctl) throws GenericServiceException;
    
    List<String> getListStateByName(String name) throws GenericServiceException;
    
}
