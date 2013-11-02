/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.model.WorkflowEvent;

/**
 *
 * @author gcuero
 */
public interface WorkflowEventService {

    WorkflowEvent getWorkflowEventById(String idWorkflowEvent) throws GenericServiceException;
}
