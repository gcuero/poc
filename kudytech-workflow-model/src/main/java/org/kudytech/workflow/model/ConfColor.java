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
 * The persistent class for the CONF_COLOR database table.
 *
 */
@Entity
@Table(name = "CONF_COLOR")
public class ConfColor implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idcolor;
    private String descripcion;
    private Boolean estatus;
    private Date fechaAlta;
    private Date fechaModif;
    private String loginAlta;
    private String loginModif;
    private String setcolor;

    public ConfColor() {
    }

    @Id
    public long getIdcolor() {
        return this.idcolor;
    }

    public void setIdcolor(long idcolor) {
        this.idcolor = idcolor;
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

    public String getSetcolor() {
        return this.setcolor;
    }

    public void setSetcolor(String setcolor) {
        this.setcolor = setcolor;
    }
}