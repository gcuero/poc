/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.kudytech.adeamx.mexweb.model.Authority;
import org.kudytech.adeamx.mexweb.model.UsuarioWebmx;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.webmx.dao.AuthorityDAO;
import org.kudytech.webmx.dao.UsuarioWebmxDAO;
import org.kudytech.webmx.service.AuthenticationService;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("authenticationService")
public class AuthenticationServiceImpl extends AbstractDebug implements AuthenticationService {

    @Resource
    UsuarioWebmxDAO usuarioWebmxDAO;
    @Resource
    AuthorityDAO authorityDAO;

    public UsuarioWebmx login(String login, String password, int idAplicacion) throws GenericServiceException {
        try {
            return this.usuarioWebmxDAO.getUsuarioWebmxByLogin(login, password, idAplicacion);
        } catch (GenericDAOException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public UsuarioWebmx loadUserByLogin(String login) throws GenericServiceException {
        try {
            return this.usuarioWebmxDAO.find(login);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public List<Authority> getAuthoritiesByLogin(String login) throws GenericServiceException {
        try {
            return this.authorityDAO.getAuthoritiesByLogin(login);
        } catch (GenericDAOException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }
}
