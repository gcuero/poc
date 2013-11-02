/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.mobile.security.domain;

import java.util.Date;

/**
 *
 * @author gcuero
 */
public class UserDetail {

    protected String login;
    protected String nombre;
    protected String email;
    protected String token;
    protected Date fechaUltimoAcceso;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getFechaUltimoAcceso() {
        return fechaUltimoAcceso;
    }

    public void setFechaUltimoAcceso(Date fechaUltimoAcceso) {
        this.fechaUltimoAcceso = fechaUltimoAcceso;
    }
}
