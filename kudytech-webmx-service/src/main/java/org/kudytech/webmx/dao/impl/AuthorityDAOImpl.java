/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.dao.impl;

import java.util.List;
import javax.sql.DataSource;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.kudytech.adeamx.mexweb.model.Authority;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.service.ConfQueryService;
import org.kudytech.webmx.dao.AuthorityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("authorityDAO")
public class AuthorityDAOImpl extends GenericDAOImpl<Authority, String> implements AuthorityDAO {

    private static final String AUTHORITHY_BY_LOGIN_QUERY_NAME =
            "AUTHORITY_BY_LOGIN";
    private static final String LOGIN_NAME = "login";
    @Autowired
    ConfQueryService confQueryService;

    @Autowired
    @Override
    public void setSessionFactory(@Qualifier("mexWebSessionFactory") SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Autowired
    @Override
    public void setDataSource(@Qualifier("mexWebDatasource") DataSource dataSource) {
        super.setDataSource(dataSource);
    }

    public List<Authority> getAuthoritiesByLogin(String login) throws GenericDAOException {
        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = null;
        List<Authority> authoritys = null;
        try {
            tx = openSession.beginTransaction();
            SQLQuery sQLQuery = openSession.createSQLQuery(
                    this.confQueryService.getQueryByName(AuthorityDAOImpl.AUTHORITHY_BY_LOGIN_QUERY_NAME));
            sQLQuery.setString(AuthorityDAOImpl.LOGIN_NAME, login);
            sQLQuery = sQLQuery.addEntity(Authority.class);
            authoritys = sQLQuery.list();
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
        return authoritys;
    }
}
