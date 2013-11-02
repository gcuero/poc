/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service;

import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.model.utils.ModelIdProvider;
import org.kudytech.workflow.domain.WorkflowStateMap;
import org.kudytech.workflow.model.Workflow;
import org.kudytech.workflow.model.WorkflowCtl;
import org.kudytech.workflow.model.WorkflowState;

/**
 *
 * @author gcuero
 */
public interface WorkflowService {

    /**
     *
     * @param idWorkFlow
     * @return
     * @throws GenericServiceException
     */
    Workflow getWorkflowById(Long idWorkFlow) throws GenericServiceException;

    /**
     *
     * @param idReferencia
     * @param idObjecto
     * @param event
     * @param autorithy
     * @return
     * @throws GenericServiceException
     */
    Boolean canTranscendObject(Long idReferencia, Long idObjecto,
            String event, String autorithy) throws GenericServiceException;

    /**
     *
     * @param idReferencia
     * @param idObjecto
     * @param currentState
     * @param event
     * @param autorithy
     * @return
     * @throws GenericServiceException
     */
    WorkflowState getNextState(Long idReferencia, Long idObjecto, String currentState,
            String event, String autorithy) throws GenericServiceException;

    /**
     *
     * @param idReferencia
     * @param idObjecto
     * @param currentState
     * @param autorithy
     * @throws GenericServiceException
     */
    WorkflowCtl doNextTranscendObject(Long idReferencia, Long idObjecto, String login,
            String autorithy) throws GenericServiceException;

    /**
     *
     * @param idReferencia
     * @param idObjecto
     * @param currentState
     * @param event
     * @param login
     * @param autorithy
     * @throws GenericServiceException
     */
    WorkflowCtl transcendObject(Long idReferencia, Long idObjecto, String event,
            String login, String autorithy) throws GenericServiceException;

    /**
     *
     * @param object
     * @param login
     * @param event
     * @return
     * @throws GenericServiceException
     */
    WorkflowCtl transcendObject(ModelIdProvider object, String login, String event)
            throws GenericServiceException;

    /**
     *
     * @param object
     * @return
     * @throws GenericServiceException
     */
    WorkflowStateMap getWorkflowStateByObject(ModelIdProvider object)
            throws GenericServiceException;

    /**
     *
     * @param object
     * @param login
     * @param autorithy
     * @return
     * @throws GenericServiceException
     */
    WorkflowCtl doNextByObject(ModelIdProvider object, String login,
            String autorithy) throws GenericServiceException;

    /**
     *
     * @param object
     * @param login
     * @return
     * @throws GenericServiceException
     */
    WorkflowCtl doNextByObject(ModelIdProvider object, String login)
            throws GenericServiceException;

    /**
     *
     * @param idReferencia
     * @param idConfObjeto
     * @param login
     * @return
     * @throws GenericServiceException
     */
    WorkflowCtl doNextByIdReferenciaAndIdConfObjeto(Long idReferencia,
            Long idConfObjeto, String login) throws GenericServiceException;

    /**
     *
     * @param object
     * @param login
     * @param event
     * @return
     * @throws GenericServiceException
     */
    Boolean canTranscendObject(ModelIdProvider object, String login, String event)
            throws GenericServiceException;

    /**
     *
     * @param object
     * @param login
     * @return
     * @throws GenericServiceException
     */
    Boolean canDoNextObject(ModelIdProvider object, String login)
            throws GenericServiceException;

    /**
     *
     * @param idReferencia
     * @param idConfObjeto
     * @param login
     * @return
     * @throws GenericServiceException
     */
    Boolean canDoNextObject(Long idReferencia, Long idConfObjeto, String login)
            throws GenericServiceException;

    /**
     *
     * @param object
     * @return
     * @throws GenericServiceException
     */
    Long getIdConfObjeto(Class clazz) throws GenericServiceException;

    /**
     *
     * @param className
     * @return
     * @throws GenericServiceException
     */
    Long getIdConfObjetoByClassName(String className) throws GenericServiceException;

    Boolean canTranscendObjectByLogin(Long idReferencia, Long idObjeto, String login,
            String event) throws GenericServiceException;

    WorkflowCtl transcendObject(Long idReferencia, Long idConfObjeto,
            String login, String event) throws GenericServiceException;

    Boolean isInState(Long idReferencia, Long idObjeto, String state) throws GenericServiceException;

    Boolean isInState(ModelIdProvider object, String state) throws GenericServiceException;
}
