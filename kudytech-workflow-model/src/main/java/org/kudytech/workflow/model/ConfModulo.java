package org.kudytech.workflow.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the CONF_MODULO database table.
 *
 */
@Entity
@Table(name = "CONF_MODULO")
public class ConfModulo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idmodulo;
    private String descripcion;
    private Boolean estatus;
    private Date fechaAlta;
    private Date fechaModif;
    private Long idaplicacion;
    private String loginAlta;
    private String loginModif;
    private String prefijo;

    public ConfModulo() {
    }

    @Id
    public long getIdmodulo() {
        return this.idmodulo;
    }

    public void setIdmodulo(long idmodulo) {
        this.idmodulo = idmodulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstatus() {
        return this.estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    @Temporal( TemporalType.DATE)
    @Column(name = "FECHA_ALTA")
    public Date getFechaAlta() {
        return this.fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Temporal( TemporalType.DATE)
    @Column(name = "FECHA_MODIF")
    public Date getFechaModif() {
        return this.fechaModif;
    }

    public void setFechaModif(Date fechaModif) {
        this.fechaModif = fechaModif;
    }

    public Long getIdaplicacion() {
        return this.idaplicacion;
    }

    public void setIdaplicacion(Long idaplicacion) {
        this.idaplicacion = idaplicacion;
    }

    @Column(name = "LOGIN_ALTA")
    public String getLoginAlta() {
        return this.loginAlta;
    }

    public void setLoginAlta(String loginAlta) {
        this.loginAlta = loginAlta;
    }

    @Column(name = "LOGIN_MODIF")
    public String getLoginModif() {
        return this.loginModif;
    }

    public void setLoginModif(String loginModif) {
        this.loginModif = loginModif;
    }

    public String getPrefijo() {
        return this.prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
}