/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.service;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.kudytech.adeamx.mexweb.model.AccesoWebmx;
import org.kudytech.webmx.service.impl.AccessTraceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author gcuero
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/model/context/applicationContext.xml"})
public class AccessTraceServiceTest {
    
    @Autowired
    AccessTraceService accessTraceService;
            
    public AccessTraceServiceTest() {
    }

    @Test
    public void testRegisterAccesoWebmx() throws Exception {
        System.out.println("registerAccesoWebmx");
        String login = "kudy_pba";
        Date fechaLogin = new Date();
        String ipAddress = "localhost";
        AccesoWebmx expResult = null;
        AccesoWebmx result = accessTraceService.registerAccesoWebmx(
                login, fechaLogin, ipAddress);
        assertNotNull(result);
    }

    @Test
    public void testRegisterTransaction() throws Exception {
        System.out.println("registerTransaction");
        String login = "kudy_pba";
        Date fechaLogin = new Date();
        String detalle = "Login prueba de trazado";
        int idAplicacion = 46;
        String transaccion = "LOGIN";
        String ipAddress = "localhost";
        AccesoWebmx result = accessTraceService.registerAccesoWebmx(
                login, fechaLogin, ipAddress);
        accessTraceService.registerTransaction(
                result.getId().getLogin(), 
                result.getId().getFechalogin(), 
                detalle, idAplicacion, transaccion);
        assertNotNull(result);
    }

    
}
