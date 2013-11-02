/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.query.service.impl;

import java.util.List;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.dao.ConfGraphicDAO;
import org.kudytech.query.model.ConfGraphic;
import org.kudytech.query.service.ConfGraphicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("confGraphicService")
public class ConfGraphicServiceImpl extends AbstractDebug implements ConfGraphicService {
    
    private static final String ESTATUS_PROPERTY = "estatus";
    
    @Autowired
    ConfGraphicDAO confGraphicDAO;

    public ConfGraphic getQueryConfByQueryName(String queryName) throws GenericServiceException {
        try {
            return this.confGraphicDAO.find(queryName);
        } catch (Exception ex) {
            this.error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public List<ConfGraphic> getConfGraphicActiveList() throws GenericServiceException{
        try {
            return this.confGraphicDAO.findByProperty(ESTATUS_PROPERTY, Boolean.TRUE);
        } catch (Exception ex) {
            this.error(ex);
            throw new GenericServiceException(ex);
        }
    }
    
    
}
