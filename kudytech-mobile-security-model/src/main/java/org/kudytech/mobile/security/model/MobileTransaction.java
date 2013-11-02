package org.kudytech.mobile.security.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the MOBILE_TRANSACTION database table.
 *
 */
@Entity
@Table(name = "MOBILE_TRANSACTION")
public class MobileTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    private long folio;
    private Date fechaTransaccion;
    private String transaccion;
    private MobileAccess mobileAccess;

    public MobileTransaction() {
    }

    @Id
    public long getFolio() {
        return this.folio;
    }

    public void setFolio(long folio) {
        this.folio = folio;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name = "FECHA_TRANSACCION", length = 7)
    public Date getFechaTransaccion() {
        return this.fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getTransaccion() {
        return this.transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    //bi-directional many-to-one association to MobileAccess
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "ACCES_TOKEN", referencedColumnName = "ACCES_TOKEN"),
        @JoinColumn(name = "LOGIN", referencedColumnName = "LOGIN")
    })
    public MobileAccess getMobileAccess() {
        return this.mobileAccess;
    }

    public void setMobileAccess(MobileAccess mobileAccess) {
        this.mobileAccess = mobileAccess;
    }
}