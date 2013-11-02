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
 * @author Erika
 */
public class GraphConfRequest extends RESTFulRequest {

    private String chartName;
    private Date fechaInicio;
    private Date fechaFin;

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

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
}
