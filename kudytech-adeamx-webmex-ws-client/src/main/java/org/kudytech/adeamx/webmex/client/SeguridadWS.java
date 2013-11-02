
package org.kudytech.adeamx.webmex.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SeguridadWS", targetNamespace = "http://ws.webservices.seguridad.adeamx.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SeguridadWS {


    /**
     * 
     * @param idAplicacion
     * @param login
     * @return
     *     returns org.kudytech.adeamx.webmex.client.MenuResponseMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMenuByUser", targetNamespace = "http://ws.webservices.seguridad.adeamx.com/", className = "org.kudytech.adeamx.webmex.client.GetMenuByUser")
    @ResponseWrapper(localName = "getMenuByUserResponse", targetNamespace = "http://ws.webservices.seguridad.adeamx.com/", className = "org.kudytech.adeamx.webmex.client.GetMenuByUserResponse")
    @Action(input = "http://ws.webservices.seguridad.adeamx.com/SeguridadWS/getMenuByUserRequest", output = "http://ws.webservices.seguridad.adeamx.com/SeguridadWS/getMenuByUserResponse")
    public MenuResponseMessage getMenuByUser(
        @WebParam(name = "login", targetNamespace = "")
        String login,
        @WebParam(name = "idAplicacion", targetNamespace = "")
        int idAplicacion);

    /**
     * 
     * @param idAplicacion
     * @param idParent
     * @param login
     * @return
     *     returns org.kudytech.adeamx.webmex.client.MenuResponseMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSubMenuByUser", targetNamespace = "http://ws.webservices.seguridad.adeamx.com/", className = "org.kudytech.adeamx.webmex.client.GetSubMenuByUser")
    @ResponseWrapper(localName = "getSubMenuByUserResponse", targetNamespace = "http://ws.webservices.seguridad.adeamx.com/", className = "org.kudytech.adeamx.webmex.client.GetSubMenuByUserResponse")
    @Action(input = "http://ws.webservices.seguridad.adeamx.com/SeguridadWS/getSubMenuByUserRequest", output = "http://ws.webservices.seguridad.adeamx.com/SeguridadWS/getSubMenuByUserResponse")
    public MenuResponseMessage getSubMenuByUser(
        @WebParam(name = "login", targetNamespace = "")
        String login,
        @WebParam(name = "idAplicacion", targetNamespace = "")
        int idAplicacion,
        @WebParam(name = "idParent", targetNamespace = "")
        double idParent);

    /**
     * 
     * @param login
     * @return
     *     returns org.kudytech.adeamx.webmex.client.UsuarioResponseMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsuarioWebByLogin", targetNamespace = "http://ws.webservices.seguridad.adeamx.com/", className = "org.kudytech.adeamx.webmex.client.GetUsuarioWebByLogin")
    @ResponseWrapper(localName = "getUsuarioWebByLoginResponse", targetNamespace = "http://ws.webservices.seguridad.adeamx.com/", className = "org.kudytech.adeamx.webmex.client.GetUsuarioWebByLoginResponse")
    @Action(input = "http://ws.webservices.seguridad.adeamx.com/SeguridadWS/getUsuarioWebByLoginRequest", output = "http://ws.webservices.seguridad.adeamx.com/SeguridadWS/getUsuarioWebByLoginResponse")
    public UsuarioResponseMessage getUsuarioWebByLogin(
        @WebParam(name = "login", targetNamespace = "")
        String login);

}