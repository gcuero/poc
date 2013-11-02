/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.dao.utils;

import java.io.Serializable;
import java.util.List;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.service.GenericCatalogService;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.domain.WorkflowStateMap;

/**
 *
 * @author gcuero
 */
public interface ICatalogQueryHelper<T, PK extends Serializable> extends GenericCatalogService<T, PK> {
    
    public Integer countByQueryName(String queryName, List<QueryParam> queryParams)
            throws GenericServiceException ;

    public List<T> getListByName(String queryName, List<QueryParam> queryParams)
            throws GenericServiceException;

    public List<T> getListPagedByName(String queryName, List<QueryParam> queryParams,
            int page, int numRows) throws GenericServiceException;

    public List<WorkflowStateMap<T>> getStateMapListByName(String queryName,
            List<QueryParam> queryParams) throws GenericServiceException ;

    public List<WorkflowStateMap<T>> getStateMapListPagedByName(String queryName,
            List<QueryParam> queryParams, int page, int numRows) throws GenericServiceException ;
}
