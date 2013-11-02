package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the CREDITO_WEBMX database table.
 *
 */
@Entity
@Table(name = "CREDITO_WEBMX")
public class CreditoWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    private double idcredito;
    private Date fechafin;
    private Date fechainicio;
    private double noaccesos;
    private String status;
    private UsuarioWebmx usuarioWebmx;

    public CreditoWebmx() {
    }

    @Id
    public double getIdcredito() {
        return this.idcredito;
    }

    public void setIdcredito(double idcredito) {
        this.idcredito = idcredito;
    }

    @Temporal( TemporalType.DATE)
    public Date getFechafin() {
        return this.fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    @Temporal( TemporalType.DATE)
    public Date getFechainicio() {
        return this.fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public double getNoaccesos() {
        return this.noaccesos;
    }

    public void setNoaccesos(double noaccesos) {
        this.noaccesos = noaccesos;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //bi-directional many-to-one association to UsuarioWebmx
    @ManyToOne
    @JoinColumn(name = "LOGIN")
    public UsuarioWebmx getUsuarioWebmx() {
        return this.usuarioWebmx;
    }

    public void setUsuarioWebmx(UsuarioWebmx usuarioWebmx) {
        this.usuarioWebmx = usuarioWebmx;
    }
}