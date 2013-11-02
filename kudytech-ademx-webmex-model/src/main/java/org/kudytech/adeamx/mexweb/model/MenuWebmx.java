package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the MENU_WEBMX database table.
 *
 */
@Entity
@Table(name = "MENU_WEBMX")
public class MenuWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    private double idmenu;
    private String descripcion;
    private String icono;
    private String nombre;
    private String onClick;
    private String ruta;
    private String separator;
    private String status;
    private AplicacionWebmx aplicacionWebmx;
    private List<Authority> authorities;
    private MenuWebmx menuWebmx;
    private List<MenuWebmx> menuWebmxs;
    private List<RolWebmx> rolWebmxs;

    public MenuWebmx() {
    }

    @Id
    public double getIdmenu() {
        return this.idmenu;
    }

    public void setIdmenu(double idmenu) {
        this.idmenu = idmenu;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIcono() {
        return this.icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "ON_CLICK")
    public String getOnClick() {
        return this.onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    public String getRuta() {
        return this.ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getSeparator() {
        return this.separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //bi-directional many-to-one association to AplicacionWebmx
    @ManyToOne
    @JoinColumn(name = "IDAPLICACION")
    public AplicacionWebmx getAplicacionWebmx() {
        return this.aplicacionWebmx;
    }

    public void setAplicacionWebmx(AplicacionWebmx aplicacionWebmx) {
        this.aplicacionWebmx = aplicacionWebmx;
    }

    //bi-directional many-to-many association to Authority
    @ManyToMany
    @JoinTable(
		name = "GRANTED_MENU", joinColumns = {
        @JoinColumn(name = "ID_MENU")
    }, inverseJoinColumns = {
        @JoinColumn(name = "ID_AUTHORITY")
    })
    public List<Authority> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    //bi-directional many-to-one association to MenuWebmx
    @ManyToOne
    @JoinColumn(name = "ID_PARENT")
    public MenuWebmx getMenuWebmx() {
        return this.menuWebmx;
    }

    public void setMenuWebmx(MenuWebmx menuWebmx) {
        this.menuWebmx = menuWebmx;
    }

    //bi-directional many-to-one association to MenuWebmx
    @OneToMany(mappedBy = "menuWebmx")
    public List<MenuWebmx> getMenuWebmxs() {
        return this.menuWebmxs;
    }

    public void setMenuWebmxs(List<MenuWebmx> menuWebmxs) {
        this.menuWebmxs = menuWebmxs;
    }

    //bi-directional many-to-many association to RolWebmx
    @ManyToMany(mappedBy = "menuWebmxs")
    public List<RolWebmx> getRolWebmxs() {
        return this.rolWebmxs;
    }

    public void setRolWebmxs(List<RolWebmx> rolWebmxs) {
        this.rolWebmxs = rolWebmxs;
    }
}