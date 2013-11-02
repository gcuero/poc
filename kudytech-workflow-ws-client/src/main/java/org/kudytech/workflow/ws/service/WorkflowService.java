/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.ws.service;

import java.util.List;
import org.kudytech.workflow.ws.domain.Workflow;
import org.kudytech.workflow.ws.domain.WorkflowCtl;
import org.kudytech.workflow.ws.domain.WorkflowState;

/**
 *
 * @author gcuero
 */
public interface WorkflowService {

    Workflow getWorkflowById(Long idWorkFlow) throws Exception;

    Boolean canTranscendObject(Long idReferencia, Long idObjecto,
            String event, String autorithy) throws Exception;

    WorkflowState getNextState(Long idReferencia, Long idObjecto, String currentState,
            String event, String autorithy) throws Exception;

    WorkflowCtl doNextTranscendObject(Long idReferencia, Long idObjecto, String login,
            String autorithy) throws Exception;

    WorkflowCtl transcendObject(Long idReferencia, Long idObjecto, String event,
            String login, String autorithy) throws Exception;

    WorkflowCtl doNextByIdReferenciaAndIdConfObjeto(Long idReferencia,
            Long idConfObjeto, String login) throws Exception;

    Boolean canDoNextObject(Long idReferencia, Long idConfObjeto, String login)
            throws Exception;

    Long getIdConfObjeto(Class clazz) throws Exception;

    Long getIdConfObjetoByClassName(String className) throws Exception;

    List<String> getListStateByName(String name) throws Exception;

    Boolean canTranscendObjectByLogin(Long idReferencia, Long idObjeto, String login,
            String event) throws Exception;

    WorkflowCtl transcendObject(Long idReferencia, Long idConfObjeto,
            String login, String event) throws Exception;
}
