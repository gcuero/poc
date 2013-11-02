/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service.impl;

import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.dao.WorkflowSecurityDAO;
import org.kudytech.workflow.model.WorkflowSecurity;
import org.kudytech.workflow.model.WorkflowSecurityPK;
import org.kudytech.workflow.service.WorkflowSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("workflowSecurityService")
public class WorkflowSecurityServiceImpl extends AbstractDebug implements WorkflowSecurityService {

    @Autowired
    WorkflowSecurityDAO workflowSecurityDAO;

    public WorkflowSecurity getWorkflowSecurityById(WorkflowSecurityPK workflowSecurityPK)
            throws GenericServiceException {
        try {
            return this.workflowSecurityDAO.find(workflowSecurityPK);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public WorkflowSecurity getWorkflowSecurityById(String idauthority, long idworkflowConfig)
            throws GenericServiceException {
        WorkflowSecurityPK pK = new WorkflowSecurityPK();
        pK.setIdauthority(idauthority);
        pK.setIdworkflowConfig(idworkflowConfig);
        return this.getWorkflowSecurityById(pK);
    }
}
