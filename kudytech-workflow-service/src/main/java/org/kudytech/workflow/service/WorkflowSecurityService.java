/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.model.WorkflowSecurity;
import org.kudytech.workflow.model.WorkflowSecurityPK;

/**
 *
 * @author gcuero
 */
public interface WorkflowSecurityService {

    WorkflowSecurity getWorkflowSecurityById(WorkflowSecurityPK workflowSecurityPK)
            throws GenericServiceException;

    WorkflowSecurity getWorkflowSecurityById(String idauthority, long idworkflowConfig)
            throws GenericServiceException;
}
