/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.webservices.rest;

import com.adeamx.workflow.domain.CodeMessageConstants;
import com.adeamx.workflow.domain.RestResponseMessage;
import org.kudytech.confsistema.model.ConfSistema;
import org.kudytech.confsistema.service.impl.ConfSistemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author gcuero
 */
@Controller
public class ConfSistemaController extends AbstractRestController {

    @Autowired
    @Qualifier("confSistemaService")
    ConfSistemaServiceImpl confSistemaService;

    @RequestMapping(value = "/rest/findByCatalogAndVariable/{catalogo}/{variable}", method = RequestMethod.GET)
    public ModelAndView findByCatalogAndVariable(@PathVariable("catalogo") String catalogo,
            @PathVariable("variable") String variable) {
        RestResponseMessage responseMessage = new RestResponseMessage();
        try {
            ConfSistema confSistema = this.confSistemaService.findByCatalogAndVariable(catalogo, variable);
            responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
            responseMessage.setObjectMessage(confSistema);
            debug("Returing : " + confSistema.getDescripcion());
            return createResponse(ConfSistemaController.DATA_FIELD, responseMessage);
        } catch (Exception e) {
            String sMessage = "Error invoking login. [%1$s]";
            responseMessage = new RestResponseMessage();
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            responseMessage.setErrorMessage(String.format(sMessage, e.toString()));
            return createResponse(ConfSistemaController.ERROR_FIELD, responseMessage);
        }
    }
}
