package org.kudytech.workflow.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the WORKFLOW_CTL database table.
 *
 */
@Entity
@Table(name = "WORKFLOW_CTL")
public class WorkflowCtl implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idworkflowCtl;
    private Date fecha;
    private Long idreferencia;
    private String login;
    private ConfObjeto confObjeto;
    private WorkflowState workflowCurrentState;

    public WorkflowCtl() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "h_seq_idworkflow_ctl")
    @SequenceGenerator(name = "h_seq_idworkflow_ctl", sequenceName = "seq_idworkflow_ctl")
    @Column(name = "IDWORKFLOW_CTL", unique = true, nullable = false, precision = 10)
    public long getIdworkflowCtl() {
        return this.idworkflowCtl;
    }

    public void setIdworkflowCtl(long idworkflowCtl) {
        this.idworkflowCtl = idworkflowCtl;
    }

    @Temporal( TemporalType.DATE)
    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getIdreferencia() {
        return this.idreferencia;
    }

    public void setIdreferencia(Long idreferencia) {
        this.idreferencia = idreferencia;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    //uni-directional many-to-one association to ConfObjeto
    @ManyToOne
    @JoinColumn(name = "IDOBJETO")
    public ConfObjeto getConfObjeto() {
        return this.confObjeto;
    }

    public void setConfObjeto(ConfObjeto confObjeto) {
        this.confObjeto = confObjeto;
    }

    //uni-directional many-to-one association to WorkflowState
    @ManyToOne
    @JoinColumn(name = "CURRENT_STATE")
    public WorkflowState getWorkflowCurrentState() {
        return this.workflowCurrentState;
    }

    public void setWorkflowCurrentState(WorkflowState workflowCurrentState) {
        this.workflowCurrentState = workflowCurrentState;
    }
}