/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.adeamx.webmex.service;

import java.util.List;
import javax.annotation.Resource;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kudytech.adeamx.webmex.domain.MenuWeb;
import org.kudytech.adeamx.webmex.domain.UsuarioWeb;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author gcuero
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/model/context/applicationContext.xml"})
public class SecurityClientServiceTest {

    @Resource(name = "securityClientService")
    SecurityClientService securityClientService;

    public SecurityClientServiceTest() {
    }

    @Test
    public void testGetMenuByUser() throws Exception {
        List<MenuWeb> menuByUser = this.securityClientService.getMenuByUser(
                "workflow_admin", 
                48);
        for (MenuWeb menuWeb : menuByUser) {
            System.out.println("Nombre Menu :: " + menuWeb.getNombre());
            System.out.println("Nombre Descripcion :: " + menuWeb.getDescripcion());
            System.out.println("Nombre Ruta :: " + menuWeb.getRuta());
            System.out.println("Nombre IdMenu :: " + menuWeb.getIdmenu());
            System.out.println();
        }
        assertNotNull(menuByUser);
    }
    
    @Test
    public void testLoadUsuarioWebByLogin() throws Exception {
        UsuarioWeb usuarioWeb = this.securityClientService.loadUsuarioWebByLogin(
                                                    "workflow_admin");
        System.out.println("User ::: " + usuarioWeb.getLogin());
        System.out.println("Pass ::: " + usuarioWeb.getPassword());
        System.out.println("fecha Alta ::: " + usuarioWeb.getFechaalta());
        System.out.println("Autority :::: " + usuarioWeb.getAuthoritys().size());
        assertNotNull(usuarioWeb);
    }

    @Test
    public void testGetSubMenuByUser() throws Exception {
        List<MenuWeb> subMenuByUser = this.securityClientService.getSubMenuByUser("workflow_admin", 48, 481);
        
        for (MenuWeb menuWeb : subMenuByUser) {
            System.out.println("Nombre Menu :: " + menuWeb.getNombre());
            System.out.println("Nombre Descripcion :: " + menuWeb.getDescripcion());
            System.out.println("Nombre Ruta :: " + menuWeb.getRuta());
            System.out.println("Nombre IdMenu :: " + menuWeb.getIdmenu());
            System.out.println();
        }
        
        assertNotNull(subMenuByUser);
    }
}
