/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.dao.impl;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.kudytech.adeamx.mexweb.model.AccesoWebmx;
import org.kudytech.adeamx.mexweb.model.AccesoWebmxPK;
import org.kudytech.adeamx.mexweb.model.TransaccionWebmx;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.webmx.dao.TransaccionWebmxDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("transaccionWebmxDAO")
public class TransaccionWebmxDAOImpl extends GenericDAOImpl<TransaccionWebmx, Double>
        implements TransaccionWebmxDAO {

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

    public void saveTransaccionWebmx(String login, Date fechaLogin, String detalle,
            int idAplicacion, String transaccion) throws GenericDAOException {
        try {
            TransaccionWebmx tw = new TransaccionWebmx();
            tw.setLogin(login);
            tw.setFechalogin(fechaLogin);
            tw.setFolio(0);
            tw.setDetalle(detalle);
            tw.setFechatransaccion(GregorianCalendar.getInstance().getTime());
            tw.setIdaplicacion(idAplicacion);
            tw.setTransaccion(transaccion);
            this.save(tw);
        } catch (Exception ex) {
            error(ex);
            throw new GenericDAOException(ex);
        }
    }
}
