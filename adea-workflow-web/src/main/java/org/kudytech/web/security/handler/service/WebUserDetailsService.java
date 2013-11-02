/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.web.security.handler.service;

import org.kudytech.adeamx.webmex.domain.UsuarioWeb;
import org.kudytech.adeamx.webmex.service.SecurityClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("userDetailsServiceInner")
public class WebUserDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(WebUserDetailsService.class);
    @Autowired
    SecurityClientService securityClientService;
    @Value("${com.adeamx.security.webmx.application.id}")
    private Long idApplication;
    @Value("${com.adeamx.security.webmx.application.name}")
    private String application;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            UsuarioWeb user = this.securityClientService.loadUsuarioWebByLogin(username);
            if (user == null) {
                throw new UsernameNotFoundException("Usuario no encontrado: " + username);
            }
            return new org.kudytech.web.security.domain.UserDetails(user, idApplication, user.getAuthoritys());
        } catch (Exception ex) {
            logger.error(ex.getLocalizedMessage(), ex);
            throw new UsernameNotFoundException("Ocurrio un error al conectar con la base de usuarios: " + username);
        }
    }
}
