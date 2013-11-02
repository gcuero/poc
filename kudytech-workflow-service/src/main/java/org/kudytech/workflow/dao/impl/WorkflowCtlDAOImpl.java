/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao.impl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.service.ConfQueryService;
import org.kudytech.workflow.dao.WorkflowCtlDAO;
import org.kudytech.workflow.model.WorkflowCtl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("workflowCtlDAO")
public class WorkflowCtlDAOImpl extends GenericDAOImpl<WorkflowCtl, Long>
        implements WorkflowCtlDAO {

    private static final String WORKFLOWCTL_BY_IDREF_IDOBJ =
            "WORKFLOWCTL_BY_IDREF_IDOBJ";
    private static final String WORKFLOWCTL_LIST_BY_CURRENT_STATE_QUERY =
            "WORKFLOWCTL_LIST_BY_CURRENT_STATE";
    private static final String IDREFERENCIA_NAME = "idReferencia";
    private static final String IDOBJETO_NAME = "idObjecto";
    private static final String CURRENT_STATE_NAME = "currentSate";
    @Autowired
    ConfQueryService confQueryService;

    public WorkflowCtl getWorkflowCtlByIdReferenciAndIdObjeto(Long idReferencia,
            Long idObjeto) throws GenericDAOException {
        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = null;
        WorkflowCtl workflowCtl = null;
        try {
            tx = openSession.beginTransaction();
            Query sQLQuery = openSession.createQuery(
                    this.confQueryService.getQueryByName(
                    WorkflowCtlDAOImpl.WORKFLOWCTL_BY_IDREF_IDOBJ));
            sQLQuery.setLong(WorkflowCtlDAOImpl.IDREFERENCIA_NAME, idReferencia);
            sQLQuery.setLong(WorkflowCtlDAOImpl.IDOBJETO_NAME, idObjeto);
            workflowCtl = (WorkflowCtl) sQLQuery.uniqueResult();
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
        return workflowCtl;
    }

    public List<WorkflowCtl> getWorkflowCtlListByCurrentState(String currentSate)
            throws GenericDAOException {
        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = null;
        List<WorkflowCtl> workflowCtlList = null;
        try {
            tx = openSession.beginTransaction();
            Query sQLQuery = openSession.createQuery(
                    this.confQueryService.getQueryByName(
                    WorkflowCtlDAOImpl.WORKFLOWCTL_LIST_BY_CURRENT_STATE_QUERY));
            sQLQuery.setString(WorkflowCtlDAOImpl.CURRENT_STATE_NAME, currentSate);
            workflowCtlList = sQLQuery.list();
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
        return workflowCtlList;
    }
}
