/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain;

import org.kudytech.confsistema.model.ConfSistema;

/**
 *
 * @author gcuero
 */
public class ConfSistemaResponseMessage extends AbstractSimpleResponseMessage{
    
    private ConfSistema objectMessage;

    public ConfSistema getObjectMessage() {
        return objectMessage;
    }

    public void setObjectMessage(ConfSistema objectMessage) {
        this.objectMessage = objectMessage;
    }
}
