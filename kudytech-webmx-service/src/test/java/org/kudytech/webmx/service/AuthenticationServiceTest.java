/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.service;

import org.junit.Test;
import static org.junit.Assert.*;
import org.kudytech.adeamx.mexweb.model.UsuarioWebmx;
import org.kudytech.core.context.CoreApplicationContext;
import org.kudytech.webmx.service.impl.AuthenticationServiceImpl;
import org.kudytech.webmx.service.impl.MenuServiceImpl;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author gcuero
 */
public class AuthenticationServiceTest {
    
    public AuthenticationServiceTest() {
    }

    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String login = "kudy_pba";
        String password = "iMpwyI/Krx4A7z/g9Y79ixVM7m8=";
        int idAplicacion = 46;
        ApplicationContext context = CoreApplicationContext.getInstance().getContext();
        AuthenticationService instance = context.getAutowireCapableBeanFactory().createBean(AuthenticationServiceImpl.class);
//        AuthenticationService instance = new AuthenticationServiceImpl();
       
        UsuarioWebmx result = instance.login(login, password, idAplicacion);
        assertNotNull(context);
//        fail("The test case is a prototype.");
    }

    
}
