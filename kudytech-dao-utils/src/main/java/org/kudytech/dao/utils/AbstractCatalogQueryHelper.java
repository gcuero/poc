/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.dao.utils;

import java.io.Serializable;
import java.util.List;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.core.common.service.impl.GenericCatalogServiceImpl;
import org.kudytech.workflow.domain.WorkflowStateMap;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author gcuero
 */
public abstract class AbstractCatalogQueryHelper<T extends Serializable, PK extends Serializable>
        extends GenericCatalogServiceImpl<T, PK> implements ICatalogQueryHelper<T, PK> {

    @Autowired
    QueryHelper<T> queryHelper;

    public Integer countByQueryName(String queryName, List<QueryParam> queryParams)
            throws GenericServiceException {
        try {
            return this.queryHelper.countByQueryName(queryName, queryParams);
        } catch (GenericDAOException ex) {
            this.error(ex);
            throw this.getGenericException(ex);
        }
    }

    public List<T> getListByName(String queryName, List<QueryParam> queryParams)
            throws GenericServiceException {
        try {
            return this.queryHelper.getListByName(queryName, queryParams);
        } catch (GenericDAOException ex) {
            this.error(ex);
            throw this.getGenericException(ex);
        }
    }

    public List<T> getListPagedByName(String queryName, List<QueryParam> queryParams,
            int page, int numRows) throws GenericServiceException {
        try {
            return this.queryHelper.getListPagedByName(queryName, queryParams,
                    page, numRows);
        } catch (GenericDAOException ex) {
            this.error(ex);
            throw this.getGenericException(ex);
        }
    }

    public List<WorkflowStateMap<T>> getStateMapListByName(String queryName,
            List<QueryParam> queryParams) throws GenericServiceException {
        try {
            return this.queryHelper.getStateMapListByName(queryName, queryParams);
        } catch (GenericDAOException ex) {
            this.error(ex);
            throw this.getGenericException(ex);
        }
    }

    public List<WorkflowStateMap<T>> getStateMapListPagedByName(String queryName,
            List<QueryParam> queryParams, int page, int numRows) throws GenericServiceException {
        return this.getStateMapListPagedByName(queryName, queryParams, page, numRows);
    }
}
