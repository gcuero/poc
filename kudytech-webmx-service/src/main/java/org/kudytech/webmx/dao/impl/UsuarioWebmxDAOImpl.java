/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.dao.impl;

import javax.sql.DataSource;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.kudytech.adeamx.mexweb.model.UsuarioWebmx;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.service.ConfQueryService;
import org.kudytech.webmx.dao.UsuarioWebmxDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("usuarioWebmxDAO")
public class UsuarioWebmxDAOImpl extends GenericDAOImpl<UsuarioWebmx, String>
        implements UsuarioWebmxDAO {

    private static final String AUTHENTICATION_QUERY_NAME = "AUTHENTICATION_QUERY";
    private static final String LOGIN_NAME = "login";
    private static final String PASSWORD_NAME = "password";
    private static final String ID_APP_NAME = "idAplicacion";
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

    public UsuarioWebmx getUsuarioWebmxByLogin(String login, String password,
            int idAplicacion) throws GenericDAOException {
        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = null;
        UsuarioWebmx usuarioWebmx;
        try {
            tx = openSession.beginTransaction();
            SQLQuery sQLQuery = openSession.createSQLQuery(
                    this.confQueryService.getQueryByName(UsuarioWebmxDAOImpl.AUTHENTICATION_QUERY_NAME));
            sQLQuery.setString(UsuarioWebmxDAOImpl.LOGIN_NAME, login);
            sQLQuery.setString(UsuarioWebmxDAOImpl.PASSWORD_NAME, password);
            sQLQuery.setInteger(UsuarioWebmxDAOImpl.ID_APP_NAME, idAplicacion);
            sQLQuery = sQLQuery.addEntity(UsuarioWebmx.class);
            usuarioWebmx = (UsuarioWebmx) sQLQuery.uniqueResult();
            tx.commit();
            return usuarioWebmx;
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
    }
}
