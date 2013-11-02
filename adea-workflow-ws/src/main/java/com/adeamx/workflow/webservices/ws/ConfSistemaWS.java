package com.adeamx.workflow.webservices.ws;

import com.adeamx.workflow.domain.AbstractSimpleResponseMessageHybrid;
import com.adeamx.workflow.domain.AbstractSimpleResponseMessageHybridList;
import com.adeamx.workflow.domain.CodeMessageConstants;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.kudytech.confsistema.model.ConfSistema;
import org.kudytech.confsistema.service.ConfSistemaService;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.service.GenericServiceException;
import org.springframework.beans.factory.annotation.Autowired;

@WebService(
        targetNamespace = "http://ws.webservices.confsistema.adeamx.com/",
        serviceName = "ConfSistemaWS",
        portName = "ConfSistemaWSPort")
public class ConfSistemaWS extends AbstractDebug {
    
    @Autowired
    ConfSistemaService confSistemaService;

    //    List<ConfSistema> findByCatalog(String catalog) throws GenericServiceException;
    //
    @WebMethod(operationName = "findByCatalog")
    public AbstractSimpleResponseMessageHybridList findByCatalog(
            @WebParam(name = "catalogo") String catalog) {
        AbstractSimpleResponseMessageHybridList<ConfSistema> asrmhl =
                new AbstractSimpleResponseMessageHybridList<ConfSistema>();
        try {
            List<ConfSistema> confSistemas = this.confSistemaService.findByCatalog(catalog);
            asrmhl.setObjectMessage(confSistemas);
            asrmhl.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (GenericServiceException exception) {
            asrmhl.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            asrmhl.setErrorMessage(exception.getMessage());
        } finally {
            return asrmhl;
        }
    }

//    ConfSistema findByCatalogAndVariable(String catalog, String variable) throws GenericServiceException;
//
    @WebMethod(operationName = "findByCatalogAndVariable")
    public AbstractSimpleResponseMessageHybrid findByCatalogAndVariable(
            @WebParam(name = "catalogo") String catalog,
            @WebParam(name = "variable") String variable) {
        AbstractSimpleResponseMessageHybrid<ConfSistema> asrmhl =
                new AbstractSimpleResponseMessageHybrid<ConfSistema>();
        try {
            ConfSistema confSistema = this.confSistemaService.findByCatalogAndVariable(catalog, variable);
            asrmhl.setObjectMessage(confSistema);
            asrmhl.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (GenericServiceException exception) {
            asrmhl.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            asrmhl.setErrorMessage(exception.getMessage());
        } finally {
            return asrmhl;
        }
    }

//    String getStringValueByCatalogAndVariable(String catalog, String variable) throws GenericServiceException;
//
    @WebMethod(operationName = "getStringValueByCatalogAndVariable")
    public AbstractSimpleResponseMessageHybrid getStringValueByCatalogAndVariable(
            @WebParam(name = "catalogo") String catalog,
            @WebParam(name = "variable") String variable) {
        AbstractSimpleResponseMessageHybrid<String> asrmhl =
                new AbstractSimpleResponseMessageHybrid<String>();
        try {
            String s = this.confSistemaService.getStringValueByCatalogAndVariable(catalog, variable);
            asrmhl.setObjectMessage(s);
            asrmhl.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (GenericServiceException exception) {
            asrmhl.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            asrmhl.setErrorMessage(exception.getMessage());
        } finally {
            return asrmhl;
        }
    }

//    Long getNumberValueByatCalogAndVariable(String catalog, String variable) throws GenericServiceException;
//
    @WebMethod(operationName = "getNumberValueByatCalogAndVariable")
    public AbstractSimpleResponseMessageHybrid getNumberValueByatCalogAndVariable(
            @WebParam(name = "catalogo") String catalog,
            @WebParam(name = "variable") String variable) {
        AbstractSimpleResponseMessageHybrid<Long> asrmhl =
                new AbstractSimpleResponseMessageHybrid<Long>();
        try {
            Long l = this.confSistemaService.getNumberValueByatCalogAndVariable(catalog, variable);
            asrmhl.setObjectMessage(l);
            asrmhl.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (GenericServiceException exception) {
            asrmhl.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            asrmhl.setErrorMessage(exception.getMessage());
        } finally {
            return asrmhl;
        }
    }

//    Date getDateValueByatCalogAndVariable(String catalog, String variable) throws GenericServiceException;
//
    @WebMethod(operationName = "getDateValueByatCalogAndVariable")
    public AbstractSimpleResponseMessageHybrid getDateValueByatCalogAndVariable(
            @WebParam(name = "catalogo") String catalog,
            @WebParam(name = "variable") String variable) {
        AbstractSimpleResponseMessageHybrid<Date> asrmhl =
                new AbstractSimpleResponseMessageHybrid<Date>();
        try {
            Date date = this.confSistemaService.getDateValueByatCalogAndVariable(catalog, variable);
            asrmhl.setObjectMessage(date);
            asrmhl.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (GenericServiceException exception) {
            asrmhl.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            asrmhl.setErrorMessage(exception.getMessage());
        } finally {
            return asrmhl;
        }
    }

//    byte[] getBlobValueByatCalogAndVariable(String catalog, String variable) throws GenericServiceException;
//
    @WebMethod(operationName = "getBlobValueByatCalogAndVariable")
    public AbstractSimpleResponseMessageHybrid getBlobValueByatCalogAndVariable(
            @WebParam(name = "catalogo") String catalog,
            @WebParam(name = "variable") String variable) {
        AbstractSimpleResponseMessageHybrid<byte[]> asrmhl =
                new AbstractSimpleResponseMessageHybrid<byte[]>();
        try {
            byte[] bs = this.confSistemaService.getBlobValueByatCalogAndVariable(catalog, variable);
            asrmhl.setObjectMessage(bs);
            asrmhl.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        } catch (GenericServiceException exception) {
            asrmhl.setCodeMessage(CodeMessageConstants.CANNOT_PROCESS_CODE);
            asrmhl.setErrorMessage(exception.getMessage());
        } finally {
            return asrmhl;
        }
    }
    
    @WebMethod(operationName = "testConfSistema")
    public AbstractSimpleResponseMessageHybrid testConfSistema(
            @WebParam(name = "confSistema") ConfSistema confSistema) {
        AbstractSimpleResponseMessageHybrid<ConfSistema> asrmhl =
                new AbstractSimpleResponseMessageHybrid<ConfSistema>();
        asrmhl.setObjectMessage(confSistema);
        return asrmhl;
    }
//    Map<String, String> getMapStringByCatalog(String catalog) throws GenericServiceException;
    
    
}
