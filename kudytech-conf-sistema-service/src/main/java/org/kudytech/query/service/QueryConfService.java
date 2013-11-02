/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.query.service;

import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.model.QueryConf;

/**
 *
 * @author gcuero
 */
public interface QueryConfService {

    QueryConf getQueryConfByQueryName(String queryName) throws GenericServiceException;
}
