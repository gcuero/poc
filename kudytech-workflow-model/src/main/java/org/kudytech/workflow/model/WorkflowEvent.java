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
 * The persistent class for the WORKFLOW_EVENT database table.
 *
 */
@Entity
@Table(name = "WORKFLOW_EVENT")
public class WorkflowEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    private String idworkflowEvent;
    private String description;
    private Boolean estatus;
    private Date fechaAlta;
    private String icon;
    private String loginAlta;

    public WorkflowEvent() {
    }

    @Id
    @Column(name = "IDWORKFLOW_EVENT")
    public String getIdworkflowEvent() {
        return this.idworkflowEvent;
    }

    public void setIdworkflowEvent(String idworkflowEvent) {
        this.idworkflowEvent = idworkflowEvent;
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
}