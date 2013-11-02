package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the APLICACION_WEBMX database table.
 *
 */
@Entity
@Table(name = "APLICACION_WEBMX")
public class AplicacionWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    private double idaplicacion;
    private String descripcion;
    private String icono;
    private String nombre;
    private String ruta;
    private String status;
    private List<MenuWebmx> menuWebmxs;
    private List<UsuarioWebmx> usuarioWebmxs;

    public AplicacionWebmx() {
    }

    @Id
    public double getIdaplicacion() {
        return this.idaplicacion;
    }

    public void setIdaplicacion(double idaplicacion) {
        this.idaplicacion = idaplicacion;
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

    public String getRuta() {
        return this.ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //bi-directional many-to-one association to MenuWebmx
    @OneToMany(mappedBy = "aplicacionWebmx")
    public List<MenuWebmx> getMenuWebmxs() {
        return this.menuWebmxs;
    }

    public void setMenuWebmxs(List<MenuWebmx> menuWebmxs) {
        this.menuWebmxs = menuWebmxs;
    }

    //bi-directional many-to-many association to UsuarioWebmx
    @ManyToMany(mappedBy = "aplicacionWebmxs")
    public List<UsuarioWebmx> getUsuarioWebmxs() {
        return this.usuarioWebmxs;
    }

    public void setUsuarioWebmxs(List<UsuarioWebmx> usuarioWebmxs) {
        this.usuarioWebmxs = usuarioWebmxs;
    }
}