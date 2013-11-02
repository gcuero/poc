package org.kudytech.workflow.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.kudytech.workflow.ws.domain.ConfColor;
import org.kudytech.workflow.ws.domain.ConfModulo;
import org.kudytech.workflow.ws.domain.ConfObjeto;
import org.kudytech.workflow.ws.domain.Workflow;
import org.kudytech.workflow.ws.domain.WorkflowCtl;
import org.kudytech.workflow.ws.domain.WorkflowState;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybrid;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybridList;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.kudytech.workflow.ws.client package.
 * <p>An ObjectFactory allows you to programatically construct new instances of
 * the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the
 * binding of schema type definitions, element declarations and model groups.
 * Factory methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CanChangeWorkFlowSateResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "canChangeWorkFlowSateResponse");
    private final static QName _DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse");
    private final static QName _GetWorkflowState_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getWorkflowState");
    private final static QName _CanTranscendObjectByLogin_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "canTranscendObjectByLogin");
    private final static QName _CanTranscendObjectByIdReferenciaIdObjetoEventAuthority_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "canTranscendObjectByIdReferenciaIdObjetoEventAuthority");
    private final static QName _TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "transcendObjectByIdReferenciaIdObjetoEventLoginAuthority");
    private final static QName _GetListStateByNameResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getListStateByNameResponse");
    private final static QName _GetIdConfObjetoByClassNameResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getIdConfObjetoByClassNameResponse");
    private final static QName _DoNextByIdReferenciaAndIdConfObjetoLogin_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "doNextByIdReferenciaAndIdConfObjetoLogin");
    private final static QName _GetWorkflowNextState_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getWorkflowNextState");
    private final static QName _CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "canTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse");
    private final static QName _DoNextByIdReferenciaAndIdConfObjetoLoginResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "doNextByIdReferenciaAndIdConfObjetoLoginResponse");
    private final static QName _CanTranscendObjectByLoginResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "canTranscendObjectByLoginResponse");
    private final static QName _TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "transcendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse");
    private final static QName _TranscendObjectByLogin_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "transcendObjectByLogin");
    private final static QName _GetWorkflowNextStateResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getWorkflowNextStateResponse");
    private final static QName _CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "canDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse");
    private final static QName _GetListStateByName_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getListStateByName");
    private final static QName _GetIdConfObjetoByClassName_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getIdConfObjetoByClassName");
    private final static QName _GetWorkflowStateResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getWorkflowStateResponse");
    private final static QName _GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse");
    private final static QName _GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority");
    private final static QName _DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority");
    private final static QName _CanChangeWorkFlowSate_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "canChangeWorkFlowSate");
    private final static QName _TranscendObjectByLoginResponse_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "transcendObjectByLoginResponse");
    private final static QName _CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin_QNAME = new QName("http://ws.webservices.workflow.adeamx.com/", "canDoNextObjectByIdReferenciaAndIdConfObjetoLogin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: org.kudytech.workflow.ws.client
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWorkflowState }
     *
     */
    public GetWorkflowState createGetWorkflowState() {
        return new GetWorkflowState();
    }

    /**
     * Create an instance of {@link CanTranscendObjectByLogin }
     *
     */
    public CanTranscendObjectByLogin createCanTranscendObjectByLogin() {
        return new CanTranscendObjectByLogin();
    }

    /**
     * Create an instance of {@link DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse
     * }
     *
     */
    public DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse createDoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse() {
        return new DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse();
    }

    /**
     * Create an instance of {@link CanChangeWorkFlowSateResponse }
     *
     */
    public CanChangeWorkFlowSateResponse createCanChangeWorkFlowSateResponse() {
        return new CanChangeWorkFlowSateResponse();
    }

    /**
     * Create an instance of {@link DoNextByIdReferenciaAndIdConfObjetoLoginResponse
     * }
     *
     */
    public DoNextByIdReferenciaAndIdConfObjetoLoginResponse createDoNextByIdReferenciaAndIdConfObjetoLoginResponse() {
        return new DoNextByIdReferenciaAndIdConfObjetoLoginResponse();
    }

    /**
     * Create an instance of {@link CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse
     * }
     *
     */
    public CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse createCanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse() {
        return new CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse();
    }

    /**
     * Create an instance of {@link GetWorkflowNextState }
     *
     */
    public GetWorkflowNextState createGetWorkflowNextState() {
        return new GetWorkflowNextState();
    }

    /**
     * Create an instance of {@link GetIdConfObjetoByClassNameResponse }
     *
     */
    public GetIdConfObjetoByClassNameResponse createGetIdConfObjetoByClassNameResponse() {
        return new GetIdConfObjetoByClassNameResponse();
    }

    /**
     * Create an instance of {@link GetListStateByNameResponse }
     *
     */
    public GetListStateByNameResponse createGetListStateByNameResponse() {
        return new GetListStateByNameResponse();
    }

    /**
     * Create an instance of {@link DoNextByIdReferenciaAndIdConfObjetoLogin }
     *
     */
    public DoNextByIdReferenciaAndIdConfObjetoLogin createDoNextByIdReferenciaAndIdConfObjetoLogin() {
        return new DoNextByIdReferenciaAndIdConfObjetoLogin();
    }

    /**
     * Create an instance of {@link CanTranscendObjectByIdReferenciaIdObjetoEventAuthority
     * }
     *
     */
    public CanTranscendObjectByIdReferenciaIdObjetoEventAuthority createCanTranscendObjectByIdReferenciaIdObjetoEventAuthority() {
        return new CanTranscendObjectByIdReferenciaIdObjetoEventAuthority();
    }

    /**
     * Create an instance of {@link TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority
     * }
     *
     */
    public TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority createTranscendObjectByIdReferenciaIdObjetoEventLoginAuthority() {
        return new TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority();
    }

    /**
     * Create an instance of {@link GetIdConfObjetoByClassName }
     *
     */
    public GetIdConfObjetoByClassName createGetIdConfObjetoByClassName() {
        return new GetIdConfObjetoByClassName();
    }

    /**
     * Create an instance of {@link CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse
     * }
     *
     */
    public CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse createCanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse() {
        return new CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse();
    }

    /**
     * Create an instance of {@link GetListStateByName }
     *
     */
    public GetListStateByName createGetListStateByName() {
        return new GetListStateByName();
    }

    /**
     * Create an instance of {@link GetWorkflowNextStateResponse }
     *
     */
    public GetWorkflowNextStateResponse createGetWorkflowNextStateResponse() {
        return new GetWorkflowNextStateResponse();
    }

    /**
     * Create an instance of {@link CanTranscendObjectByLoginResponse }
     *
     */
    public CanTranscendObjectByLoginResponse createCanTranscendObjectByLoginResponse() {
        return new CanTranscendObjectByLoginResponse();
    }

    /**
     * Create an instance of {@link TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse
     * }
     *
     */
    public TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse createTranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse() {
        return new TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse();
    }

    /**
     * Create an instance of {@link TranscendObjectByLogin }
     *
     */
    public TranscendObjectByLogin createTranscendObjectByLogin() {
        return new TranscendObjectByLogin();
    }

    /**
     * Create an instance of {@link CanChangeWorkFlowSate }
     *
     */
    public CanChangeWorkFlowSate createCanChangeWorkFlowSate() {
        return new CanChangeWorkFlowSate();
    }

    /**
     * Create an instance of {@link DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority
     * }
     *
     */
    public DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority createDoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority() {
        return new DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority();
    }

    /**
     * Create an instance of {@link CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin
     * }
     *
     */
    public CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin createCanDoNextObjectByIdReferenciaAndIdConfObjetoLogin() {
        return new CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin();
    }

    /**
     * Create an instance of {@link TranscendObjectByLoginResponse }
     *
     */
    public TranscendObjectByLoginResponse createTranscendObjectByLoginResponse() {
        return new TranscendObjectByLoginResponse();
    }

    /**
     * Create an instance of {@link GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse
     * }
     *
     */
    public GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse createGetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse() {
        return new GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse();
    }

    /**
     * Create an instance of {@link GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority
     * }
     *
     */
    public GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority createGetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority() {
        return new GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority();
    }

    /**
     * Create an instance of {@link GetWorkflowStateResponse }
     *
     */
    public GetWorkflowStateResponse createGetWorkflowStateResponse() {
        return new GetWorkflowStateResponse();
    }

    /**
     * Create an instance of {@link AbstractSimpleResponseMessageHybrid }
     *
     */
    public AbstractSimpleResponseMessageHybrid createAbstractSimpleResponseMessageHybrid() {
        return new AbstractSimpleResponseMessageHybrid();
    }

    /**
     * Create an instance of {@link ConfObjeto }
     *
     */
    public ConfObjeto createConfObjeto() {
        return new ConfObjeto();
    }

    /**
     * Create an instance of {@link WorkflowCtl }
     *
     */
    public WorkflowCtl createWorkflowCtl() {
        return new WorkflowCtl();
    }

    /**
     * Create an instance of {@link ConfModulo }
     *
     */
    public ConfModulo createConfModulo() {
        return new ConfModulo();
    }

    /**
     * Create an instance of {@link ConfColor }
     *
     */
    public ConfColor createConfColor() {
        return new ConfColor();
    }

    /**
     * Create an instance of {@link WorkflowState }
     *
     */
    public WorkflowState createWorkflowState() {
        return new WorkflowState();
    }

    /**
     * Create an instance of {@link AbstractSimpleResponseMessageHybridList }
     *
     */
    public AbstractSimpleResponseMessageHybridList createAbstractSimpleResponseMessageHybridList() {
        return new AbstractSimpleResponseMessageHybridList();
    }

    /**
     * Create an instance of {@link Workflow }
     *
     */
    public Workflow createWorkflow() {
        return new Workflow();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link CanChangeWorkFlowSateResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "canChangeWorkFlowSateResponse")
    public JAXBElement<CanChangeWorkFlowSateResponse> createCanChangeWorkFlowSateResponse(CanChangeWorkFlowSateResponse value) {
        return new JAXBElement<CanChangeWorkFlowSateResponse>(_CanChangeWorkFlowSateResponse_QNAME, CanChangeWorkFlowSateResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse")
    public JAXBElement<DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse> createDoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse(DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse value) {
        return new JAXBElement<DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse>(_DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse_QNAME, DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetWorkflowState }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getWorkflowState")
    public JAXBElement<GetWorkflowState> createGetWorkflowState(GetWorkflowState value) {
        return new JAXBElement<GetWorkflowState>(_GetWorkflowState_QNAME, GetWorkflowState.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link CanTranscendObjectByLogin }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "canTranscendObjectByLogin")
    public JAXBElement<CanTranscendObjectByLogin> createCanTranscendObjectByLogin(CanTranscendObjectByLogin value) {
        return new JAXBElement<CanTranscendObjectByLogin>(_CanTranscendObjectByLogin_QNAME, CanTranscendObjectByLogin.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link CanTranscendObjectByIdReferenciaIdObjetoEventAuthority }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "canTranscendObjectByIdReferenciaIdObjetoEventAuthority")
    public JAXBElement<CanTranscendObjectByIdReferenciaIdObjetoEventAuthority> createCanTranscendObjectByIdReferenciaIdObjetoEventAuthority(CanTranscendObjectByIdReferenciaIdObjetoEventAuthority value) {
        return new JAXBElement<CanTranscendObjectByIdReferenciaIdObjetoEventAuthority>(_CanTranscendObjectByIdReferenciaIdObjetoEventAuthority_QNAME, CanTranscendObjectByIdReferenciaIdObjetoEventAuthority.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "transcendObjectByIdReferenciaIdObjetoEventLoginAuthority")
    public JAXBElement<TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority> createTranscendObjectByIdReferenciaIdObjetoEventLoginAuthority(TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority value) {
        return new JAXBElement<TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority>(_TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority_QNAME, TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetListStateByNameResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getListStateByNameResponse")
    public JAXBElement<GetListStateByNameResponse> createGetListStateByNameResponse(GetListStateByNameResponse value) {
        return new JAXBElement<GetListStateByNameResponse>(_GetListStateByNameResponse_QNAME, GetListStateByNameResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetIdConfObjetoByClassNameResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getIdConfObjetoByClassNameResponse")
    public JAXBElement<GetIdConfObjetoByClassNameResponse> createGetIdConfObjetoByClassNameResponse(GetIdConfObjetoByClassNameResponse value) {
        return new JAXBElement<GetIdConfObjetoByClassNameResponse>(_GetIdConfObjetoByClassNameResponse_QNAME, GetIdConfObjetoByClassNameResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link DoNextByIdReferenciaAndIdConfObjetoLogin }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "doNextByIdReferenciaAndIdConfObjetoLogin")
    public JAXBElement<DoNextByIdReferenciaAndIdConfObjetoLogin> createDoNextByIdReferenciaAndIdConfObjetoLogin(DoNextByIdReferenciaAndIdConfObjetoLogin value) {
        return new JAXBElement<DoNextByIdReferenciaAndIdConfObjetoLogin>(_DoNextByIdReferenciaAndIdConfObjetoLogin_QNAME, DoNextByIdReferenciaAndIdConfObjetoLogin.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetWorkflowNextState }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getWorkflowNextState")
    public JAXBElement<GetWorkflowNextState> createGetWorkflowNextState(GetWorkflowNextState value) {
        return new JAXBElement<GetWorkflowNextState>(_GetWorkflowNextState_QNAME, GetWorkflowNextState.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "canTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse")
    public JAXBElement<CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse> createCanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse(CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse value) {
        return new JAXBElement<CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse>(_CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse_QNAME, CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link DoNextByIdReferenciaAndIdConfObjetoLoginResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "doNextByIdReferenciaAndIdConfObjetoLoginResponse")
    public JAXBElement<DoNextByIdReferenciaAndIdConfObjetoLoginResponse> createDoNextByIdReferenciaAndIdConfObjetoLoginResponse(DoNextByIdReferenciaAndIdConfObjetoLoginResponse value) {
        return new JAXBElement<DoNextByIdReferenciaAndIdConfObjetoLoginResponse>(_DoNextByIdReferenciaAndIdConfObjetoLoginResponse_QNAME, DoNextByIdReferenciaAndIdConfObjetoLoginResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link CanTranscendObjectByLoginResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "canTranscendObjectByLoginResponse")
    public JAXBElement<CanTranscendObjectByLoginResponse> createCanTranscendObjectByLoginResponse(CanTranscendObjectByLoginResponse value) {
        return new JAXBElement<CanTranscendObjectByLoginResponse>(_CanTranscendObjectByLoginResponse_QNAME, CanTranscendObjectByLoginResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "transcendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse")
    public JAXBElement<TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse> createTranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse(TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse value) {
        return new JAXBElement<TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse>(_TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse_QNAME, TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link TranscendObjectByLogin }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "transcendObjectByLogin")
    public JAXBElement<TranscendObjectByLogin> createTranscendObjectByLogin(TranscendObjectByLogin value) {
        return new JAXBElement<TranscendObjectByLogin>(_TranscendObjectByLogin_QNAME, TranscendObjectByLogin.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetWorkflowNextStateResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getWorkflowNextStateResponse")
    public JAXBElement<GetWorkflowNextStateResponse> createGetWorkflowNextStateResponse(GetWorkflowNextStateResponse value) {
        return new JAXBElement<GetWorkflowNextStateResponse>(_GetWorkflowNextStateResponse_QNAME, GetWorkflowNextStateResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "canDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse")
    public JAXBElement<CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse> createCanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse(CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse value) {
        return new JAXBElement<CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse>(_CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse_QNAME, CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetListStateByName }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getListStateByName")
    public JAXBElement<GetListStateByName> createGetListStateByName(GetListStateByName value) {
        return new JAXBElement<GetListStateByName>(_GetListStateByName_QNAME, GetListStateByName.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetIdConfObjetoByClassName }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getIdConfObjetoByClassName")
    public JAXBElement<GetIdConfObjetoByClassName> createGetIdConfObjetoByClassName(GetIdConfObjetoByClassName value) {
        return new JAXBElement<GetIdConfObjetoByClassName>(_GetIdConfObjetoByClassName_QNAME, GetIdConfObjetoByClassName.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetWorkflowStateResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getWorkflowStateResponse")
    public JAXBElement<GetWorkflowStateResponse> createGetWorkflowStateResponse(GetWorkflowStateResponse value) {
        return new JAXBElement<GetWorkflowStateResponse>(_GetWorkflowStateResponse_QNAME, GetWorkflowStateResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse")
    public JAXBElement<GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse> createGetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse(GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse value) {
        return new JAXBElement<GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse>(_GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse_QNAME, GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority")
    public JAXBElement<GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority> createGetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority(GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority value) {
        return new JAXBElement<GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority>(_GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority_QNAME, GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority")
    public JAXBElement<DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority> createDoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority(DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority value) {
        return new JAXBElement<DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority>(_DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority_QNAME, DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link CanChangeWorkFlowSate }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "canChangeWorkFlowSate")
    public JAXBElement<CanChangeWorkFlowSate> createCanChangeWorkFlowSate(CanChangeWorkFlowSate value) {
        return new JAXBElement<CanChangeWorkFlowSate>(_CanChangeWorkFlowSate_QNAME, CanChangeWorkFlowSate.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link TranscendObjectByLoginResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "transcendObjectByLoginResponse")
    public JAXBElement<TranscendObjectByLoginResponse> createTranscendObjectByLoginResponse(TranscendObjectByLoginResponse value) {
        return new JAXBElement<TranscendObjectByLoginResponse>(_TranscendObjectByLoginResponse_QNAME, TranscendObjectByLoginResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.webservices.workflow.adeamx.com/", name = "canDoNextObjectByIdReferenciaAndIdConfObjetoLogin")
    public JAXBElement<CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin> createCanDoNextObjectByIdReferenciaAndIdConfObjetoLogin(CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin value) {
        return new JAXBElement<CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin>(_CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin_QNAME, CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin.class, null, value);
    }
}
