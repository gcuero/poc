package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the USUARIO_WEBMX database table.
 *
 */
@Entity
@Table(name = "USUARIO_WEBMX")
public class UsuarioWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    private String login;
    private double cliente;
    private String email;
    private Date fechaalta;
    private Date fechabaja;
    private Date fecharevocado;
    private double intentos;
    private String nombre;
    private String password;
    private String status;
    private List<CreditoWebmx> creditoWebmxs;
    private List<TarjetaWebmx> tarjetaWebmxs;
    private List<AplicacionWebmx> aplicacionWebmxs;
    private List<Authority> authorities;
    private List<RolWebmx> rolWebmxs;

    public UsuarioWebmx() {
    }

    @Id
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getCliente() {
        return this.cliente;
    }

    public void setCliente(double cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name="FECHAALTA", length = 7)
    public Date getFechaalta() {
        return this.fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name="FECHABAJA", length = 7)
    public Date getFechabaja() {
        return this.fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name="FECHAREVOCADO", length = 7)
    public Date getFecharevocado() {
        return this.fecharevocado;
    }

    public void setFecharevocado(Date fecharevocado) {
        this.fecharevocado = fecharevocado;
    }

    public double getIntentos() {
        return this.intentos;
    }

    public void setIntentos(double intentos) {
        this.intentos = intentos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //bi-directional many-to-one association to CreditoWebmx
    @OneToMany(mappedBy = "usuarioWebmx")
    public List<CreditoWebmx> getCreditoWebmxs() {
        return this.creditoWebmxs;
    }

    public void setCreditoWebmxs(List<CreditoWebmx> creditoWebmxs) {
        this.creditoWebmxs = creditoWebmxs;
    }

    //bi-directional many-to-one association to TarjetaWebmx
    @OneToMany(mappedBy = "usuarioWebmx")
    public List<TarjetaWebmx> getTarjetaWebmxs() {
        return this.tarjetaWebmxs;
    }

    public void setTarjetaWebmxs(List<TarjetaWebmx> tarjetaWebmxs) {
        this.tarjetaWebmxs = tarjetaWebmxs;
    }

    //bi-directional many-to-many association to AplicacionWebmx
    @ManyToMany
    @JoinTable(
		name = "GRANTAPP_WEBMX", joinColumns = {
        @JoinColumn(name = "LOGIN")
    }, inverseJoinColumns = {
        @JoinColumn(name = "IDAPLICACION")
    })
    public List<AplicacionWebmx> getAplicacionWebmxs() {
        return this.aplicacionWebmxs;
    }

    public void setAplicacionWebmxs(List<AplicacionWebmx> aplicacionWebmxs) {
        this.aplicacionWebmxs = aplicacionWebmxs;
    }

    //bi-directional many-to-many association to Authority
    @ManyToMany
    @JoinTable(
		name = "GRANTED_USER", joinColumns = {
        @JoinColumn(name = "USERNAME")
    }, inverseJoinColumns = {
        @JoinColumn(name = "ID_AUTHORITY")
    })
    public List<Authority> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    //bi-directional many-to-many association to RolWebmx
    @ManyToMany
    @JoinTable(
		name = "GRANTROL_WEBMX", joinColumns = {
        @JoinColumn(name = "LOGIN")
    }, inverseJoinColumns = {
        @JoinColumn(name = "IDROL")
    })
    public List<RolWebmx> getRolWebmxs() {
        return this.rolWebmxs;
    }

    public void setRolWebmxs(List<RolWebmx> rolWebmxs) {
        this.rolWebmxs = rolWebmxs;
    }
}