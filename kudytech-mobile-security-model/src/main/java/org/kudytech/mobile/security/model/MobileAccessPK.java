package org.kudytech.mobile.security.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the MOBILE_ACCESS database table.
 *
 */
@Embeddable
public class MobileAccessPK implements Serializable {
    //default serial version id, required for serializable classes.

    private static final long serialVersionUID = 1L;
    private String login;
    private String accesToken;

    public MobileAccessPK() {
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "ACCES_TOKEN")
    public String getAccesToken() {
        return this.accesToken;
    }

    public void setAccesToken(String accesToken) {
        this.accesToken = accesToken;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAccessPK)) {
            return false;
        }
        MobileAccessPK castOther = (MobileAccessPK) other;
        return this.login.equals(castOther.login)
                && this.accesToken.equals(castOther.accesToken);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.login.hashCode();
        hash = hash * prime + this.accesToken.hashCode();

        return hash;
    }
}