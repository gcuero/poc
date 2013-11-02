package org.kudytech.workflow.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.kudytech.workflow.ws.domain.WorkflowCtl;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybrid;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybridList;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.6-1b01 Generated
 * source version: 2.2
 *
 */
@WebService(name = "WorkFlowWS", targetNamespace = "http://ws.webservices.workflow.adeamx.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WorkFlowWS {

    /**
     *
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWorkflowState", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetWorkflowState")
    @ResponseWrapper(localName = "getWorkflowStateResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetWorkflowStateResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getWorkflowStateRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getWorkflowStateResponse")
    public AbstractSimpleResponseMessageHybrid getWorkflowState(
            @WebParam(name = "arg0", targetNamespace = "") WorkflowCtl arg0);

    /**
     *
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWorkflowNextState", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetWorkflowNextState")
    @ResponseWrapper(localName = "getWorkflowNextStateResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetWorkflowNextStateResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getWorkflowNextStateRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getWorkflowNextStateResponse")
    public AbstractSimpleResponseMessageHybrid getWorkflowNextState(
            @WebParam(name = "arg0", targetNamespace = "") WorkflowCtl arg0);

    /**
     *
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "canChangeWorkFlowSate", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.CanChangeWorkFlowSate")
    @ResponseWrapper(localName = "canChangeWorkFlowSateResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.CanChangeWorkFlowSateResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/canChangeWorkFlowSateRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/canChangeWorkFlowSateResponse")
    public AbstractSimpleResponseMessageHybrid canChangeWorkFlowSate(
            @WebParam(name = "arg0", targetNamespace = "") WorkflowCtl arg0);

    /**
     *
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "canTranscendObjectByIdReferenciaIdObjetoEventAuthority", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.CanTranscendObjectByIdReferenciaIdObjetoEventAuthority")
    @ResponseWrapper(localName = "canTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.CanTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/canTranscendObjectByIdReferenciaIdObjetoEventAuthorityRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/canTranscendObjectByIdReferenciaIdObjetoEventAuthorityResponse")
    public AbstractSimpleResponseMessageHybrid canTranscendObjectByIdReferenciaIdObjetoEventAuthority(
            @WebParam(name = "arg0", targetNamespace = "") Long arg0,
            @WebParam(name = "arg1", targetNamespace = "") Long arg1,
            @WebParam(name = "arg2", targetNamespace = "") String arg2,
            @WebParam(name = "arg3", targetNamespace = "") String arg3);

    /**
     *
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority")
    @ResponseWrapper(localName = "getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthorityResponse")
    public AbstractSimpleResponseMessageHybrid getNextStateByIdReferenciaIdObjetoCurrentStateEventAuthority(
            @WebParam(name = "arg0", targetNamespace = "") Long arg0,
            @WebParam(name = "arg1", targetNamespace = "") Long arg1,
            @WebParam(name = "arg2", targetNamespace = "") String arg2,
            @WebParam(name = "arg3", targetNamespace = "") String arg3,
            @WebParam(name = "arg4", targetNamespace = "") String arg4);

    /**
     *
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority")
    @ResponseWrapper(localName = "doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.DoNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthorityResponse")
    public AbstractSimpleResponseMessageHybrid doNextTranscendObjectByIdReferenciaIdObjetoLoginAuthority(
            @WebParam(name = "arg0", targetNamespace = "") Long arg0,
            @WebParam(name = "arg1", targetNamespace = "") Long arg1,
            @WebParam(name = "arg2", targetNamespace = "") String arg2,
            @WebParam(name = "arg3", targetNamespace = "") String arg3);

    /**
     *
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "transcendObjectByIdReferenciaIdObjetoEventLoginAuthority", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.TranscendObjectByIdReferenciaIdObjetoEventLoginAuthority")
    @ResponseWrapper(localName = "transcendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.TranscendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/transcendObjectByIdReferenciaIdObjetoEventLoginAuthorityRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/transcendObjectByIdReferenciaIdObjetoEventLoginAuthorityResponse")
    public AbstractSimpleResponseMessageHybrid transcendObjectByIdReferenciaIdObjetoEventLoginAuthority(
            @WebParam(name = "arg0", targetNamespace = "") Long arg0,
            @WebParam(name = "arg1", targetNamespace = "") Long arg1,
            @WebParam(name = "arg2", targetNamespace = "") String arg2,
            @WebParam(name = "arg3", targetNamespace = "") String arg3,
            @WebParam(name = "arg4", targetNamespace = "") String arg4);

    /**
     *
     * @param arg2
     * @param arg1
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "doNextByIdReferenciaAndIdConfObjetoLogin", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.DoNextByIdReferenciaAndIdConfObjetoLogin")
    @ResponseWrapper(localName = "doNextByIdReferenciaAndIdConfObjetoLoginResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.DoNextByIdReferenciaAndIdConfObjetoLoginResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/doNextByIdReferenciaAndIdConfObjetoLoginRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/doNextByIdReferenciaAndIdConfObjetoLoginResponse")
    public AbstractSimpleResponseMessageHybrid doNextByIdReferenciaAndIdConfObjetoLogin(
            @WebParam(name = "arg0", targetNamespace = "") Long arg0,
            @WebParam(name = "arg1", targetNamespace = "") Long arg1,
            @WebParam(name = "arg2", targetNamespace = "") String arg2);

    /**
     *
     * @param arg2
     * @param arg1
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "canDoNextObjectByIdReferenciaAndIdConfObjetoLogin", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.CanDoNextObjectByIdReferenciaAndIdConfObjetoLogin")
    @ResponseWrapper(localName = "canDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.CanDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/canDoNextObjectByIdReferenciaAndIdConfObjetoLoginRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/canDoNextObjectByIdReferenciaAndIdConfObjetoLoginResponse")
    public AbstractSimpleResponseMessageHybrid canDoNextObjectByIdReferenciaAndIdConfObjetoLogin(
            @WebParam(name = "arg0", targetNamespace = "") Long arg0,
            @WebParam(name = "arg1", targetNamespace = "") Long arg1,
            @WebParam(name = "arg2", targetNamespace = "") String arg2);

    /**
     *
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIdConfObjetoByClassName", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetIdConfObjetoByClassName")
    @ResponseWrapper(localName = "getIdConfObjetoByClassNameResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetIdConfObjetoByClassNameResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getIdConfObjetoByClassNameRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getIdConfObjetoByClassNameResponse")
    public AbstractSimpleResponseMessageHybrid getIdConfObjetoByClassName(
            @WebParam(name = "arg0", targetNamespace = "") String arg0);

    /**
     *
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybridList
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListStateByName", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetListStateByName")
    @ResponseWrapper(localName = "getListStateByNameResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.GetListStateByNameResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getListStateByNameRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/getListStateByNameResponse")
    public AbstractSimpleResponseMessageHybridList getListStateByName(
            @WebParam(name = "arg0", targetNamespace = "") String arg0);

    /**
     *
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "canTranscendObjectByLogin", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.CanTranscendObjectByLogin")
    @ResponseWrapper(localName = "canTranscendObjectByLoginResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.CanTranscendObjectByLoginResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/canTranscendObjectByLoginRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/canTranscendObjectByLoginResponse")
    public AbstractSimpleResponseMessageHybrid canTranscendObjectByLogin(
            @WebParam(name = "arg0", targetNamespace = "") Long arg0,
            @WebParam(name = "arg1", targetNamespace = "") Long arg1,
            @WebParam(name = "arg2", targetNamespace = "") String arg2,
            @WebParam(name = "arg3", targetNamespace = "") String arg3);

    /**
     *
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return returns
     * org.kudytech.workflow.ws.client.AbstractSimpleResponseMessageHybrid
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "transcendObjectByLogin", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.TranscendObjectByLogin")
    @ResponseWrapper(localName = "transcendObjectByLoginResponse", targetNamespace = "http://ws.webservices.workflow.adeamx.com/", className = "org.kudytech.workflow.ws.client.TranscendObjectByLoginResponse")
    @Action(input = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/transcendObjectByLoginRequest", output = "http://ws.webservices.workflow.adeamx.com/WorkFlowWS/transcendObjectByLoginResponse")
    public AbstractSimpleResponseMessageHybrid transcendObjectByLogin(
            @WebParam(name = "arg0", targetNamespace = "") Long arg0,
            @WebParam(name = "arg1", targetNamespace = "") Long arg1,
            @WebParam(name = "arg2", targetNamespace = "") String arg2,
            @WebParam(name = "arg3", targetNamespace = "") String arg3);
}