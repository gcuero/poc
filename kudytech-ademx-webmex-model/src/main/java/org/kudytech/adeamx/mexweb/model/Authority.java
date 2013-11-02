package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * The persistent class for the AUTHORITY database table.
 *
 */
@Entity
public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;
    private String idAuthority;
    private String description;
    private String enabled;
    private List<MenuWebmx> menuWebmxs;
    private List<UsuarioWebmx> usuarioWebmxs;

    public Authority() {
    }

    @Id
    @Column(name = "ID_AUTHORITY")
    public String getIdAuthority() {
        return this.idAuthority;
    }

    public void setIdAuthority(String idAuthority) {
        this.idAuthority = idAuthority;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnabled() {
        return this.enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    //bi-directional many-to-many association to MenuWebmx
    @ManyToMany(mappedBy = "authorities")
    public List<MenuWebmx> getMenuWebmxs() {
        return this.menuWebmxs;
    }

    public void setMenuWebmxs(List<MenuWebmx> menuWebmxs) {
        this.menuWebmxs = menuWebmxs;
    }

    //bi-directional many-to-many association to UsuarioWebmx
    @ManyToMany(mappedBy = "authorities")
    public List<UsuarioWebmx> getUsuarioWebmxs() {
        return this.usuarioWebmxs;
    }

    public void setUsuarioWebmxs(List<UsuarioWebmx> usuarioWebmxs) {
        this.usuarioWebmxs = usuarioWebmxs;
    }
}