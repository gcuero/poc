/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.web;

/**
 *
 * @author gcuero
 */
public class Authority {

    private String idAuthority;
    private String description;
    private String enabled;

    public String getIdAuthority() {
        return idAuthority;
    }

    public void setIdAuthority(String idAuthority) {
        this.idAuthority = idAuthority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}
