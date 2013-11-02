/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.dao.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.sql.DataSource;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.model.utils.ModelIdProvider;
import org.kudytech.query.model.QueryConf;
import org.kudytech.query.service.QueryConfService;
import org.kudytech.workflow.domain.WorkflowStateMap;
import org.kudytech.workflow.service.WorkflowService;
import org.kudytech.workflow.service.WorkflowStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author gcuero
 */
@Repository("queryHelper")
@Transactional
public class QueryHelper<T extends Serializable> extends AbstractDebug {
    
    private static final String SELECT_QUERY = "select ";
    private static final String COUNT_QUERY = " count(*) as count ";
    private static final String FROM_QUERY = " from ";
    private static final String ALL_QUERY = ".*";
    private static final String COMMA_QUERY = ",";
    private static final String AS_QUERY = " ";
    private static final String EMPTY = "";
    private static final String TYPE_NOT_FOUND = "Tipo de query no encontrado.";
    private static final String NOT_STATE_FOUND = "No se encuentra el estatus de busqueda.";
    public static final String HQL_TYPE = "HQL";
    public static final String SQL_TYPE = "SQL";
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private DataSource dataSource;
    @Autowired
    QueryConfService queryConfService;
    @Autowired
    WorkflowService workflowService;
    @Autowired
    WorkflowStateService workflowStateService;

    /**
     * @return the dataSource
     */
    public DataSource getDataSource() {
        return dataSource;
    }

    /**
     * @param dataSource the dataSource to set
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public Session getSession() {
        return getSessionFactory().getCurrentSession();
    }
    
    @Transactional(readOnly = true)
    public Integer countByQueryName(String queryName, List<QueryParam> queryParams)
            throws GenericDAOException, GenericServiceException {
        QueryConf queryConf = this.queryConfService.getQueryConfByQueryName(queryName);
        String queryCount = QueryHelper.EMPTY;
        if (QueryHelper.HQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
            queryCount = this.buildCountHQLQuery(queryConf);
        }
        if (QueryHelper.SQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
            queryCount = this.buildCountNativeSqlQuery(queryConf);
        }
        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = openSession.beginTransaction();
        int count = 0;
        try {
            Query query = this.getQuery(openSession, queryConf, queryCount, queryParams);
            count = ((Number) query.uniqueResult()).intValue();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            e.printStackTrace(System.err);
            error(e);
            throw e;
        }
        return count;
    }
    
    @Transactional(readOnly = true)
    public List<T> getListByName(String queryName, List<QueryParam> queryParams)
            throws GenericDAOException, GenericServiceException {
        QueryConf queryConf = this.queryConfService.getQueryConfByQueryName(queryName);
        String queryList = QueryHelper.EMPTY;
        if (QueryHelper.HQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
            queryList = this.buildListHQLQuery(queryConf);
        }
        if (QueryHelper.SQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
            queryList = this.buildListNativeSqlQuery(queryConf);
        }
        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = openSession.beginTransaction();
        List result = new ArrayList();
        try {
            Query query = this.getQuery(openSession, queryConf, queryList, queryParams);
            if (QueryHelper.SQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
                Class entityClass = this.getEntityClass(queryConf);
                ((SQLQuery) query).addEntity(entityClass);
            }
            result = query.list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            error(e);
            throw e;
        }
        return result;
    }
    
    @Transactional(readOnly = true)
    public List<T> getListPagedByName(String queryName, List<QueryParam> queryParams, int page, int numRows)
            throws GenericDAOException, GenericServiceException {
        QueryConf queryConf = this.queryConfService.getQueryConfByQueryName(queryName);
        String queryList = QueryHelper.EMPTY;
        if (QueryHelper.HQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
            queryList = this.buildListHQLQuery(queryConf);
        }
        if (QueryHelper.SQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
            queryList = this.buildListNativeSqlQuery(queryConf);
        }
        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = openSession.beginTransaction();
        List result = new ArrayList();
        try {
            Query query = this.getQuery(openSession, queryConf, queryList, queryParams);
            
            if (QueryHelper.SQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
                Class entityClass = this.getEntityClass(queryConf);
                ((SQLQuery) query).addEntity(entityClass);
            }
            
            query.setMaxResults(numRows);
            query.setFirstResult(page * numRows);
            result = query.list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            error(e);
            throw e;
        }
        return result;
    }
    
    @Transactional(readOnly = true)
    public List<WorkflowStateMap<T>> getStateMapListByName(String queryName,
            List<QueryParam> queryParams)
            throws GenericDAOException, GenericServiceException {
        List listByName = this.getListByName(queryName, queryParams);
        return this.getWorkflowStateList(listByName);
    }
    
    @Transactional(readOnly = true)
    public List<WorkflowStateMap<T>> getStateMapListPagedByName(String queryName,
            List<QueryParam> queryParams, int page, int numRows)
            throws GenericDAOException, GenericServiceException {
        List listByName = this.getListPagedByName(queryName, queryParams, page,
                numRows);
        return this.getWorkflowStateList(listByName);
    }
    
    private List<WorkflowStateMap<T>> getWorkflowStateList(List list)
            throws GenericServiceException {
        List<WorkflowStateMap<T>> workflowStateMaps = new ArrayList<WorkflowStateMap<T>>();
        WorkflowStateMap workflowStateMap;
        for (Object object : list) {
            workflowStateMap = this.workflowService.getWorkflowStateByObject(
                    (ModelIdProvider) object);
            workflowStateMaps.add(workflowStateMap);
        }
        return workflowStateMaps;
    }
    
    private Query getQuery(Session session, QueryConf queryConf, String query,
            List<QueryParam> queryParams)
            throws GenericDAOException {
        if (QueryHelper.HQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
            Query createQuery = session.createQuery(query);
            createQuery = this.getParametrizedQuery(createQuery, queryParams);
            return createQuery;
        } else {
            if (QueryHelper.SQL_TYPE.equalsIgnoreCase(queryConf.getQueryType())) {
                SQLQuery createSQLQuery = session.createSQLQuery(query);
                createSQLQuery = (SQLQuery) this.getParametrizedQuery(
                        createSQLQuery, queryParams);
                return createSQLQuery;
            } else {
                throw new GenericDAOException(QueryHelper.TYPE_NOT_FOUND);
            }
        }
    }
    
    private Query getParametrizedQuery(Query query, List<QueryParam> queryParams) {
        for (QueryParam queryParam : queryParams) {
            if (queryParam.getQueryParamValue() instanceof Collection) {
                query.setParameterList(queryParam.getQueryParamName(),
                        (Collection) queryParam.getQueryParamValue());
            } else if (queryParam.getQueryParamValue() instanceof Object[]) {
                query.setParameterList(queryParam.getQueryParamName(),
                        (Object[]) queryParam.getQueryParamValue());
            } else {
                query.setParameter(queryParam.getQueryParamName(),
                        queryParam.getQueryParamValue());
            }
        }
        return query;
    }
    
    private String buildCountHQLQuery(QueryConf queryConf) {
        String queryCount = QueryHelper.SELECT_QUERY + QueryHelper.COUNT_QUERY
                + QueryHelper.FROM_QUERY + queryConf.getTableConf().getEntityName()
                + QueryHelper.AS_QUERY + queryConf.getTableConf().getEntityAlias()
                + this.getStringQuery(queryConf);
        return queryCount;
    }
    
    private String buildListHQLQuery(QueryConf queryConf) {
        String queryCount = QueryHelper.SELECT_QUERY + queryConf.getTableConf().getEntityAlias()
                + QueryHelper.FROM_QUERY + queryConf.getTableConf().getEntityName()
                + QueryHelper.AS_QUERY + queryConf.getTableConf().getEntityAlias()
                + this.getStringQuery(queryConf);
        return queryCount;
    }
    
    private String buildCountNativeSqlQuery(QueryConf queryConf) {
        String queryCount = QueryHelper.SELECT_QUERY
                + QueryHelper.COUNT_QUERY + QueryHelper.FROM_QUERY
                + queryConf.getTableConf().getTableName() + QueryHelper.AS_QUERY
                + queryConf.getTableConf().getTableAlias()
                + this.getStringQuery(queryConf);
        return queryCount;
    }
    
    private String buildListNativeSqlQuery(QueryConf queryConf) {
        String queryCount = QueryHelper.SELECT_QUERY
                + queryConf.getTableConf().getTableAlias() + QueryHelper.ALL_QUERY
                + QueryHelper.FROM_QUERY + queryConf.getTableConf().getTableName()
                + QueryHelper.AS_QUERY + queryConf.getTableConf().getTableAlias()
                + this.getStringQuery(queryConf);
        return queryCount;
    }
    
    private Class getEntityClass(QueryConf queryConf) throws GenericDAOException {
        try {
            return Class.forName(queryConf.getTableConf().getEntityClass());
        } catch (ClassNotFoundException ex) {
            this.error(ex);
            throw new GenericDAOException(ex);
        }
    }
    
    private String getStringQuery(QueryConf queryConf) {
        String query = QueryHelper.EMPTY;
        if (queryConf.getQuery() != null) {
            query = query + queryConf.getQuery();
        }
        if (queryConf.getQuery2() != null) {
            query = query + queryConf.getQuery2();
        }
        return query;
    }
}
