/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.web;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gcuero
 */
public class UsuarioWeb implements Serializable{

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
    private List<Authority> authoritys;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getCliente() {
        return cliente;
    }

    public void setCliente(double cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public Date getFecharevocado() {
        return fecharevocado;
    }

    public void setFecharevocado(Date fecharevocado) {
        this.fecharevocado = fecharevocado;
    }

    public double getIntentos() {
        return intentos;
    }

    public void setIntentos(double intentos) {
        this.intentos = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Authority> getAuthoritys() {
        return authoritys;
    }

    public void setAuthoritys(List<Authority> authoritys) {
        this.authoritys = authoritys;
    }
}
