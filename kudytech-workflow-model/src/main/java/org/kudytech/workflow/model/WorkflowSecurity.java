package org.kudytech.workflow.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the WORKFLOW_SECURITY database table.
 *
 */
@Entity
@Table(name = "WORKFLOW_SECURITY")
public class WorkflowSecurity implements Serializable {

    private static final long serialVersionUID = 1L;
    private WorkflowSecurityPK id;
    private Boolean allowEvent;
    private Boolean allowState;
    private Boolean estatus;
    private Date fechaAlta;
    private Date fechaModif;
    private String loginAlta;
    private String loginModif;
    private WorkflowConfig workflowConfig;

    public WorkflowSecurity() {
    }

    @EmbeddedId
    public WorkflowSecurityPK getId() {
        return this.id;
    }

    public void setId(WorkflowSecurityPK id) {
        this.id = id;
    }

    @Column(name = "ALLOW_EVENT")
    public Boolean getAllowEvent() {
        return this.allowEvent;
    }

    public void setAllowEvent(Boolean allowEvent) {
        this.allowEvent = allowEvent;
    }

    @Column(name = "ALLOW_STATE")
    public Boolean getAllowState() {
        return this.allowState;
    }

    public void setAllowState(Boolean allowState) {
        this.allowState = allowState;
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

    //uni-directional many-to-one association to WorkflowConfig
    @ManyToOne
    @JoinColumn(name = "IDWORKFLOW_CONFIG", insertable = false, updatable=false)
    public WorkflowConfig getWorkflowConfig() {
        return this.workflowConfig;
    }

    public void setWorkflowConfig(WorkflowConfig workflowConfig) {
        this.workflowConfig = workflowConfig;
    }
}