package org.kudytech.compras.ws.confsistema.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import org.kudytech.ws.client.utils.AbstractWebServiceProvider;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.6-1b01 Generated
 * source version: 2.2
 *
 */
@WebServiceClient(
        name = "ConfSistemaWSService",
targetNamespace = "http://ws.webservices.confsistema.adeamx.com/",
wsdlLocation = "http://localhost:6680/adea-compras-ws/ConfSistema?wsdl")
public class ConfSistemaWSService
        extends AbstractWebServiceProvider {

    private static QName CONFSISTEMAWSSERVICE_QNAME =
            new QName("http://ws.webservices.confsistema.adeamx.com/",
            "ConfSistemaWS");
    private static final String LOCAL_PART = "ConfSistemaWS";
    private static String NAME_SPACE_URI = "http://ws.webservices.seguridad.adeamx.com/";
    private static final String WS_PORT="ConfSistemaWSPort";

    public ConfSistemaWSService(URL wsdlLocation) {
        super(wsdlLocation, CONFSISTEMAWSSERVICE_QNAME);
    }

    public ConfSistemaWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConfSistemaWSService(String wsdlDocumentLocationPath, QName serviceName) {
        super(wsdlDocumentLocationPath, serviceName);
    }

    public ConfSistemaWSService(String wsdlDocumentLocationPath) {
        super(wsdlDocumentLocationPath, CONFSISTEMAWSSERVICE_QNAME);
    }

    public ConfSistemaWSService(String wsdlDocumentLocationPath, String namespaceUri) {
        super(wsdlDocumentLocationPath, getQName(namespaceUri, LOCAL_PART));
    }
    
    private static QName getQName(String namespaceUri, String localPart) {
        NAME_SPACE_URI=namespaceUri;
        CONFSISTEMAWSSERVICE_QNAME = new QName(namespaceUri, localPart);
        return CONFSISTEMAWSSERVICE_QNAME;
    }

    /**
     *
     * @return returns ConfSistemaWS
     */
    @WebEndpoint(name = "ConfSistemaWSPort")
    public ConfSistemaWS getConfSistemaWSPort() {
        return super.getPort(new QName(NAME_SPACE_URI, WS_PORT), ConfSistemaWS.class);
    }

    /**
     *
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to
     * configure on the proxy. Supported features not in * *      * the <code>features</code> parameter will have their default
     * values.
     * @return returns ConfSistemaWS
     */
    @WebEndpoint(name = "ConfSistemaWSPort")
    public ConfSistemaWS getConfSistemaWSPort(WebServiceFeature... features) {
        return super.getPort(new QName(NAME_SPACE_URI, WS_PORT), ConfSistemaWS.class, features);
    }
}
