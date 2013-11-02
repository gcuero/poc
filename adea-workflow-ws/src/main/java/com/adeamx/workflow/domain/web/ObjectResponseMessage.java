/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.web;

import com.adeamx.workflow.domain.AbstractSimpleResponseMessage;

/**
 *
 * @author jaymzhck
 */
public class ObjectResponseMessage<T> extends AbstractSimpleResponseMessage{
    
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
    
    
    
    
}
