/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.query.service.impl;

import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.dao.QueryConfDAO;
import org.kudytech.query.model.QueryConf;
import org.kudytech.query.service.QueryConfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryConfServiceImpl extends AbstractDebug implements QueryConfService {

    @Autowired
    QueryConfDAO queryConfDAO;

    public QueryConf getQueryConfByQueryName(String queryName)
            throws GenericServiceException {
        try {
            return this.queryConfDAO.find(queryName);
        } catch (Exception ex) {
            this.error(ex);
            throw new GenericServiceException(ex);
        }
    }
}
