package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the CLAVE_WEBMX database table.
 *
 */
@Entity
@Table(name = "CLAVE_WEBMX")
public class ClaveWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    private ClaveWebmxPK id;
    private String caracteres;
    private TarjetaWebmx tarjetaWebmx;

    public ClaveWebmx() {
    }

    @EmbeddedId
    public ClaveWebmxPK getId() {
        return this.id;
    }

    public void setId(ClaveWebmxPK id) {
        this.id = id;
    }

    public String getCaracteres() {
        return this.caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }

    //bi-directional many-to-one association to TarjetaWebmx
    @ManyToOne
    @JoinColumn(name = "IDTARJETA")
    public TarjetaWebmx getTarjetaWebmx() {
        return this.tarjetaWebmx;
    }

    public void setTarjetaWebmx(TarjetaWebmx tarjetaWebmx) {
        this.tarjetaWebmx = tarjetaWebmx;
    }
}