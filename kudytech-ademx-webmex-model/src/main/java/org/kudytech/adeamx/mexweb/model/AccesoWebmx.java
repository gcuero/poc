package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ACCESO_WEBMX database table.
 *
 */
@Entity
@Table(name = "ACCESO_WEBMX")
public class AccesoWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    private AccesoWebmxPK id;
    private Date fechalogout;
    private String ip;

    public AccesoWebmx() {
    }

    @EmbeddedId
    public AccesoWebmxPK getId() {
        return this.id;
    }

    public void setId(AccesoWebmxPK id) {
        this.id = id;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name="FECHALOGOUT",  length = 7)
    public Date getFechalogout() {
        return this.fechalogout;
    }

    public void setFechalogout(Date fechalogout) {
        this.fechalogout = fechalogout;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}