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
 * The persistent class for the CONF_OBJETO database table.
 *
 */
@Entity
@Table(name = "CONF_OBJETO")
public class ConfObjeto implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idobjeto;
    private String clazz;
    private String descripcion;
    private Boolean estatus;
    private Date fechaAlta;
    private Date fechaModif;
    private String idinitialState;
    private String idreferencia;
    private String loginAlta;
    private String loginModif;
    private String nombre;
    private String tablaRelacionada;
    private Boolean tipoObjeto;
    private ConfModulo confModulo;
    private Workflow workflow;

    public ConfObjeto() {
    }

    @Id
    public long getIdobjeto() {
        return this.idobjeto;
    }

    public void setIdobjeto(long idobjeto) {
        this.idobjeto = idobjeto;
    }

    @Column(name = "CLASS")
    public String getClazz() {
        return this.clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
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

    @Column(name = "IDINITIAL_STATE")
    public String getIdinitialState() {
        return this.idinitialState;
    }

    public void setIdinitialState(String idinitialState) {
        this.idinitialState = idinitialState;
    }

    public String getIdreferencia() {
        return this.idreferencia;
    }

    public void setIdreferencia(String idreferencia) {
        this.idreferencia = idreferencia;
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

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "TABLA_RELACIONADA")
    public String getTablaRelacionada() {
        return this.tablaRelacionada;
    }

    public void setTablaRelacionada(String tablaRelacionada) {
        this.tablaRelacionada = tablaRelacionada;
    }

    @Column(name = "TIPO_OBJETO")
    public Boolean getTipoObjeto() {
        return this.tipoObjeto;
    }

    public void setTipoObjeto(Boolean tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    //uni-directional many-to-one association to ConfModulo
    @ManyToOne
    @JoinColumn(name = "IDMODULO")
    public ConfModulo getConfModulo() {
        return this.confModulo;
    }

    public void setConfModulo(ConfModulo confModulo) {
        this.confModulo = confModulo;
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
}