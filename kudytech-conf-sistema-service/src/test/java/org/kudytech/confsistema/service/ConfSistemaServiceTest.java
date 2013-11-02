/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.confsistema.service;

import org.junit.Test;
import static org.junit.Assert.*;
import org.kudytech.confsistema.model.ConfSistema;
import org.kudytech.confsistema.service.impl.ConfSistemaServiceImpl;
import org.kudytech.core.context.CoreApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author gcuero
 */
public class ConfSistemaServiceTest {
    
    public ConfSistemaServiceTest() {
    }

//    @Test
//    public void testFindByCatalog() throws Exception {
//        System.out.println("findByCatalog");
//        String catalog = "";
//        ConfSistemaService instance = new ConfSistemaServiceImpl();
//        List expResult = null;
//        List result = instance.findByCatalog(catalog);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testFindByCatalogAndVariable() throws Exception {
        System.out.println("findByCatalogAndVariable");
        String catalog = "";
        String variable = "";
        ApplicationContext context = CoreApplicationContext.getInstance().getContext();
        ConfSistemaService instance = context.getAutowireCapableBeanFactory().createBean(ConfSistemaServiceImpl.class);
        ConfSistema expResult = null;
        ConfSistema result = instance.findByCatalogAndVariable(catalog, variable);
        assertEquals(expResult, result);
       
    }

//    public class ConfSistemaServiceImpl implements ConfSistemaService {
//
//        public List<ConfSistema> findByCatalog(String catalog) throws GenericServiceException {
//            return null;
//        }
//
//        public ConfSistema findByCatalogAndVariable(String catalog, String variable) throws GenericServiceException {
//            return null;
//        }
//    }
}
