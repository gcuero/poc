/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.dao.RestrictionModel;
import org.kudytech.core.common.dao.RestrictionOperators;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.dao.ConfObjetoDAO;
import org.kudytech.workflow.model.ConfObjeto;
import org.kudytech.workflow.service.ConfObjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("confObjetoService")
public class ConfObjetoServiceImpl extends AbstractDebug implements ConfObjetoService {

    private static final String CLAZZ_PROPOERTY = "clazz";
    
    @Autowired
    ConfObjetoDAO confObjetoDAO;

    public ConfObjeto getByIdObjeto(Long idObjeto) throws GenericServiceException {
        try {
            return this.confObjetoDAO.find(idObjeto);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public ConfObjeto getByClass(String className) throws GenericServiceException {
        try {
            List<RestrictionModel> restrictionModels =
                    new ArrayList<RestrictionModel>();
            RestrictionModel<String> rm = new RestrictionModel<String>();
            rm.setObjectValue(className);
            rm.setOperator(RestrictionOperators.EQ);
            rm.setPropertyName(ConfObjetoServiceImpl.CLAZZ_PROPOERTY);
            restrictionModels.add(rm);
            return this.confObjetoDAO.findUniqueResultByRestriction(restrictionModels);
        } catch (Exception ex) {
            this.error(ex);
            throw new GenericServiceException(ex);
        }
    }
}
