/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.model.utils.ModelIdProvider;
import org.kudytech.workflow.domain.WorkflowStateMap;
import org.kudytech.workflow.model.Workflow;
import org.kudytech.workflow.model.WorkflowCtl;
import org.kudytech.workflow.model.WorkflowState;
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
//        Long idWorkFlow = 1L;
//        Workflow result = this.workflowService.getWorkflowById(idWorkFlow);
//        assertNotNull(result);
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
        Long idReferencia = 1L;
        Long idObjecto = 1L;
        String currentState = "NEW";
        String event = "donext";
        String autorithy = "COMPRAS_ADMINISTRADOR";
        WorkflowState result = this.workflowService.getNextState(idReferencia, idObjecto, currentState, event, autorithy);
        assertNotNull(result);
        System.out.println("WorkflowSate = " + result.getIdworkflowState());
    }

//    @Test
//    public void testDoNextTranscendObject() throws Exception {
//        System.out.println("doNextTranscendObject");
//        Long idReferencia = 1L;
//        Long idObjecto = 1L;
//        String login = "kudy_pba";
//        String autorithy = "COMPRAS_ADMINISTRADOR";
//        try {
//            this.workflowService.doNextTranscendObject(idReferencia, idObjecto,  login, autorithy);
//        } catch (Exception ex) {
//            fail("Fail message : " + ex.getMessage());
//        }
//    }
//    @Test
//    public void testTranscendObject() throws Exception {
//        System.out.println("transcendObject");
//        Long idReferencia = null;
//        Long idObjecto = null;
//        String currentState = "";
//        String event = "";
//        String login = "";
//        String autorithy = "";
//        WorkflowService instance = new WorkflowServiceImpl();
//        instance.transcendObject(idReferencia, idObjecto, currentState, event, login, autorithy);
//        fail("The test case is a prototype.");
//    }

//    @Test
//    public void testGetWorkflowById() throws Exception {
//        System.out.println("getWorkflowById");
//        Long idWorkFlow = null;
//        WorkflowService instance = new WorkflowServiceImpl();
//        Workflow expResult = null;
//        Workflow result = instance.getWorkflowById(idWorkFlow);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testCanTranscendObject_4args() throws Exception {
//        System.out.println("canTranscendObject");
//        Long idReferencia = null;
//        Long idObjecto = null;
//        String event = "";
//        String autorithy = "";
//        WorkflowService instance = new WorkflowServiceImpl();
//        Boolean expResult = null;
//        Boolean result = instance.canTranscendObject(idReferencia, idObjecto, event, autorithy);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testTranscendObject() throws Exception {
//        System.out.println("transcendObject");
//        Long idReferencia = null;
//        Long idObjecto = null;
//        String event = "";
//        String login = "";
//        String autorithy = "";
//        WorkflowService instance = new WorkflowServiceImpl();
//        WorkflowCtl expResult = null;
//        WorkflowCtl result = instance.transcendObject(idReferencia, idObjecto, event, login, autorithy);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetWorkflowStateByObject() throws Exception {
//        System.out.println("getWorkflowStateByObject");
//        ModelIdProvider object = null;
//        WorkflowService instance = new WorkflowServiceImpl();
//        WorkflowStateMap expResult = null;
//        WorkflowStateMap result = instance.getWorkflowStateByObject(object);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testDoNextByObject_3args() throws Exception {
//        System.out.println("doNextByObject");
//        ModelIdProvider object = null;
//        String login = "";
//        String autorithy = "";
//        WorkflowService instance = new WorkflowServiceImpl();
//        WorkflowCtl expResult = null;
//        WorkflowCtl result = instance.doNextByObject(object, login, autorithy);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testDoNextByObject_ModelIdProvider_String() throws Exception {
//        System.out.println("doNextByObject");
//        ModelIdProvider object = null;
//        String login = "";
//        WorkflowService instance = new WorkflowServiceImpl();
//        WorkflowCtl expResult = null;
//        WorkflowCtl result = instance.doNextByObject(object, login);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
    @Test
    public void testDoNextByIdReferenciaAndIdConfObjeto() throws Exception {
        System.out.println("doNextByIdReferenciaAndIdConfObjeto");
        Long idReferencia = 1L;
        Long idConfObjeto = 1L;
        String login = "kudy_pba";
        WorkflowCtl result = this.workflowService.doNextByIdReferenciaAndIdConfObjeto(idReferencia, idConfObjeto, login);
        assertNotNull(result);
        System.out.println("WorkflowCtl ::::  " + result.getIdworkflowCtl());
    }
    
    @Test
    public void testDoNextByIdReferenciaAndIdConfObjetoNew() throws Exception {
        System.out.println("doNextByIdReferenciaAndIdConfObjeto");
        Long idReferencia = 999L;
        Long idConfObjeto = 1L;
        String login = "kudy_pba";
        WorkflowCtl result = this.workflowService.doNextByIdReferenciaAndIdConfObjeto(idReferencia, idConfObjeto, login);
        assertNotNull(result);
        System.out.println("WorkflowCtl ::::  " + result.getIdworkflowCtl());
    }
//
    @Test
    public void testCanTranscendObject_3args() throws Exception {
        System.out.println("canTranscendObject");
        ModelIdProvider object = new Solicitud();
        String login = "kudy_pba";
        String event = "donext";
        Boolean result = this.workflowService.canTranscendObject(object, login, event);
        assertTrue(result);
        
    }

    @Test
    public void testCanDoNextObject_ModelIdProvider_String() throws Exception {
        System.out.println("canDoNextObject");
        ModelIdProvider object = new Solicitud();
        String login = "kudy_pba";
        Boolean result = this.workflowService.canDoNextObject(object, login);
        assertTrue(result);
    }

    @Test
    public void testCanDoNextObject_3args() throws Exception {
        System.out.println("canDoNextObject");
        Long idReferencia = 1L;
        Long idConfObjeto = 1L;
        String login = "kudy_pba";
        Boolean result = this.workflowService.canDoNextObject(idReferencia, idConfObjeto, login);
        assertTrue(result);
        
    }

    private static class Solicitud implements ModelIdProvider {

        public Solicitud() {
        }

        public Long getId() {
            return 1L;
        }
    }

    

}
