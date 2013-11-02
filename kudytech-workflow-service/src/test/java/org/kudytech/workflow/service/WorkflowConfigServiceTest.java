/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.model.Workflow;
import org.kudytech.workflow.model.WorkflowConfig;
import org.kudytech.workflow.model.WorkflowEvent;
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
public class WorkflowConfigServiceTest {
    
    @Autowired
    WorkflowConfigService workflowConfigService;
    @Autowired
    WorkflowService workflowService;
    @Autowired
    WorkflowEventService workflowEventService;
    
    public WorkflowConfigServiceTest() {
    }

//    @Test
//    public void testGetWorkflowConfig() throws Exception {
//        System.out.println("getWorkflowConfig");
//        Workflow workflow = this.workflowService.getWorkflowById(1L);
//        WorkflowEvent workflowEvent = this.workflowEventService.getWorkflowEventById("donext");
//        WorkflowState workflowCurrentState = null;
//        Boolean estatus = Boolean.TRUE;
//        WorkflowConfig result = this.workflowConfigService.getWorkflowConfig(workflow, workflowEvent, workflowCurrentState, estatus);
//        assertNotNull(result);
//        System.out.println("WorjflowConfig :::::  " + result.getIdworkflowConfig());
//        System.out.println("WorjflowConfig.currentState :::::  " + result.getIdworkflowConfig());
//        System.out.println("WorjflowConfig.nextState :::::  " + result.getIdworkflowConfig());
//    }

    

    @Test
    public void testGetWorkflowConfig_4args_2() throws Exception {
        System.out.println("getWorkflowConfig");
        Long idworkflow = 1L;
        String idworkflowEvent = "donext";
        String idCurrentWorkflowState = null;   
        Boolean estatus = Boolean.TRUE;
        WorkflowConfig result = this.workflowConfigService.getWorkflowConfig(
                idworkflow, idworkflowEvent, idCurrentWorkflowState, estatus);
        assertNotNull(result);
        System.out.println("WorjflowConfig :::::  " + result.getIdworkflowConfig());
        System.out.println("WorjflowConfig.currentState :::::  " + result.getIdworkflowConfig());
        System.out.println("WorjflowConfig.nextState :::::  " + result.getIdworkflowConfig());
    }

   

   
}
