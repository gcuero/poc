/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.service;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.kudytech.adeamx.mexweb.model.MenuWebmx;
import org.kudytech.core.context.CoreApplicationContext;
import org.kudytech.webmx.service.impl.MenuServiceImpl;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author gcuero
 */
public class MenuServiceTest {

    public MenuServiceTest() {
    }

    @Test
    public void testGetApplicationMenu() throws Exception {
        System.out.println("getApplicationMenu");
        String login = "kudy_pba";
        int idAplicacion = 47;
        ApplicationContext context = CoreApplicationContext.getInstance().getContext();
        MenuService instance = context.getAutowireCapableBeanFactory().createBean(MenuServiceImpl.class);
        List expResult = null;
        List<MenuWebmx> result = instance.getApplicationMenu(login, idAplicacion);
        for (MenuWebmx menuWebmx : result) {
            System.out.println("-- " + menuWebmx.getNombre() + " -- " + menuWebmx.getDescripcion());
        }
        assertNotNull(result);
    }
//    @Test
//    public void testGetApplicationSubMenu() throws Exception {
//        System.out.println("getApplicationSubMenu");
//        double idParent = 0.0;
//        String login = "";
//        int idAplicacion = 0;
//        MenuService instance = new MenuServiceImpl();
//        List expResult = null;
//        List result = instance.getApplicationSubMenu(idParent, login, idAplicacion);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
}
