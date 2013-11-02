package org.kudytech.confsistema.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 * The primary key class for the CONF_SISTEMA database table.
 *
 */
@Embeddable
public class ConfSistemaPK implements Serializable {
    //default serial version id, required for serializable classes.

    private static final long serialVersionUID = 1L;
    private String idvariable;
    private String variable;

    public ConfSistemaPK() {
    }

    public String getIdvariable() {
        return this.idvariable;
    }

    public void setIdvariable(String idvariable) {
        this.idvariable = idvariable;
    }

    public String getVariable() {
        return this.variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfSistemaPK)) {
            return false;
        }
        ConfSistemaPK castOther = (ConfSistemaPK) other;
        return this.idvariable.equals(castOther.idvariable)
                && this.variable.equals(castOther.variable);

    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.idvariable.hashCode();
        hash = hash * prime + this.variable.hashCode();

        return hash;
    }
}