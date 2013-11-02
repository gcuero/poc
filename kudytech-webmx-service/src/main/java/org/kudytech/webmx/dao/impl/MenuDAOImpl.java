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
import org.kudytech.adeamx.mexweb.model.MenuWebmx;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.service.ConfQueryService;
import org.kudytech.webmx.dao.MenuDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("menuDAO")
public class MenuDAOImpl extends GenericDAOImpl<MenuWebmx, Double> implements MenuDAO {

    private static final String MENU_APP_QUERY_NAME = "MENU_APP_QUERY";
    private static final String SUBMENU_APP_QUERY_NAME = "SUBMENU_APP_QUERY";
    private static final String LOGIN_NAME = "login";
    private static final String ID_APP_NAME = "idAplicacion";
    private static final String ID_PARENT_NAME = "idParent";
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

    /**
     *
     * @param login
     * @param idAplicacion
     * @return
     * @throws GenericDAOException
     */
    public List<MenuWebmx> getApplicationMenu(String login, int idAplicacion)
            throws GenericDAOException {
        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = null;
        List<MenuWebmx> menuWebmxs = null;
        try {
            tx = openSession.beginTransaction();
            SQLQuery sQLQuery = openSession.createSQLQuery(
                    this.confQueryService.getQueryByName(MenuDAOImpl.MENU_APP_QUERY_NAME));
            sQLQuery.setString(MenuDAOImpl.LOGIN_NAME, login);
            sQLQuery.setInteger(MenuDAOImpl.ID_APP_NAME, idAplicacion);
            sQLQuery = sQLQuery.addEntity(MenuWebmx.class);
            menuWebmxs = sQLQuery.list();
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
        return menuWebmxs;
    }

    /**
     *
     * @param idParent
     * @param login
     * @param idAplicacion
     * @return
     * @throws GenericDAOException
     */
    public List<MenuWebmx> getApplicationSubMenu(double idParent, String login,
            int idAplicacion) throws GenericDAOException {

        Session openSession = this.getSessionFactory().openSession();
        Transaction tx = null;
        List<MenuWebmx> menuWebmxs = null;
        try {
            tx = openSession.beginTransaction();
            SQLQuery sQLQuery = openSession.createSQLQuery(
                    this.confQueryService.getQueryByName(MenuDAOImpl.SUBMENU_APP_QUERY_NAME));
            sQLQuery.setDouble(MenuDAOImpl.ID_PARENT_NAME, idParent);
            sQLQuery.setString(MenuDAOImpl.LOGIN_NAME, login);
            sQLQuery.setInteger(MenuDAOImpl.ID_APP_NAME, idAplicacion);
            sQLQuery = sQLQuery.addEntity(MenuWebmx.class);
            menuWebmxs = sQLQuery.list();
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
        return menuWebmxs;
    }
}
