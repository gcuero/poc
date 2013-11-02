package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * The persistent class for the ROL_WEBMX database table.
 *
 */
@Entity
@Table(name = "ROL_WEBMX")
public class RolWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    private double idrol;
    private String descripcion;
    private String nombre;
    private String status;
    private List<MenuWebmx> menuWebmxs;
    private List<UsuarioWebmx> usuarioWebmxs;

    public RolWebmx() {
    }

    @Id
    public double getIdrol() {
        return this.idrol;
    }

    public void setIdrol(double idrol) {
        this.idrol = idrol;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //bi-directional many-to-many association to MenuWebmx
    @ManyToMany
    @JoinTable(
		name = "PRIVILEGIO_WEBMX", joinColumns = {
        @JoinColumn(name = "IDROL")
    }, inverseJoinColumns = {
        @JoinColumn(name = "IDMENU")
    })
    public List<MenuWebmx> getMenuWebmxs() {
        return this.menuWebmxs;
    }

    public void setMenuWebmxs(List<MenuWebmx> menuWebmxs) {
        this.menuWebmxs = menuWebmxs;
    }

    //bi-directional many-to-many association to UsuarioWebmx
    @ManyToMany(mappedBy = "rolWebmxs")
    public List<UsuarioWebmx> getUsuarioWebmxs() {
        return this.usuarioWebmxs;
    }

    public void setUsuarioWebmxs(List<UsuarioWebmx> usuarioWebmxs) {
        this.usuarioWebmxs = usuarioWebmxs;
    }
}