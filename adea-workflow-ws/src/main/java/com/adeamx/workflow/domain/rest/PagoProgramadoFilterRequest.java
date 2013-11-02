/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.rest;

import com.adeamx.workflow.web.utils.DateSerializer;
import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author gcuero
 */
public class PagoProgramadoFilterRequest extends RESTFulRequest {

    protected Long idOrdenCompra;
    protected Long idCentroCosto;
    protected Date fechaInicioPago;
    protected Date fechaFinPago;
    protected String state;

    public Long getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(Long idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public Long getIdCentroCosto() {
        return idCentroCosto;
    }

    public void setIdCentroCosto(Long idCentroCosto) {
        this.idCentroCosto = idCentroCosto;
    }

    @JsonSerialize(using = DateSerializer.class,
        include=JsonSerialize.Inclusion.NON_NULL)
    public Date getFechaInicioPago() {
        return fechaInicioPago;
    }

    public void setFechaInicioPago(Date fechaInicioPago) {
        this.fechaInicioPago = fechaInicioPago;
    }

    @JsonSerialize(using = DateSerializer.class,
        include=JsonSerialize.Inclusion.NON_NULL)
    public Date getFechaFinPago() {
        return fechaFinPago;
    }

    public void setFechaFinPago(Date fechaFinPago) {
        this.fechaFinPago = fechaFinPago;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
