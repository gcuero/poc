/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.web;

import java.io.Serializable;

/**
 *
 * @author gcuero
 */
public class MenuWeb implements Serializable {

    private double idmenu;
    private String descripcion;
    private String icono;
    private String nombre;
    private String onClick;
    private String ruta;
    private String separator;
    private String status;
    private double idAplicacion;
    private double idMenuParent;

    public double getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(double idmenu) {
        this.idmenu = idmenu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(double idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public double getIdMenuParent() {
        return idMenuParent;
    }

    public void setIdMenuParent(double idMenuParent) {
        this.idMenuParent = idMenuParent;
    }
}
