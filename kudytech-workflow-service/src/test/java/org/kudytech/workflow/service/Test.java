/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.kudytech.workflow.model.ConfColor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author gcuero
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/model/context/applicationContext.xml"})
public class Test {

    @org.junit.Test
    public void testCanTranscendObject() throws Exception {
        System.out.println("Error ::: " + ConfColor.class);
    }
}
