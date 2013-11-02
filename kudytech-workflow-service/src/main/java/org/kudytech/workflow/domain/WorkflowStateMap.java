/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.domain;

import java.io.Serializable;
import org.kudytech.workflow.model.WorkflowState;

/**
 *
 * @author gcuero
 */
public class WorkflowStateMap<T> implements Serializable{

    private WorkflowState state;
    private T Object;

    public WorkflowState getState() {
        return state;
    }

    public void setState(WorkflowState state) {
        this.state = state;
    }

    public T getObject() {
        return Object;
    }

    public void setObject(T Object) {
        this.Object = Object;
    }
}
