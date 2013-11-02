/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.model.WorkflowCtl;

/**
 *
 * @author gcuero
 */
public interface WorkflowCtlService {

    WorkflowCtl saveWorkflowCtl(Long idReferencia, Long idObjeto, String currentState, String login)
            throws GenericServiceException;

    void updateWorkflowCtl(Long idReferencia, Long idObjeto, String currentState)
            throws GenericServiceException;

    void updateWorkflowCtl(WorkflowCtl workflowCtl) throws GenericServiceException;

    WorkflowCtl getWorkflowCtlByIdReferenciAndIdObjeto(Long idReferencia, Long idObjeto)
            throws GenericServiceException;
}
