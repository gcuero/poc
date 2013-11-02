/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.model.ConfObjeto;

/**
 *
 * @author gcuero
 */
public interface ConfObjetoService {
    
    ConfObjeto getByIdObjeto(Long idObjeto) throws GenericServiceException;
    
    ConfObjeto getByClass(String className) throws GenericServiceException;
}
