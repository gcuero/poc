package org.kudytech.adeamx.mexweb.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 * The primary key class for the CLAVE_WEBMX database table.
 *
 */
@Embeddable
public class ClaveWebmxPK implements Serializable {
    //default serial version id, required for serializable classes.

    private static final long serialVersionUID = 1L;
    private double idtarjeta;
    private double posicion;

    public ClaveWebmxPK() {
    }

    public double getIdtarjeta() {
        return this.idtarjeta;
    }

    public void setIdtarjeta(double idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public double getPosicion() {
        return this.posicion;
    }

    public void setPosicion(double posicion) {
        this.posicion = posicion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaveWebmxPK)) {
            return false;
        }
        ClaveWebmxPK castOther = (ClaveWebmxPK) other;
        return (this.idtarjeta == castOther.idtarjeta)
                && (this.posicion == castOther.posicion);

    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + ((int) (java.lang.Double.doubleToLongBits(this.idtarjeta) ^ (java.lang.Double.doubleToLongBits(this.idtarjeta) >>> 32)));
        hash = hash * prime + ((int) (java.lang.Double.doubleToLongBits(this.posicion) ^ (java.lang.Double.doubleToLongBits(this.posicion) >>> 32)));

        return hash;
    }
}