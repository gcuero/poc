/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.query.service;

import java.util.List;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.query.model.ConfGraphic;

/**
 *
 * @author gcuero
 */
public interface ConfGraphicService {

    ConfGraphic getQueryConfByQueryName(String queryName) throws GenericServiceException;

    List<ConfGraphic> getConfGraphicActiveList() throws GenericServiceException;
}
