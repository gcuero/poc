package org.kudytech.confsistema.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.kudytech.jackson.utils.DateSerializer;

/**
 * The persistent class for the CONF_SISTEMA database table.
 *
 */
@Entity
@Table(name = "CONF_SISTEMA")
public class ConfSistema implements Serializable {

    private static final long serialVersionUID = 1L;
    private ConfSistemaPK id;
    private String descripcion;
    private Boolean estatus;
    private Date fechaModif;
    private String loginModif;
    private String tipoValor;
    private byte[] valorblob;
    private Date valordate;
    private Long valornum;
    private String valorstr;

    public ConfSistema() {
    }

    @EmbeddedId
    public ConfSistemaPK getId() {
        return this.id;
    }

    public void setId(ConfSistemaPK id) {
        this.id = id;
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

    @JsonSerialize(using = DateSerializer.class,
        include=JsonSerialize.Inclusion.NON_NULL)
    @Temporal( TemporalType.TIMESTAMP)
    @Column(name = "FECHA_MODIF")
    public Date getFechaModif() {
        return this.fechaModif;
    }

    public void setFechaModif(Date fechaModif) {
        this.fechaModif = fechaModif;
    }

    
    @Column(name = "LOGIN_MODIF")
    public String getLoginModif() {
        return this.loginModif;
    }

    public void setLoginModif(String loginModif) {
        this.loginModif = loginModif;
    }

    @Column(name = "TIPO_VALOR")
    public String getTipoValor() {
        return this.tipoValor;
    }

    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }

    @Lob()
    public byte[] getValorblob() {
        return this.valorblob;
    }

    public void setValorblob(byte[] valorblob) {
        this.valorblob = valorblob;
    }

    @JsonSerialize(using = DateSerializer.class,
        include=JsonSerialize.Inclusion.NON_NULL)
    @Temporal( TemporalType.TIMESTAMP)
    public Date getValordate() {
        return this.valordate;
    }

    public void setValordate(Date valordate) {
        this.valordate = valordate;
    }

    public Long getValornum() {
        return this.valornum;
    }

    public void setValornum(Long valornum) {
        this.valornum = valornum;
    }

    public String getValorstr() {
        return this.valorstr;
    }

    public void setValorstr(String valorstr) {
        this.valorstr = valorstr;
    }
}