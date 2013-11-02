/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain;

/**
 *
 * @author gcuero
 */
public class AbstractResponseMessage<T> extends AbstractSimpleResponseMessage{

    private T objectMessage;

    public T getObjectMessage() {
        return objectMessage;
    }

    public void setObjectMessage(T objectMessage) {
        this.objectMessage = objectMessage;
    }
}
