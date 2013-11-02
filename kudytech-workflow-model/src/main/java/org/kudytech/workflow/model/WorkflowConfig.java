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
 * The persistent class for the WORKFLOW_CONFIG database table.
 *
 */
@Entity
@Table(name = "WORKFLOW_CONFIG")
public class WorkflowConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idworkflowConfig;
    private Boolean estatus;
    private Date fechaAlta;
    private String loginAlta;
    private Workflow workflow;
    private WorkflowEvent workflowEvent;
    private WorkflowState workflowNextState;
    private WorkflowState workflowCurrentState;

    public WorkflowConfig() {
    }

    @Id
    @Column(name = "IDWORKFLOW_CONFIG")
    public long getIdworkflowConfig() {
        return this.idworkflowConfig;
    }

    public void setIdworkflowConfig(long idworkflowConfig) {
        this.idworkflowConfig = idworkflowConfig;
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

    @Column(name = "LOGIN_ALTA")
    public String getLoginAlta() {
        return this.loginAlta;
    }

    public void setLoginAlta(String loginAlta) {
        this.loginAlta = loginAlta;
    }

    //uni-directional many-to-one association to Workflow
    @ManyToOne
    @JoinColumn(name = "IDWORKFLOW")
    public Workflow getWorkflow() {
        return this.workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    //uni-directional many-to-one association to WorkflowEvent
    @ManyToOne
    @JoinColumn(name = "IDWORKFLOW_EVENT")
    public WorkflowEvent getWorkflowEvent() {
        return this.workflowEvent;
    }

    public void setWorkflowEvent(WorkflowEvent workflowEvent) {
        this.workflowEvent = workflowEvent;
    }

    //uni-directional many-to-one association to WorkflowState
    @ManyToOne
    @JoinColumn(name = "IDNEXT_STATE")
    public WorkflowState getWorkflowNextState() {
        return this.workflowNextState;
    }

    public void setWorkflowNextState(WorkflowState workflowNextState) {
        this.workflowNextState = workflowNextState;
    }

    //uni-directional many-to-one association to WorkflowState
    @ManyToOne
    @JoinColumn(name = "IDCURRENT_STATE")
    public WorkflowState getWorkflowCurrentState() {
        return this.workflowCurrentState;
    }

    public void setWorkflowCurrentState(WorkflowState workflowCurrentState) {
        this.workflowCurrentState = workflowCurrentState;
    }
}