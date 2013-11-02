/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.web.security.handler;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.kudytech.web.security.domain.UserDetails;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 *
 * @author gcuero
 */
public class AuthenticationSuccessHandler implements
    org.springframework.security.web.authentication.AuthenticationSuccessHandler{

    @Override
    public void onAuthenticationSuccess(HttpServletRequest hsr, HttpServletResponse hsr1, Authentication a) throws IOException, ServletException {
       //lógica de tratamiento de autenticación correcta

//        UsuarioWebmx usu = (UsuarioWebmx) WebApplicationContextUtils.getWebApplicationContext(request.getServletContext()).getBean("userLogged");
//        UserDetails ud = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        usu.setLogin(ud.getUser().getLogin());
//        usu.setPassword(ud.getUser().getPassword());
//        usu.setNombre(ud.getUser().getNombre());
//        usu.setEmail(ud.getUser().getEmail());
//        usu.setStatus(ud.getUser().getStatus());
//        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd:hh:mm");
//        String formattedDate = formatoDelTexto.format(new Date());
//        Date fecha = null;
//        try {
//            fecha = formatoDelTexto.parse(formattedDate);
//        } catch (ParseException ex) {
//            ex.printStackTrace();
//        }
//        AccesoWebmx accesoWebmx = 
//                (AccesoWebmx) WebApplicationContextUtils.getWebApplicationContext(request.getServletContext()).getBean("accesoWebMx");
//        accesoWebmx.setId(new AccesoWebmxId(ud.getUser().getLogin(), fecha));
//        accesoWebmx.setIp(request.getRemoteAddr());
//        transactionService.crearAccesoWebMx(accesoWebmx);
    }
    
}
