/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.compras.ws.service.impl;

import java.util.Date;
import java.util.List;
import org.kudytech.compras.ws.confsistema.client.ConfSistemaWS;
import org.kudytech.compras.ws.confsistema.client.ConfSistemaWSService;
import org.kudytech.compras.ws.service.ConfSistemaService;
import org.kudytech.confsistema.ws.domain.ConfSistema;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybrid;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybridList;
import org.kudytech.ws.utils.ResponseMessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("confSistemaService")
public class ConfSistemaServiceImpl implements ConfSistemaService {
    
    @Autowired
    ConfSistemaWSService confSistemaWSService;
    
    private ConfSistemaWS getWS(){
        return this.confSistemaWSService.getConfSistemaWSPort();
    }

    public List<ConfSistema> findByCatalog(String catalog) throws Exception {
        AbstractSimpleResponseMessageHybridList asrmhl = 
                this.getWS().findByCatalog(catalog);
        return (List<ConfSistema>) ResponseMessageUtils.processResponseMessageHybrid(asrmhl);
    }

    public ConfSistema findByCatalogAndVariable(String catalog, String variable) 
            throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWS().findByCatalogAndVariable(catalog, variable);
        return (ConfSistema) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public String getStringValueByCatalogAndVariable(String catalog, String variable) 
            throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWS().getStringValueByCatalogAndVariable(catalog, variable);
        return  (String) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public Long getNumberValueByCatalogAndVariable(String catalog, String variable) 
            throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWS().getNumberValueByatCalogAndVariable(catalog, variable);
        return  (Long) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public Date getDateValueByatCalogAndVariable(String catalog, String variable) 
            throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWS().getDateValueByatCalogAndVariable(catalog, variable);
        return (Date) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }

    public byte[] getBlobValueByatCalogAndVariable(String catalog, String variable) 
            throws Exception {
        AbstractSimpleResponseMessageHybrid asrmh = 
                this.getWS().getBlobValueByatCalogAndVariable(catalog, variable);
        return (byte[]) ResponseMessageUtils.processResponseMessageHybrid(asrmh);
    }
    
}
