/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao;

import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.workflow.model.WorkflowSecurity;
import org.kudytech.workflow.model.WorkflowSecurityPK;

/**
 *
 * @author gcuero
 */
public interface WorkflowSecurityDAO extends GenericDAO<WorkflowSecurity, WorkflowSecurityPK> {

    WorkflowSecurity getWorkflowSecurityById(long idworkflowConfig, String idauthority)
            throws GenericDAOException;
}
