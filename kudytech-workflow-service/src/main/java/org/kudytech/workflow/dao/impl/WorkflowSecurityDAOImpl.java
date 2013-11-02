/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao.impl;

import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.workflow.dao.WorkflowSecurityDAO;
import org.kudytech.workflow.model.WorkflowSecurity;
import org.kudytech.workflow.model.WorkflowSecurityPK;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("workflowSecurityDAO")
public class WorkflowSecurityDAOImpl extends GenericDAOImpl<WorkflowSecurity, WorkflowSecurityPK>
        implements WorkflowSecurityDAO {

    public WorkflowSecurity getWorkflowSecurityById(long idworkflowConfig, 
            String idauthority) throws GenericDAOException {
        try {
            WorkflowSecurityPK workflowSecurityPK = new WorkflowSecurityPK();
            workflowSecurityPK.setIdauthority(idauthority);
            workflowSecurityPK.setIdworkflowConfig(idworkflowConfig);
            return this.find(workflowSecurityPK);
        } catch (Exception ex) {
            error(ex);
            throw new GenericDAOException(ex);
        }
    }
}
