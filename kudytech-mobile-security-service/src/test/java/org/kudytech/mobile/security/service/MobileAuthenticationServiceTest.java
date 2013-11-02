/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.mobile.security.service;

import static org.junit.Assert.*;
import org.junit.Test;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.core.context.CoreApplicationContext;
import org.kudytech.mobile.security.domain.UserDetail;
import org.kudytech.mobile.security.service.impl.MobileAuthenticationServiceImpl;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author gcuero
 */
public class MobileAuthenticationServiceTest {
    
    public MobileAuthenticationServiceTest() {
    }

    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String login = "kudy_pba";
        String password = "iMpwyI/Krx4A7z/g9Y79ixVM7m8=";
        int idAplicacion = 47;
        ApplicationContext context = CoreApplicationContext.getInstance().getContext();
        MobileAuthenticationService instance = context.getAutowireCapableBeanFactory().createBean(MobileAuthenticationServiceImpl.class);
//        MobileAuthenticationService instance = new MobileAuthenticationServiceImpl();
        UserDetail expResult = null;
        UserDetail result = instance.login(login, password, idAplicacion);
        assertNotNull(context);
    }

    @Test
    public void testValidateUserAndToken(){
        try {
            System.out.println("login");
            String login = "kudy_pba";
            String token="47ead38c57ea32192942aaf83650892ebd147b02";
            ApplicationContext context = CoreApplicationContext.getInstance().getContext();
            MobileAuthenticationService instance = 
                    context.getAutowireCapableBeanFactory().createBean(MobileAuthenticationServiceImpl.class);
            boolean validateUserAndToken = instance.validateUserAndToken(login, token);
            assertTrue(validateUserAndToken);
        } catch (GenericServiceException ex) {
            fail(ex.getMessage());
        }
    }
}
