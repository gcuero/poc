/**
 *
 */
package org.kudytech.core.common.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.sql.DataSource;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.RestrictionModel;
import org.kudytech.core.common.dao.RestrictionOperators;
import org.kudytech.core.common.model.PaginationRequest;
import org.kudytech.core.common.model.PaginationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ERNESTO
 *
 */
@SuppressWarnings("all")
@Transactional
public abstract class GenericDAOImpl<T, PK extends Serializable>
        extends AbstractDebug implements GenericDAO<T, PK> {

    private static final Pattern p =
            Pattern.compile("order\\s*by[\\w|\\W|\\s|\\S]*",
            Pattern.CASE_INSENSITIVE);
    private Class<T> persistentClass;
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private DataSource dataSource;

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

    public GenericDAOImpl() {
        init();
    }

    public GenericDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        init();
    }

    public GenericDAOImpl(SessionFactory sessionFactory, DataSource dataSource) {
        this.sessionFactory = sessionFactory;
        this.dataSource = dataSource;
        init();
    }

    private void init() {
        this.persistentClass =
                (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).
                getActualTypeArguments()[0];
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> findAll(int batchsize, int firstResult) {
        List<T> result = null;
        Transaction tx = getSession().beginTransaction();
        try {
            result = getSession().createCriteria(getPersistentClass()).list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            error(e);
            throw e;
        }
        return result;
    }

    public List<T> findAllByPageAndNumRows(Query query, int page, int numRows) {
        List<T> result = null;
        query.setMaxResults(numRows);
        query.setFirstResult(page * numRows);
        try {
            result = query.list();
        } catch (HibernateException e) {
            error(e);
            throw e;
        }
        return result;
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> findAll() {
        List<T> result = null;
        Transaction tx = getSession().beginTransaction();
        try {
            result = getSession().createCriteria(getPersistentClass()).list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            error(e);
            throw e;
        }
        return result;
    }

    @Override
    @Transactional(readOnly = false)
    public PK save(T transientObject) throws Exception {
        Transaction tx = getSession().beginTransaction();
        Object obj = null;
        try {
            obj = getSession().save(transientObject);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            error(e);
            throw e;
        }
        return (PK) obj;
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(T transientObject) throws Exception {
        Transaction tx = getSession().beginTransaction();
        try {
            getSession().delete(transientObject);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            error(e);
            throw e;
        }
    }

    @Override
    @Transactional(readOnly = false)
    public void update(T transientObject) throws Exception {
        Transaction tx = getSession().beginTransaction();
        try {
            getSession().update(transientObject);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            error(e);
            throw e;
        }
    }

    @Override
    @Transactional(readOnly = true)
    public T find(PK id) throws Exception {
        Transaction tx = getSession().beginTransaction();
        Object obj = null;
        try {
            obj = getSession().get(getPersistentClass(), id);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            error(e);
            throw e;
        }
        return (T) obj;
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> findByProperty(final String property, final Object obj)
            throws Exception {
        List<T> lista;
        String queryString = " from " + getPersistentClass().getName()
                + " as model where model." + property + " = ?";
        getSession().beginTransaction();
        Query query = getSession().createQuery(queryString);
        query.setParameter(0, obj);
        lista = query.list();
        getSession().getTransaction().commit();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Integer getCount(Query query) throws Exception {
        return query.list().size();
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> findByRestrictionList(final List<RestrictionModel> restrictionModels)
            throws Exception {
        List<T> lista;
        getSession().beginTransaction();
        Criteria criteria = getSession().createCriteria(getPersistentClass());
        for (RestrictionModel restrictionModel : restrictionModels) {
            criteria = this.solveCriteria(criteria, restrictionModel);
        }
        lista = criteria.list();
        getSession().getTransaction().commit();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public T findUniqueResultByRestriction(final List<RestrictionModel> restrictionModels)
            throws Exception {
        T result;
        getSession().beginTransaction();
        Criteria criteria = getSession().createCriteria(getPersistentClass());
        for (RestrictionModel restrictionModel : restrictionModels) {
            criteria = this.solveCriteria(criteria, restrictionModel);
        }
        result = (T) criteria.uniqueResult();
        getSession().getTransaction().commit();
        return result;
    }

    private Criteria solveCriteria(Criteria criteria, RestrictionModel restrictionModel) {
        if (RestrictionOperators.EQ.equals(restrictionModel.getOperator())) {
            criteria.add(Restrictions.eq(
                    restrictionModel.getPropertyName(),
                    restrictionModel.getObjectValue()));
        }
        if (RestrictionOperators.LESS_THAN.equals(restrictionModel.getOperator())) {
            criteria.add(Restrictions.lt(
                    restrictionModel.getPropertyName(),
                    restrictionModel.getObjectValue()));
        }
        if (RestrictionOperators.LESS_OR_EQ_THAN.equals(restrictionModel.getOperator())) {
            criteria.add(Restrictions.le(
                    restrictionModel.getPropertyName(),
                    restrictionModel.getObjectValue()));
        }
        if (RestrictionOperators.GREAT_THAN.equals(restrictionModel.getOperator())) {
            criteria.add(Restrictions.gt(
                    restrictionModel.getPropertyName(),
                    restrictionModel.getObjectValue()));
        }
        if (RestrictionOperators.GREAT_OR_EQ_THAN.equals(restrictionModel.getOperator())) {
            criteria.add(Restrictions.ge(
                    restrictionModel.getPropertyName(),
                    restrictionModel.getObjectValue()));
        }
        if (RestrictionOperators.LIKE.equals(restrictionModel.getOperator())) {
            criteria.add(Restrictions.like(
                    restrictionModel.getPropertyName(),
                    restrictionModel.getObjectValue()));
        }
        if (RestrictionOperators.IS_NULL.equals(restrictionModel.getOperator())) {
            criteria.add(Restrictions.isNull(
                    restrictionModel.getPropertyName()));
        }
        if (RestrictionOperators.IS_NOT_NULL.equals(restrictionModel.getOperator())) {
            criteria.add(Restrictions.isNotNull(
                    restrictionModel.getPropertyName()));
        }
        return criteria;
    }

    @Override
    @Transactional(readOnly = true)
    public PaginationResponse extraeDatosXHQL(final PaginationRequest paginationRequest,
            final String hql, final Object... values) {
        String countHql = "select count(1) " + removeSelect(removeOrders(hql));
        Query query;
        query = getSession().createQuery(countHql);
        rellenaValoresAlQuery(query, values);
        int totalCount = ((Number) query.uniqueResult()).intValue();
        if (totalCount < 1) {
            return new PaginationResponse();
        }
        int startIndex = PaginationResponse.calcFirstItemIndexOfPage(
                paginationRequest, totalCount);
        query = getSession().createQuery(hql);
        rellenaValoresAlQuery(query, values);
        List list = query.setFirstResult(startIndex).setMaxResults(
                paginationRequest.getPageSize()).list();
        return new PaginationResponse(paginationRequest.getPage(),
                totalCount, paginationRequest.getPageSize(), list);
    }

    @Override
    @Transactional(readOnly = true)
    public PaginationResponse extraeDatosXCriteria(
            final PaginationRequest paginationRequest,
            final DetachedCriteria detachedCriteria) {
        return null;
    }

    protected String removeSelect(String hql) {
        int beginPos = hql.toLowerCase().indexOf("from");
        return hql.substring(beginPos);
    }

    public static String removeOrders(String hql) {
        Matcher m = p.matcher(hql);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "");
        }
        m.appendTail(sb);
        return sb.toString();
    }

    protected void rellenaValoresAlQuery(Query query, Object[] values) {
        for (int i = 0; i < values.length; i++) {
            query.setParameter(i, values[i]);
        }
    }

    public Session getSession() {
        return getSessionFactory().getCurrentSession();
    }
}
