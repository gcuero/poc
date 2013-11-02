package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the ACCESO_WEBMX database table.
 *
 */
@Embeddable
public class AccesoWebmxPK implements Serializable {
    //default serial version id, required for serializable classes.

    private static final long serialVersionUID = 1L;
    private String login;
    private Date fechalogin;

    public AccesoWebmxPK() {
    }

    public AccesoWebmxPK(String login, Date fechaLogin) {
        this.login = login;
        this.fechalogin = fechaLogin;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name="FECHALOGIN", length = 7)
    public java.util.Date getFechalogin() {
        return this.fechalogin;
    }

    public void setFechalogin(java.util.Date fechalogin) {
        this.fechalogin = fechalogin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccesoWebmxPK)) {
            return false;
        }
        AccesoWebmxPK castOther = (AccesoWebmxPK) other;
        return this.login.equals(castOther.login)
                && this.fechalogin.equals(castOther.fechalogin);

    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.login.hashCode();
        hash = hash * prime + this.fechalogin.hashCode();

        return hash;
    }
}