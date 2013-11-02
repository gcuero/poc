/*
 * COPYRIGHT. Mariela Juárez Zuñiga 2012. Todos los derechos reservados.
 * 
 * Este software es sólo para ser utilizado para el propósito para el que ha sido
 * proporcionado. Ninguna parte de este se ha de reproducir, desensamblar, transmitir,
 * almacenar en algún sistema de recuperación, ni ser interpretado por ningún lenguaje
 * humano o de computadora, en cualquier forma o para cualquier otro propósito sin el
 * consentimiento previo por escrito de M. C. Mariela Juárez Zuñiga.
 * 
 */

package org.kudytech.web.security.domain;

public class GrantedAuthority implements org.springframework.security.core.GrantedAuthority {

    private String authority;

    public GrantedAuthority() {
    }

    public GrantedAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    /**
     * @param authority the authority to set
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
