/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adea.controller;

import org.kudytech.web.security.domain.UserDetails;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author gcuero
 */
public class AbstractSessionController {

    public UserDetails getUserLogged() {
        UserDetails ud =
                (UserDetails) SecurityContextHolder.getContext().
                getAuthentication().getPrincipal();
        return ud;
    }
}
