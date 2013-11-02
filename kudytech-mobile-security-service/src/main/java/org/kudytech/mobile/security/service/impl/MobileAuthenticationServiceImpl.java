/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.mobile.security.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.kudytech.adeamx.mexweb.model.UsuarioWebmx;
import org.kudytech.confsistema.service.ConfSistemaService;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.mobile.security.dao.MobileAccessDAO;
import org.kudytech.mobile.security.dao.MobileTransactionDAO;
import org.kudytech.mobile.security.domain.UserDetail;
import org.kudytech.mobile.security.model.MobileAccess;
import org.kudytech.mobile.security.model.MobileAccessPK;
import org.kudytech.mobile.security.model.MobileTransaction;
import org.kudytech.mobile.security.service.MobileAuthenticationService;
import org.kudytech.mobile.security.utils.TokenUtils;
import org.kudytech.webmx.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("mobileAuthenticationService")
public class MobileAuthenticationServiceImpl extends AbstractDebug
        implements MobileAuthenticationService {

    private static final String LOGIN_MESSAGE = "Login de la aplicacion.";
    private static final String LOGOUT_MESSAGE = "Logout de la aplicacion.";
    private static final String MOBILE_SYSTEM_CATALOG_NAME = "MOBILE_SYSTEM";
    private static final String SESSION_TIME_VARIABLE_NAME = "SESSION_TIME";
    private static final String MOBILE_ACCESS_INVALID =
            "No existe una acceso valido para el usuario [%1$s] y el token [%2$s].";
    @Autowired
    AuthenticationService authenticationService;
    @Autowired
    MobileAccessDAO mobileAccessDAO;
    @Autowired
    MobileTransactionDAO mobileTransactionDAO;
    @Autowired
    ConfSistemaService confSistemaService;

    public UserDetail login(String login, String password, int idAplicacion) throws GenericServiceException {
        UsuarioWebmx usuarioWebmx;
        usuarioWebmx = this.authenticationService.login(login, password, idAplicacion);
        if (usuarioWebmx != null) {
            try {
                String generateToken = TokenUtils.generateToken(login);
                MobileAccessPK mobileAccessPK = new MobileAccessPK();
                mobileAccessPK.setAccesToken(generateToken);
                mobileAccessPK.setLogin(login);
                MobileAccess mobileAccess = new MobileAccess();
                mobileAccess.setActive(Boolean.TRUE);
                mobileAccess.setFechaLogin(GregorianCalendar.getInstance().getTime());
                mobileAccess.setFechaUltAcceso(GregorianCalendar.getInstance().getTime());
                mobileAccess.setId(mobileAccessPK);
                this.mobileAccessDAO.save(mobileAccess);
                this.registerTransaction(login, generateToken,
                        MobileAuthenticationServiceImpl.LOGIN_MESSAGE);
                UserDetail userDetail = new UserDetail();
                userDetail.setEmail(usuarioWebmx.getEmail());
                userDetail.setFechaUltimoAcceso(mobileAccess.getFechaUltAcceso());
                userDetail.setLogin(usuarioWebmx.getLogin());
                userDetail.setNombre(usuarioWebmx.getNombre());
                userDetail.setToken(generateToken);
                return userDetail;
            } catch (Exception ex) {
                error(ex);
                throw new GenericServiceException(ex);
            }
        } else {
            return null;
        }
    }

    public boolean validateUserAndToken(String login, String token)
            throws GenericServiceException {
        Long sessionTime = this.confSistemaService.getNumberValueByatCalogAndVariable(
                MobileAuthenticationServiceImpl.MOBILE_SYSTEM_CATALOG_NAME,
                MobileAuthenticationServiceImpl.SESSION_TIME_VARIABLE_NAME);
        Calendar fechVigente;
        fechVigente = GregorianCalendar.getInstance();
        fechVigente.add(GregorianCalendar.SECOND, ((-1) * sessionTime.intValue()));
        debug("Fecha vigencia: " + fechVigente.getTime());
        try {
            MobileAccess mobileAccess =
                    this.mobileAccessDAO.getMobileAccessByLoginAndToken(login, token);
            if (mobileAccess.getActive()) {
                Calendar fechUltAcceso = GregorianCalendar.getInstance();
                fechUltAcceso.setTime(mobileAccess.getFechaUltAcceso());
                debug("Fecha ultimo acceso: " + fechUltAcceso.getTime());
                return fechVigente.before(fechUltAcceso);
            } else {
                return Boolean.FALSE;
            }
        } catch (GenericDAOException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public void registerTransaction(String login, String token, String transaction)
            throws GenericServiceException {
        try {
            MobileAccess mobileAccess =
                    this.mobileAccessDAO.getMobileAccessByLoginAndToken(login, token);
            if (mobileAccess == null) {
                throw new GenericServiceException(
                        String.format(
                        MobileAuthenticationServiceImpl.MOBILE_ACCESS_INVALID, login, token));
            } else {
                MobileTransaction mobileTransaction = new MobileTransaction();
                mobileTransaction.setFechaTransaccion(new Date());
                mobileTransaction.setMobileAccess(mobileAccess);
                mobileTransaction.setTransaccion(transaction);
                this.mobileTransactionDAO.save(mobileTransaction);
                mobileAccess.setFechaUltAcceso(GregorianCalendar.getInstance().getTime());
                this.mobileAccessDAO.update(mobileAccess);
            }
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public void closeMobileSession(String login, String token) throws GenericServiceException {
        try {
            MobileAccess mobileAccess =
                    this.mobileAccessDAO.getMobileAccessByLoginAndToken(login, token);
            if (mobileAccess == null) {
                throw new GenericServiceException(
                        String.format(
                        MobileAuthenticationServiceImpl.MOBILE_ACCESS_INVALID, login, token));
            } else {
                if (mobileAccess.getActive()) {
                    MobileTransaction mobileTransaction = new MobileTransaction();
                    mobileTransaction.setFechaTransaccion(new Date());
                    mobileTransaction.setMobileAccess(mobileAccess);
                    mobileTransaction.setTransaccion(MobileAuthenticationServiceImpl.LOGOUT_MESSAGE);
                    this.mobileTransactionDAO.save(mobileTransaction);
                    mobileAccess.setFechaLogout(GregorianCalendar.getInstance().getTime());
                    mobileAccess.setActive(Boolean.FALSE);
                    this.mobileAccessDAO.update(mobileAccess);
                }
            }
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }
}
