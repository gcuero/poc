package org.kudytech.compras.ws.confsistema.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.kudytech.confsistema.ws.domain.ConfSistema;
import org.kudytech.confsistema.ws.domain.ConfSistemaPK;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybrid;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybridList;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.kudytech.compras.ws.confsistema.client
 * package. <p>An ObjectFactory allows you to programatically construct new
 * instances of the Java representation for XML content. The Java representation
 * of XML content can consist of schema derived interfaces and classes
 * representing the binding of schema type definitions, element declarations and
 * model groups. Factory methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindByCatalog_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "findByCatalog");
    private final static QName _GetDateValueByatCalogAndVariableResponse_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "getDateValueByatCalogAndVariableResponse");
    private final static QName _TestConfSistema_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "testConfSistema");
    private final static QName _GetNumberValueByatCalogAndVariable_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "getNumberValueByatCalogAndVariable");
    private final static QName _GetNumberValueByatCalogAndVariableResponse_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "getNumberValueByatCalogAndVariableResponse");
    private final static QName _GetBlobValueByatCalogAndVariableResponse_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "getBlobValueByatCalogAndVariableResponse");
    private final static QName _TestConfSistemaResponse_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "testConfSistemaResponse");
    private final static QName _FindByCatalogResponse_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "findByCatalogResponse");
    private final static QName _FindByCatalogAndVariableResponse_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "findByCatalogAndVariableResponse");
    private final static QName _FindByCatalogAndVariable_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "findByCatalogAndVariable");
    private final static QName _GetBlobValueByatCalogAndVariable_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "getBlobValueByatCalogAndVariable");
    private final static QName _GetDateValueByatCalogAndVariable_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "getDateValueByatCalogAndVariable");
    private final static QName _GetStringValueByCatalogAndVariable_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "getStringValueByCatalogAndVariable");
    private final static QName _GetStringValueByCatalogAndVariableResponse_QNAME = new QName("http://ws.webservices.confsistema.adeamx.com/", "getStringValueByCatalogAndVariableResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * org.kudytech.compras.ws.confsistema.client
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBlobValueByatCalogAndVariableResponse }
     *
     */
    public GetBlobValueByatCalogAndVariableResponse createGetBlobValueByatCalogAndVariableResponse() {
        return new GetBlobValueByatCalogAndVariableResponse();
    }

    /**
     * Create an instance of {@link TestConfSistemaResponse }
     *
     */
    public TestConfSistemaResponse createTestConfSistemaResponse() {
        return new TestConfSistemaResponse();
    }

    /**
     * Create an instance of {@link GetNumberValueByatCalogAndVariableResponse }
     *
     */
    public GetNumberValueByatCalogAndVariableResponse createGetNumberValueByatCalogAndVariableResponse() {
        return new GetNumberValueByatCalogAndVariableResponse();
    }

    /**
     * Create an instance of {@link GetNumberValueByatCalogAndVariable }
     *
     */
    public GetNumberValueByatCalogAndVariable createGetNumberValueByatCalogAndVariable() {
        return new GetNumberValueByatCalogAndVariable();
    }

    /**
     * Create an instance of {@link GetDateValueByatCalogAndVariableResponse }
     *
     */
    public GetDateValueByatCalogAndVariableResponse createGetDateValueByatCalogAndVariableResponse() {
        return new GetDateValueByatCalogAndVariableResponse();
    }

    /**
     * Create an instance of {@link TestConfSistema }
     *
     */
    public TestConfSistema createTestConfSistema() {
        return new TestConfSistema();
    }

    /**
     * Create an instance of {@link FindByCatalog }
     *
     */
    public FindByCatalog createFindByCatalog() {
        return new FindByCatalog();
    }

    /**
     * Create an instance of {@link GetStringValueByCatalogAndVariableResponse }
     *
     */
    public GetStringValueByCatalogAndVariableResponse createGetStringValueByCatalogAndVariableResponse() {
        return new GetStringValueByCatalogAndVariableResponse();
    }

    /**
     * Create an instance of {@link GetStringValueByCatalogAndVariable }
     *
     */
    public GetStringValueByCatalogAndVariable createGetStringValueByCatalogAndVariable() {
        return new GetStringValueByCatalogAndVariable();
    }

    /**
     * Create an instance of {@link GetDateValueByatCalogAndVariable }
     *
     */
    public GetDateValueByatCalogAndVariable createGetDateValueByatCalogAndVariable() {
        return new GetDateValueByatCalogAndVariable();
    }

    /**
     * Create an instance of {@link GetBlobValueByatCalogAndVariable }
     *
     */
    public GetBlobValueByatCalogAndVariable createGetBlobValueByatCalogAndVariable() {
        return new GetBlobValueByatCalogAndVariable();
    }

    /**
     * Create an instance of {@link FindByCatalogAndVariable }
     *
     */
    public FindByCatalogAndVariable createFindByCatalogAndVariable() {
        return new FindByCatalogAndVariable();
    }

    /**
     * Create an instance of {@link FindByCatalogAndVariableResponse }
     *
     */
    public FindByCatalogAndVariableResponse createFindByCatalogAndVariableResponse() {
        return new FindByCatalogAndVariableResponse();
    }

    /**
     * Create an instance of {@link FindByCatalogResponse }
     *
     */
    public FindByCatalogResponse createFindByCatalogResponse() {
        return new FindByCatalogResponse();
    }

    /**
     * Create an instance of {@link AbstractSimpleResponseMessageHybridList }
     *
     */
    public AbstractSimpleResponseMessageHybridList createAbstractSimpleResponseMessageHybridList() {
        return new AbstractSimpleResponseMessageHybridList();
    }

    /**
     * Create an instance of {@link AbstractSimpleResponseMessageHybrid }
     *
     */
    public AbstractSimpleResponseMessageHybrid createAbstractSimpleResponseMessageHybrid() {
        return new AbstractSimpleResponseMessageHybrid();
    }

    /**
     * Create an instance of {@link ConfSistemaPK }
     *
     */
    public ConfSistemaPK createConfSistemaPK() {
        return new ConfSistemaPK();
    }

    /**
     * Create an instance of {@link ConfSistema }
     *
     */
    public ConfSistema createConfSistema() {
        return new ConfSistema();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link FindByCatalog }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "findByCatalog")
    public JAXBElement<FindByCatalog> createFindByCatalog(FindByCatalog value) {
        return new JAXBElement<FindByCatalog>(_FindByCatalog_QNAME, FindByCatalog.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetDateValueByatCalogAndVariableResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "getDateValueByatCalogAndVariableResponse")
    public JAXBElement<GetDateValueByatCalogAndVariableResponse> createGetDateValueByatCalogAndVariableResponse(GetDateValueByatCalogAndVariableResponse value) {
        return new JAXBElement<GetDateValueByatCalogAndVariableResponse>(_GetDateValueByatCalogAndVariableResponse_QNAME, GetDateValueByatCalogAndVariableResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link TestConfSistema }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "testConfSistema")
    public JAXBElement<TestConfSistema> createTestConfSistema(TestConfSistema value) {
        return new JAXBElement<TestConfSistema>(_TestConfSistema_QNAME, TestConfSistema.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetNumberValueByatCalogAndVariable }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "getNumberValueByatCalogAndVariable")
    public JAXBElement<GetNumberValueByatCalogAndVariable> createGetNumberValueByatCalogAndVariable(GetNumberValueByatCalogAndVariable value) {
        return new JAXBElement<GetNumberValueByatCalogAndVariable>(_GetNumberValueByatCalogAndVariable_QNAME, GetNumberValueByatCalogAndVariable.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetNumberValueByatCalogAndVariableResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "getNumberValueByatCalogAndVariableResponse")
    public JAXBElement<GetNumberValueByatCalogAndVariableResponse> createGetNumberValueByatCalogAndVariableResponse(GetNumberValueByatCalogAndVariableResponse value) {
        return new JAXBElement<GetNumberValueByatCalogAndVariableResponse>(_GetNumberValueByatCalogAndVariableResponse_QNAME, GetNumberValueByatCalogAndVariableResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetBlobValueByatCalogAndVariableResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "getBlobValueByatCalogAndVariableResponse")
    public JAXBElement<GetBlobValueByatCalogAndVariableResponse> createGetBlobValueByatCalogAndVariableResponse(GetBlobValueByatCalogAndVariableResponse value) {
        return new JAXBElement<GetBlobValueByatCalogAndVariableResponse>(_GetBlobValueByatCalogAndVariableResponse_QNAME, GetBlobValueByatCalogAndVariableResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link TestConfSistemaResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "testConfSistemaResponse")
    public JAXBElement<TestConfSistemaResponse> createTestConfSistemaResponse(TestConfSistemaResponse value) {
        return new JAXBElement<TestConfSistemaResponse>(_TestConfSistemaResponse_QNAME, TestConfSistemaResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link FindByCatalogResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "findByCatalogResponse")
    public JAXBElement<FindByCatalogResponse> createFindByCatalogResponse(FindByCatalogResponse value) {
        return new JAXBElement<FindByCatalogResponse>(_FindByCatalogResponse_QNAME, FindByCatalogResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link FindByCatalogAndVariableResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "findByCatalogAndVariableResponse")
    public JAXBElement<FindByCatalogAndVariableResponse> createFindByCatalogAndVariableResponse(FindByCatalogAndVariableResponse value) {
        return new JAXBElement<FindByCatalogAndVariableResponse>(_FindByCatalogAndVariableResponse_QNAME, FindByCatalogAndVariableResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link FindByCatalogAndVariable }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "findByCatalogAndVariable")
    public JAXBElement<FindByCatalogAndVariable> createFindByCatalogAndVariable(FindByCatalogAndVariable value) {
        return new JAXBElement<FindByCatalogAndVariable>(_FindByCatalogAndVariable_QNAME, FindByCatalogAndVariable.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetBlobValueByatCalogAndVariable }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "getBlobValueByatCalogAndVariable")
    public JAXBElement<GetBlobValueByatCalogAndVariable> createGetBlobValueByatCalogAndVariable(GetBlobValueByatCalogAndVariable value) {
        return new JAXBElement<GetBlobValueByatCalogAndVariable>(_GetBlobValueByatCalogAndVariable_QNAME, GetBlobValueByatCalogAndVariable.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetDateValueByatCalogAndVariable }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "getDateValueByatCalogAndVariable")
    public JAXBElement<GetDateValueByatCalogAndVariable> createGetDateValueByatCalogAndVariable(GetDateValueByatCalogAndVariable value) {
        return new JAXBElement<GetDateValueByatCalogAndVariable>(_GetDateValueByatCalogAndVariable_QNAME, GetDateValueByatCalogAndVariable.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetStringValueByCatalogAndVariable }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "getStringValueByCatalogAndVariable")
    public JAXBElement<GetStringValueByCatalogAndVariable> createGetStringValueByCatalogAndVariable(GetStringValueByCatalogAndVariable value) {
        return new JAXBElement<GetStringValueByCatalogAndVariable>(_GetStringValueByCatalogAndVariable_QNAME, GetStringValueByCatalogAndVariable.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetStringValueByCatalogAndVariableResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.confsistema.adeamx.com/", name = "getStringValueByCatalogAndVariableResponse")
    public JAXBElement<GetStringValueByCatalogAndVariableResponse> createGetStringValueByCatalogAndVariableResponse(GetStringValueByCatalogAndVariableResponse value) {
        return new JAXBElement<GetStringValueByCatalogAndVariableResponse>(_GetStringValueByCatalogAndVariableResponse_QNAME, GetStringValueByCatalogAndVariableResponse.class, null, value);
    }
}
