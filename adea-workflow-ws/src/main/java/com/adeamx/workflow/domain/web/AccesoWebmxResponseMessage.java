/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.web;

import com.adeamx.workflow.domain.AbstractSimpleResponseMessage;
import org.kudytech.adeamx.mexweb.model.AccesoWebmx;

/**
 *
 * @author gcuero
 */
public class AccesoWebmxResponseMessage extends AbstractSimpleResponseMessage {

    private AccesoWebmx accesoWebmx;

    public AccesoWebmx getAccesoWebmx() {
        return accesoWebmx;
    }

    public void setAccesoWebmx(AccesoWebmx accesoWebmx) {
        this.accesoWebmx = accesoWebmx;
    }
}
