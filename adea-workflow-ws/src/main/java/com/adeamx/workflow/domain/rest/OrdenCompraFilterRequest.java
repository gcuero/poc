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
public class OrdenCompraFilterRequest extends RESTFulRequest {

    protected Date fechaInicio;
    protected Date fechaFin;
    protected String loginAlta;
    protected Long idCentroCostos;
    protected Long idProveedor;
    protected String state;

    @JsonSerialize(using = DateSerializer.class,
    include = JsonSerialize.Inclusion.NON_NULL)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @JsonSerialize(using = DateSerializer.class,
    include = JsonSerialize.Inclusion.NON_NULL)
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getLoginAlta() {
        return loginAlta;
    }

    public void setLoginAlta(String loginAlta) {
        this.loginAlta = loginAlta;
    }

    public Long getIdCentroCostos() {
        return idCentroCostos;
    }

    public void setIdCentroCostos(Long idCentroCostos) {
        this.idCentroCostos = idCentroCostos;
    }

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
