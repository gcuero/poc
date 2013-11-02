package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the TARJETA_WEBMX database table.
 *
 */
@Entity
@Table(name = "TARJETA_WEBMX")
public class TarjetaWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    private double idtarjeta;
    private Date fechaalta;
    private Date fechabaja;
    private String observaciones;
    private String status;
    private List<ClaveWebmx> claveWebmxs;
    private UsuarioWebmx usuarioWebmx;

    public TarjetaWebmx() {
    }

    @Id
    public double getIdtarjeta() {
        return this.idtarjeta;
    }

    public void setIdtarjeta(double idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    @Temporal( TemporalType.DATE)
    public Date getFechaalta() {
        return this.fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    @Temporal( TemporalType.DATE)
    public Date getFechabaja() {
        return this.fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //bi-directional many-to-one association to ClaveWebmx
    @OneToMany(mappedBy = "tarjetaWebmx")
    public List<ClaveWebmx> getClaveWebmxs() {
        return this.claveWebmxs;
    }

    public void setClaveWebmxs(List<ClaveWebmx> claveWebmxs) {
        this.claveWebmxs = claveWebmxs;
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