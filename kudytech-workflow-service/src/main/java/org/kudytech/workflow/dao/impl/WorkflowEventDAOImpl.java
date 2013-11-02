/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao.impl;

import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.workflow.dao.WorkflowEventDAO;
import org.kudytech.workflow.model.WorkflowEvent;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("workflowEventDAO")
public class WorkflowEventDAOImpl extends GenericDAOImpl<WorkflowEvent, String> implements WorkflowEventDAO {
}
