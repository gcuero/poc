/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.ws.service;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.kudytech.workflow.ws.domain.Workflow;
import org.kudytech.workflow.ws.domain.WorkflowCtl;
import org.kudytech.workflow.ws.domain.WorkflowState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author gcuero
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/model/context/applicationContext.xml"})
public class WorkflowServiceTest {

    @Autowired
    WorkflowService workflowService;

    public WorkflowServiceTest() {
    }

//    @Test
//    public void testGetWorkflowById() throws Exception {
//        System.out.println("getWorkflowById");
//        Long idWorkFlow = null;
//        Workflow result = this.workflowService.getWorkflowById(idWorkFlow);
//        assertEquals(expResult, result);
//
//    }

    @Test
    public void testCanTranscendObject() throws Exception {
        System.out.println("canTranscendObject");
        Long idReferencia = 1L;
        Long idObjecto = 1L;
        String event = "donext";
        String autorithy = "COMPRAS_ADMINISTRADOR";
        Boolean result = this.workflowService.canTranscendObject(
                idReferencia, idObjecto, event, autorithy);
        assertTrue(result);
    }

    @Test
    public void testGetNextState() throws Exception {
        System.out.println("getNextState");
        Long idReferencia = 999L;
        Long idObjecto = 1L;
        String currentState = "NEW";
        String event = "donext";
        String autorithy = "COMPRAS_ADMINISTRADOR";
        WorkflowState result = 
                this.workflowService.getNextState(
                idReferencia, idObjecto, currentState, event, autorithy);
        assertNotNull(result);
    }

    @Test
    public void testDoNextTranscendObject() throws Exception {
        System.out.println("doNextTranscendObject");
        Long idReferencia = 1L;
        Long idObjecto = 1L;
        String login = "kudy_pba";
        String autorithy = "COMPRAS_ADMINISTRADOR";
        WorkflowCtl result = 
                this.workflowService.doNextTranscendObject(
                idReferencia, idObjecto, login, autorithy);
        assertNotNull(result);

    }

    @Test
    public void testTranscendObject() throws Exception {
        System.out.println("transcendObject");
        Long idReferencia = 1L;
        Long idObjecto = 1L;
        String event = "donext";
        String login = "kudy_pba";
        String autorithy = "COMPRAS_ADMINISTRADOR";
        WorkflowCtl result = 
                this.workflowService.transcendObject(
                idReferencia, idObjecto, event, login, autorithy);
        assertNotNull(result);
    }

    @Test
    public void testDoNextByIdReferenciaAndIdConfObjeto() throws Exception {
        System.out.println("doNextByIdReferenciaAndIdConfObjeto");
        Long idReferencia = 1L;
        Long idConfObjeto = 1L;
        String login = "kudy_pba";
        WorkflowCtl result = 
                this.workflowService.doNextByIdReferenciaAndIdConfObjeto(
                idReferencia, idConfObjeto, login);
        assertNotNull(result);
    }

    @Test
    public void testCanDoNextObject() throws Exception {
        System.out.println("canDoNextObject");
        Long idReferencia = 1L;
        Long idConfObjeto = 1L;
        String login = "kudy_pba";
        Boolean result = this.workflowService.canDoNextObject(idReferencia, idConfObjeto, login);
        assertTrue(result);
    }
//
//    @Test
//    public void testGetIdConfObjeto() throws Exception {
//        System.out.println("getIdConfObjeto");
//        Class clazz = null;
//        WorkflowService instance = new WorkflowServiceImpl();
//        Long expResult = null;
//        Long result = instance.getIdConfObjeto(clazz);
//        assertEquals(expResult, result);
//
//    }

    @Test
    public void testGetIdConfObjetoByClassName() throws Exception {
        System.out.println("getIdConfObjetoByClassName");
        String className = "Solicitud";
        Long result = this.workflowService.getIdConfObjetoByClassName(className);
        assertNotNull(result);

    }
}
