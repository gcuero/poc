package org.kudytech.workflow.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the WORKFLOW_STATE database table.
 *
 */
@Entity
@Table(name = "WORKFLOW_STATE")
public class WorkflowState implements Serializable {

    private static final long serialVersionUID = 1L;
    private String idworkflowState;
    private String description;
    private Boolean estatus;
    private Date fechaAlta;
    private Date fechaModif;
    private String icon;
    private String loginAlta;
    private String loginModif;
    private ConfColor confColor;

    public WorkflowState() {
    }

    @Id
    @Column(name = "IDWORKFLOW_STATE")
    public String getIdworkflowState() {
        return this.idworkflowState;
    }

    public void setIdworkflowState(String idworkflowState) {
        this.idworkflowState = idworkflowState;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    //uni-directional many-to-one association to ConfColor
    @ManyToOne
    @JoinColumn(name = "IDCOLOR")
    public ConfColor getConfColor() {
        return this.confColor;
    }

    public void setConfColor(ConfColor confColor) {
        this.confColor = confColor;
    }
}