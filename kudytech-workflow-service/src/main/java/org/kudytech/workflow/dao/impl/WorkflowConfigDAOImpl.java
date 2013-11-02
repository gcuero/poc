/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.dao.RestrictionModel;
import org.kudytech.core.common.dao.RestrictionOperators;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.service.ConfQueryService;
import org.kudytech.workflow.dao.WorkflowConfigDAO;
import org.kudytech.workflow.model.Workflow;
import org.kudytech.workflow.model.WorkflowConfig;
import org.kudytech.workflow.model.WorkflowEvent;
import org.kudytech.workflow.model.WorkflowState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("workflowConfigDAO")
public class WorkflowConfigDAOImpl extends GenericDAOImpl<WorkflowConfig, Long>
        implements WorkflowConfigDAO {

    private static final String WORKFLOW_CONFIG_1_QUERY = "WORKFLOW_CONFIG_1";
    @Autowired
    ConfQueryService confQueryService;

    public WorkflowConfig getWorkflowConfig(Workflow workflow, WorkflowEvent workflowEvent,
            WorkflowState workflowCurrentState, Boolean estatus) throws GenericDAOException {
        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = null;
        WorkflowConfig workflowConfig = null;
        try {
            tx = openSession.beginTransaction();
            Query sQLQuery = openSession.createQuery(
                    this.confQueryService.getQueryByName(
                    WorkflowConfigDAOImpl.WORKFLOW_CONFIG_1_QUERY));
            sQLQuery.setEntity("workflow", workflow);
            sQLQuery.setEntity("workflowEvent", workflowEvent);
            sQLQuery.setEntity("workflowCurrentState", workflowCurrentState);
            sQLQuery.setBoolean("estatus", estatus);
            workflowConfig = (WorkflowConfig) sQLQuery.uniqueResult();
            tx.commit();
        } catch (GenericServiceException ex) {
            error(ex);
            throw new GenericDAOException(ex);
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            error(e);
            throw new GenericDAOException(e);
        } finally {
            openSession.close();
        }
        return workflowConfig;
    }

    public WorkflowConfig getWorkflowConfig(Long idworkflow, String idworkflowEvent,
            String idCurrentWorkflowState, Boolean estatus) throws GenericDAOException {
        try {
            List<RestrictionModel> restrictionModels = new ArrayList<RestrictionModel>();
            RestrictionModel<Long> rm1 = new RestrictionModel<Long>();
            rm1.setObjectValue(idworkflow);
            rm1.setPropertyName("workflow.idworkflow");
            rm1.setOperator(RestrictionOperators.EQ);
            restrictionModels.add(rm1);
            RestrictionModel<String> rm2 = new RestrictionModel<String>();
            rm2.setObjectValue(idworkflowEvent);
            rm2.setPropertyName("workflowEvent.idworkflowEvent");
            rm2.setOperator(RestrictionOperators.EQ);
            restrictionModels.add(rm2);
            rm2 = new RestrictionModel<String>();
            rm2.setPropertyName("workflowCurrentState.idworkflowState");
            if (idCurrentWorkflowState != null) {
                rm2.setOperator(RestrictionOperators.EQ);
                rm2.setObjectValue(idCurrentWorkflowState);
            } else {
                rm2.setOperator(RestrictionOperators.IS_NULL);
            }
            restrictionModels.add(rm2);
            RestrictionModel<Boolean> rm3 = new RestrictionModel<Boolean>();
            rm3.setObjectValue(estatus);
            rm3.setPropertyName("estatus");
            rm3.setOperator(RestrictionOperators.EQ);
            restrictionModels.add(rm3);
            return this.findUniqueResultByRestriction(restrictionModels);
        } catch (Exception ex) {
            this.error(ex);
            throw new GenericDAOException(ex);
        }
    }
}
