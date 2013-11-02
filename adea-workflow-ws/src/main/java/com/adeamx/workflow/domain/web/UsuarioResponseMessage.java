/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.web;

import com.adeamx.workflow.domain.AbstractSimpleResponseMessage;

/**
 *
 * @author gcuero
 */
public class UsuarioResponseMessage extends AbstractSimpleResponseMessage {

    private UsuarioWeb usuarioWeb;

    public UsuarioWeb getUsuarioWeb() {
        return usuarioWeb;
    }

    public void setUsuarioWeb(UsuarioWeb usuarioWeb) {
        this.usuarioWeb = usuarioWeb;
    }
}
