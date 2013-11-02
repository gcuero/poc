/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.rest;

import java.io.Serializable;

/**
 *
 * @author gcuero
 */
public class RESTFulRequest implements Serializable {

    protected String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
