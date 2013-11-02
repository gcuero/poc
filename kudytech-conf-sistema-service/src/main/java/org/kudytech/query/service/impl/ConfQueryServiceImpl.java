/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.query.service.impl;

import javax.annotation.Resource;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.dao.ConfQueryDAO;
import org.kudytech.query.model.ConfQuery;
import org.kudytech.query.service.ConfQueryService;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("confQueryService")
public class ConfQueryServiceImpl implements ConfQueryService {

    @Resource
    ConfQueryDAO confQueryDAO;

    public String getQueryByName(String queryName) throws GenericServiceException {
        return this.getConfQueryByName(queryName).getQuery1();
    }

    public ConfQuery getConfQueryByName(String queryName) throws GenericServiceException {
        try {
            ConfQuery confQuery = this.confQueryDAO.find(queryName);
            return confQuery;
        } catch (Exception ex) {
            Logger.getLogger(ConfQueryServiceImpl.class.getName()).log(Level.ERROR, null, ex);
            throw new GenericServiceException(ex);
        }
    }

    public String getQuery1ConcatQuery2ByName(String queryName) throws GenericServiceException {
        ConfQuery confQuery = this.getConfQueryByName(queryName);
        String query1 = confQuery.getQuery1();
        String query2 = confQuery.getQuery2();
        return query1 + query2;
    }

    public String getQuery2ByName(String queryName) throws GenericServiceException {
        return this.getConfQueryByName(queryName).getQuery2();
    }
}
