/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.rest;

/**
 *
 * @author gcuero
 */
public class WorkflowDoNextRequest extends RESTFulRequest {

    private Long idReferencia;
    private Long idConfObjeto;

    public Long getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(Long idReferencia) {
        this.idReferencia = idReferencia;
    }

    public Long getIdConfObjeto() {
        return idConfObjeto;
    }

    public void setIdConfObjeto(Long idConfObjeto) {
        this.idConfObjeto = idConfObjeto;
    }
}
