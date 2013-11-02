/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.dao.impl;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.kudytech.adeamx.mexweb.model.AccesoWebmx;
import org.kudytech.adeamx.mexweb.model.AccesoWebmxPK;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.webmx.dao.AccesoWebmxDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("accesoWebmxDAO")
public class AccesoWebmxDAOImpl extends GenericDAOImpl<AccesoWebmx, AccesoWebmxPK>
        implements AccesoWebmxDAO {

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
    
    public AccesoWebmx saveAccesoWebmx(String login, Date fechaLogin, String ipAddress) 
            throws GenericDAOException {
        try {
            AccesoWebmx accesoWebmx = new AccesoWebmx();
            accesoWebmx.setId(new AccesoWebmxPK(login, fechaLogin));
            accesoWebmx.setIp(ipAddress);
            this.save(accesoWebmx);
            return accesoWebmx;
        } catch (Exception ex) {
            error(ex);
            throw new GenericDAOException(ex);
        }
    }
}
