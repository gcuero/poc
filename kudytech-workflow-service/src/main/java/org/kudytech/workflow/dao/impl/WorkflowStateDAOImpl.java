/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao.impl;

import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.workflow.dao.WorkflowStateDAO;
import org.kudytech.workflow.model.WorkflowState;
import org.springframework.stereotype.Repository;

@Repository("workflowStateDAO")
public class WorkflowStateDAOImpl extends GenericDAOImpl<WorkflowState, String>
        implements WorkflowStateDAO {
}
