package org.kudytech.adeamx.mexweb.model;
// Generated 22-feb-2012 21:58:17 by Hibernate Tools 3.2.1.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TransaccionWebmx generated by hbm2java
 */
@Entity
@Table(name = "TRANSACCION_WEBMX")
public class TransaccionWebmx implements java.io.Serializable {

    private long folio;
    private Date fechatransaccion;
    private String transaccion;
    private String detalle;
    private Date fechalogin;
    private String login;
    private double idaplicacion;

    public TransaccionWebmx() {
    }

    public TransaccionWebmx(long folio, String transaccion,
            double idaplicacion) {
        this.folio = folio;
        this.transaccion = transaccion;
        this.idaplicacion = idaplicacion;
    }

    public TransaccionWebmx(long folio, Date fechatransaccion,
            String transaccion, String detalle, double idaplicacion) {
        this.folio = folio;

        this.fechatransaccion = fechatransaccion;
        this.transaccion = transaccion;
        this.detalle = detalle;
        this.idaplicacion = idaplicacion;
    }

    @SequenceGenerator(name = "Emp_Gen", sequenceName = "FOLIOTRANSACCION")
    @Id
    @GeneratedValue(generator = "Emp_Gen")
    @Column(name = "FOLIO", unique = true, precision = 126, scale = 0)
    public long getFolio() {
        return this.folio;
    }

    public void setFolio(long folio) {
        this.folio = folio;
    }

    /**
     *
     * @return
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHATRANSACCION", length = 7)
    public Date getFechatransaccion() {
        return this.fechatransaccion;
    }

    public void setFechatransaccion(Date fechatransaccion) {
        this.fechatransaccion = fechatransaccion;
    }

    @Column(name = "TRANSACCION", nullable = false, length = 200)
    public String getTransaccion() {
        return this.transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    @Column(name = "DETALLE", length = 1000)
    public String getDetalle() {
        return this.detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Column(name = "IDAPLICACION", nullable = false, precision = 126, scale = 0)
    public double getIdaplicacion() {
        return this.idaplicacion;
    }

    public void setIdaplicacion(double idaplicacion) {
        this.idaplicacion = idaplicacion;
    }

    @Column(name = "LOGIN", length = 20)
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHALOGIN", length = 7)
    public Date getFechalogin() {
        return fechalogin;
    }

    public void setFechalogin(Date fechalogin) {
        this.fechalogin = fechalogin;
    }
}