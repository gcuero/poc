/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.services;

import com.adeamx.workflow.domain.UserDetail;
import java.util.GregorianCalendar;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service
public class AutenticationService extends AbstractService {

    private static final String ADMIN_USER = "admin";
    private static final String ADMIN_PASS = "admin";

    public UserDetail login(String user, String password) {
        if (user.equals(AutenticationService.ADMIN_USER)
                && password.equals(AutenticationService.ADMIN_PASS)) {
            UserDetail userDetail = new UserDetail();
            userDetail.setEmail("admin@admin.com");
            userDetail.setFechaUltimoAcceso(GregorianCalendar.getInstance().getTime());
            userDetail.setLogin("admin");
            return userDetail;
        } else {
            return null;
        }
    }
}
