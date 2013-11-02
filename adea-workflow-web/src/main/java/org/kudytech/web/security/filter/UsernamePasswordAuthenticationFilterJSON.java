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
package org.kudytech.web.security.filter;

//import com.codicentro.core.TypeCast;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.kudytech.web.security.domain.UserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class UsernamePasswordAuthenticationFilterJSON extends UsernamePasswordAuthenticationFilter {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(UsernamePasswordAuthenticationFilterJSON.class);
    private static final String UNSUCCESSFUL_AUTHENTICATION_MESSAGE = 
            "{message:\"El usuario o el password son incorrectos.\",success:false}";
    private static final String SUCCESSFUL_AUTHENTICATION_MESSAGE = 
            "{message:\"%s\",success:true, secureAccess:%s}";
    private static final Map<String, String> HEADER_PROPERTIES = new HashMap<String, String>();

    static {
        UsernamePasswordAuthenticationFilterJSON.HEADER_PROPERTIES.put(
                "Content-Type", "text/html");
        UsernamePasswordAuthenticationFilterJSON.HEADER_PROPERTIES.put(
                "Expires", "Mon, 01 Jan 1900 01:00:00 GMT");
        UsernamePasswordAuthenticationFilterJSON.HEADER_PROPERTIES.put(
                "Cache-Control", "must-revalidate");
        UsernamePasswordAuthenticationFilterJSON.HEADER_PROPERTIES.put(
                "Cache-Control", "no-cache");
        UsernamePasswordAuthenticationFilterJSON.HEADER_PROPERTIES.put(
                "Access-Control-Allow-Origin", "*");
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
            HttpServletResponse response, Authentication authResult)
            throws IOException, ServletException {
        UserDetails ud = (UserDetails) authResult.getPrincipal();
        Set<Entry<String, String>> entrySet =
                UsernamePasswordAuthenticationFilterJSON.HEADER_PROPERTIES.entrySet();
        for (Entry<String, String> entry : entrySet) {
            response.setHeader(entry.getKey(), entry.getValue());
        }
        PrintWriter writer = response.getWriter();
        writer.print(String.format(
                UsernamePasswordAuthenticationFilterJSON.SUCCESSFUL_AUTHENTICATION_MESSAGE, 
                authResult.getPrincipal(),
                ud.isSecureAccess()));
        writer.close();
        super.successfulAuthentication(request, response, authResult);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request,
            HttpServletResponse response, AuthenticationException failed)
            throws IOException, ServletException {
        Set<Entry<String, String>> entrySet =
                UsernamePasswordAuthenticationFilterJSON.HEADER_PROPERTIES.entrySet();
        for (Entry<String, String> entry : entrySet) {
            response.setHeader(entry.getKey(), entry.getValue());
        }
        PrintWriter writer = response.getWriter();
        writer.print(UsernamePasswordAuthenticationFilterJSON.UNSUCCESSFUL_AUTHENTICATION_MESSAGE);
        writer.close();
        super.unsuccessfulAuthentication(request, response, failed);
    }
}
