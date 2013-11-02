/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.web.security.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.kudytech.adeamx.webmex.domain.Authority;
import org.kudytech.adeamx.webmex.domain.UsuarioWeb;

/**
 *
 * @author gcuero
 */
public class UserDetails implements org.springframework.security.core.userdetails.UserDetails {

    private static final String ACTIVE_STATUS = "A";
    private List<org.springframework.security.core.GrantedAuthority> grantedAuthorities;
    private UsuarioWeb usuarioWeb;
    private Long idApplication;
    private String nombre;

    public UserDetails(UsuarioWeb usuarioWeb, Long idApplication, List<Authority> authoritys) {
        this.usuarioWeb = usuarioWeb;
        this.idApplication = idApplication;
        this.nombre = usuarioWeb.getNombre();
        this.grantedAuthorities =
                new ArrayList<org.springframework.security.core.GrantedAuthority>();
        for (Authority authority : authoritys) {
            this.grantedAuthorities.add(new GrantedAuthority(authority.getIdAuthority()));
        }
    }

    public List<org.springframework.security.core.GrantedAuthority> getGrantedAuthorities() {
        return grantedAuthorities;
    }

    public void setGrantedAuthorities(List<org.springframework.security.core.GrantedAuthority> grantedAuthorities) {
        this.grantedAuthorities = grantedAuthorities;
    }

    public UsuarioWeb getUsuarioWeb() {
        return usuarioWeb;
    }

    public void setUsuarioWeb(UsuarioWeb usuarioWeb) {
        this.usuarioWeb = usuarioWeb;
    }

    public Long getIdApplication() {
        return idApplication;
    }

    public void setIdApplication(Long idApplication) {
        this.idApplication = idApplication;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addAuthority(String authority) {
        grantedAuthorities.add(new GrantedAuthority(authority));
    }

    @Override
    public List<org.springframework.security.core.GrantedAuthority> getAuthorities() {
        return this.grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return this.usuarioWeb.getPassword();
    }

    @Override
    public String getUsername() {
        return this.usuarioWeb.getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        return ((usuarioWeb.getFechabaja() == null)
                || ((new Date()).compareTo(usuarioWeb.getFechabaja()) == 1));
    }

    @Override
    public boolean isAccountNonLocked() {
        return (usuarioWeb.getFecharevocado() == null);
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return Boolean.TRUE;
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.ACTIVE_STATUS.equals(usuarioWeb.getStatus());
    }

    public boolean isSecureAccess() {
        return Boolean.TRUE;
    }
    
    public String getEmail(){
        return this.usuarioWeb.getEmail();
    }
}
