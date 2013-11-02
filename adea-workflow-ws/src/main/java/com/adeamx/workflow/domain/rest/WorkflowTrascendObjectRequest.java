/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.rest;

/**
 *
 * @author gcuero
 */
public class WorkflowTrascendObjectRequest extends WorkflowDoNextRequest {

    private String event;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
