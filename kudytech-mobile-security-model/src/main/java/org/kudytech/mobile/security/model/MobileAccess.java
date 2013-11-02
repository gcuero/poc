package org.kudytech.mobile.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the MOBILE_ACCESS database table.
 *
 */
@Entity
@Table(name = "MOBILE_ACCESS")
public class MobileAccess implements Serializable {

    private static final long serialVersionUID = 1L;
    private MobileAccessPK id;
    private Boolean active;
    private Date fechaLogin;
    private Date fechaLogout;
    private Date fechaUltAcceso;
    private List<MobileTransaction> mobileTransactions;

    public MobileAccess() {
    }

    @EmbeddedId
    public MobileAccessPK getId() {
        return this.id;
    }

    public void setId(MobileAccessPK id) {
        this.id = id;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name = "FECHA_LOGIN", length = 7)
    public Date getFechaLogin() {
        return this.fechaLogin;
    }

    public void setFechaLogin(Date fechaLogin) {
        this.fechaLogin = fechaLogin;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name = "FECHA_LOGOUT", length = 7)
    public Date getFechaLogout() {
        return this.fechaLogout;
    }

    public void setFechaLogout(Date fechaLogout) {
        this.fechaLogout = fechaLogout;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ULT_ACCESO", length = 7)
    public Date getFechaUltAcceso() {
        return this.fechaUltAcceso;
    }

    public void setFechaUltAcceso(Date fechaUltAcceso) {
        this.fechaUltAcceso = fechaUltAcceso;
    }

    //bi-directional many-to-one association to MobileTransaction
    @OneToMany(mappedBy = "mobileAccess")
    public List<MobileTransaction> getMobileTransactions() {
        return this.mobileTransactions;
    }

    public void setMobileTransactions(List<MobileTransaction> mobileTransactions) {
        this.mobileTransactions = mobileTransactions;
    }
}