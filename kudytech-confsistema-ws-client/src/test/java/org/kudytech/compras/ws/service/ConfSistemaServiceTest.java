/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.compras.ws.service;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kudytech.confsistema.ws.domain.ConfSistema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Erika
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/model/context/applicationContext.xml"})
public class ConfSistemaServiceTest {
    @Autowired
    ConfSistemaService confSistemaService;

    public ConfSistemaServiceTest() {
    }

    /**
     * Test of findByCatalog method, of class ConfSistemaService.
     */
    @Test
    public void testFindByCatalog() throws Exception {
        System.out.println("findByCatalog");
        String catalog = "MOBILE_SYSTEM";
        ConfSistemaService instance = this.confSistemaService;
        List<ConfSistema> result = instance.findByCatalog(catalog);
        
        assertNotNull( result);
        for (ConfSistema confSistema : result) {
            System.out.println("Conf ;;;;;;;;;;;;;  " + confSistema.getDescripcion());
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findByCatalogAndVariable method, of class ConfSistemaService.
     */
    @Test
    public void testFindByCatalogAndVariable() throws Exception {
        System.out.println("findByCatalogAndVariable");
        String catalog = "MOBILE_SYSTEM";
        String variable = "SESSION_TIME";
        ConfSistemaService instance = this.confSistemaService;
        ConfSistema result = instance.findByCatalogAndVariable(catalog, variable);
        assertNotNull(result);
        System.out.println("CONF ::::::::::::::  " + result.getDescripcion());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getStringValueByCatalogAndVariable method, of class
     * ConfSistemaService.
     */
    @Test
    public void testGetStringValueByCatalogAndVariable() throws Exception {
        System.out.println("getStringValueByCatalogAndVariable");
        String catalog = "WORKFLOW";
        String variable = "DO_NEXT";
        ConfSistemaService instance = this.confSistemaService;
        String expResult = "donext";
        String result = instance.getStringValueByCatalogAndVariable(catalog, variable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNumberValueByatCalogAndVariable method, of class
     * ConfSistemaService.
     */
    @Test
    public void testGetNumberValueByatCalogAndVariable() throws Exception {
        System.out.println("getNumberValueByatCalogAndVariable");
        String catalog = "MOBILE_SYSTEM";
        String variable = "SESSION_TIME";
        ConfSistemaService instance = this.confSistemaService;
        Long expResult = 1200L;
        Long result = instance.getNumberValueByCatalogAndVariable(catalog, variable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
//
//    /**
//     * Test of getDateValueByatCalogAndVariable method, of class
//     * ConfSistemaService.
//     */
//    @Test
//    public void testGetDateValueByatCalogAndVariable() throws Exception {
//        System.out.println("getDateValueByatCalogAndVariable");
//        String catalog = "";
//        String variable = "";
//        ConfSistemaService instance = this.confSistemaService;
//        Date expResult = null;
//        Date result = instance.getDateValueByatCalogAndVariable(catalog, variable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
//    /**
//     * Test of getBlobValueByatCalogAndVariable method, of class
//     * ConfSistemaService.
//     */
//    @Test
//    public void testGetBlobValueByatCalogAndVariable() throws Exception {
//        System.out.println("getBlobValueByatCalogAndVariable");
//        String catalog = "";
//        String variable = "";
//        ConfSistemaService instance = this.confSistemaService;
//        byte[] expResult = null;
//        byte[] result = instance.getBlobValueByatCalogAndVariable(catalog, variable);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
}
