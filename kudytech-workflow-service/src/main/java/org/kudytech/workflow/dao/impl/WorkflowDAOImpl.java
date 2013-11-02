/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao.impl;

import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.workflow.dao.WorkflowDAO;
import org.kudytech.workflow.model.Workflow;
import org.springframework.stereotype.Repository;

@Repository("workflowDAO")
public class WorkflowDAOImpl extends GenericDAOImpl<Workflow, Long> implements WorkflowDAO {
}
