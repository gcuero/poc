/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.service;

import java.util.List;
import org.kudytech.adeamx.mexweb.model.Authority;
import org.kudytech.adeamx.mexweb.model.UsuarioWebmx;
import org.kudytech.core.common.service.GenericServiceException;

/**
 *
 * @author gcuero
 */
public interface AuthenticationService {

    UsuarioWebmx login(String login, String password, int idAplicacion) throws GenericServiceException;

    UsuarioWebmx loadUserByLogin(String login) throws GenericServiceException;

    List<Authority> getAuthoritiesByLogin(String login) throws GenericServiceException;
}
