/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.query.service;

import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.model.ConfQuery;

/**
 *
 * @author gcuero
 */
public interface ConfQueryService {

    String getQueryByName(String queryName) throws GenericServiceException;
    
    String getQuery2ByName(String queryName) throws GenericServiceException;

    ConfQuery getConfQueryByName(String queryName) throws GenericServiceException;

    String getQuery1ConcatQuery2ByName(String queryName) throws GenericServiceException;
}
