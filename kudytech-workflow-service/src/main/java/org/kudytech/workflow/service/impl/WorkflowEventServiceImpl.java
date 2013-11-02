/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service.impl;

import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.dao.WorkflowEventDAO;
import org.kudytech.workflow.model.WorkflowEvent;
import org.kudytech.workflow.service.WorkflowEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("workflowEventService")
public class WorkflowEventServiceImpl extends AbstractDebug implements WorkflowEventService {

    public static final String WORKFLOW_EVENT_NOT_REGISTRED_MESSAGE =
            "No existe un registro en WORKFLOW_EVENT con idWorkflowEvent[%1$s].";
    @Autowired
    WorkflowEventDAO workflowEventDAO;

    public WorkflowEvent getWorkflowEventById(String idWorkflowEvent) 
            throws GenericServiceException {
        try {
            return this.workflowEventDAO.find(idWorkflowEvent);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }
}
