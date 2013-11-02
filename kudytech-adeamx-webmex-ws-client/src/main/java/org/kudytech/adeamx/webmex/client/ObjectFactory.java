
package org.kudytech.adeamx.webmex.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.kudytech.adeamx.webmex.domain.AbstractSimpleResponseMessage;
import org.kudytech.adeamx.webmex.domain.Authority;
import org.kudytech.adeamx.webmex.domain.MenuWeb;
import org.kudytech.adeamx.webmex.domain.UsuarioWeb;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kudytech.adeamx.webmex.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSubMenuByUserResponse_QNAME = new QName("http://ws.webservices.seguridad.adeamx.com/", "getSubMenuByUserResponse");
    private final static QName _GetUsuarioWebByLoginResponse_QNAME = new QName("http://ws.webservices.seguridad.adeamx.com/", "getUsuarioWebByLoginResponse");
    private final static QName _GetUsuarioWebByLogin_QNAME = new QName("http://ws.webservices.seguridad.adeamx.com/", "getUsuarioWebByLogin");
    private final static QName _GetSubMenuByUser_QNAME = new QName("http://ws.webservices.seguridad.adeamx.com/", "getSubMenuByUser");
    private final static QName _GetMenuByUserResponse_QNAME = new QName("http://ws.webservices.seguridad.adeamx.com/", "getMenuByUserResponse");
    private final static QName _GetMenuByUser_QNAME = new QName("http://ws.webservices.seguridad.adeamx.com/", "getMenuByUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kudytech.adeamx.webmex.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMenuByUser }
     * 
     */
    public GetMenuByUser createGetMenuByUser() {
        return new GetMenuByUser();
    }

    /**
     * Create an instance of {@link GetSubMenuByUser }
     * 
     */
    public GetSubMenuByUser createGetSubMenuByUser() {
        return new GetSubMenuByUser();
    }

    /**
     * Create an instance of {@link GetMenuByUserResponse }
     * 
     */
    public GetMenuByUserResponse createGetMenuByUserResponse() {
        return new GetMenuByUserResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioWebByLoginResponse }
     * 
     */
    public GetUsuarioWebByLoginResponse createGetUsuarioWebByLoginResponse() {
        return new GetUsuarioWebByLoginResponse();
    }

    /**
     * Create an instance of {@link GetSubMenuByUserResponse }
     * 
     */
    public GetSubMenuByUserResponse createGetSubMenuByUserResponse() {
        return new GetSubMenuByUserResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioWebByLogin }
     * 
     */
    public GetUsuarioWebByLogin createGetUsuarioWebByLogin() {
        return new GetUsuarioWebByLogin();
    }

    /**
     * Create an instance of {@link Authority }
     * 
     */
    public Authority createAuthority() {
        return new Authority();
    }

    /**
     * Create an instance of {@link UsuarioWeb }
     * 
     */
    public UsuarioWeb createUsuarioWeb() {
        return new UsuarioWeb();
    }

    /**
     * Create an instance of {@link AbstractSimpleResponseMessage }
     * 
     */
    public AbstractSimpleResponseMessage createAbstractSimpleResponseMessage() {
        return new AbstractSimpleResponseMessage();
    }

    /**
     * Create an instance of {@link UsuarioResponseMessage }
     * 
     */
    public UsuarioResponseMessage createUsuarioResponseMessage() {
        return new UsuarioResponseMessage();
    }

    /**
     * Create an instance of {@link MenuWeb }
     * 
     */
    public MenuWeb createMenuWeb() {
        return new MenuWeb();
    }

    /**
     * Create an instance of {@link MenuResponseMessage }
     * 
     */
    public MenuResponseMessage createMenuResponseMessage() {
        return new MenuResponseMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubMenuByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservices.seguridad.adeamx.com/", name = "getSubMenuByUserResponse")
    public JAXBElement<GetSubMenuByUserResponse> createGetSubMenuByUserResponse(GetSubMenuByUserResponse value) {
        return new JAXBElement<GetSubMenuByUserResponse>(_GetSubMenuByUserResponse_QNAME, GetSubMenuByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioWebByLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservices.seguridad.adeamx.com/", name = "getUsuarioWebByLoginResponse")
    public JAXBElement<GetUsuarioWebByLoginResponse> createGetUsuarioWebByLoginResponse(GetUsuarioWebByLoginResponse value) {
        return new JAXBElement<GetUsuarioWebByLoginResponse>(_GetUsuarioWebByLoginResponse_QNAME, GetUsuarioWebByLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioWebByLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservices.seguridad.adeamx.com/", name = "getUsuarioWebByLogin")
    public JAXBElement<GetUsuarioWebByLogin> createGetUsuarioWebByLogin(GetUsuarioWebByLogin value) {
        return new JAXBElement<GetUsuarioWebByLogin>(_GetUsuarioWebByLogin_QNAME, GetUsuarioWebByLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubMenuByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservices.seguridad.adeamx.com/", name = "getSubMenuByUser")
    public JAXBElement<GetSubMenuByUser> createGetSubMenuByUser(GetSubMenuByUser value) {
        return new JAXBElement<GetSubMenuByUser>(_GetSubMenuByUser_QNAME, GetSubMenuByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservices.seguridad.adeamx.com/", name = "getMenuByUserResponse")
    public JAXBElement<GetMenuByUserResponse> createGetMenuByUserResponse(GetMenuByUserResponse value) {
        return new JAXBElement<GetMenuByUserResponse>(_GetMenuByUserResponse_QNAME, GetMenuByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservices.seguridad.adeamx.com/", name = "getMenuByUser")
    public JAXBElement<GetMenuByUser> createGetMenuByUser(GetMenuByUser value) {
        return new JAXBElement<GetMenuByUser>(_GetMenuByUser_QNAME, GetMenuByUser.class, null, value);
    }

}
