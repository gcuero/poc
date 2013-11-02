/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service.impl;

import java.util.GregorianCalendar;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.dao.WorkflowCtlDAO;
import org.kudytech.workflow.model.ConfObjeto;
import org.kudytech.workflow.model.WorkflowCtl;
import org.kudytech.workflow.model.WorkflowState;
import org.kudytech.workflow.service.ConfObjetoService;
import org.kudytech.workflow.service.WorkflowCtlService;
import org.kudytech.workflow.service.WorkflowStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("workflowCtlService")
public class WorkflowCtlServiceImpl extends AbstractDebug implements WorkflowCtlService {

    public static final String OBJECT_REGISTRED_MESSAGE =
            "El objeto con idReferencia=[%1$s] - idObjeto[%2$s], ya ha sido registrado previamente.";
    public static final String OBJECT_NOT_REGISTRED_MESSAGE =
            "El objeto con idReferencia=[%1$s] - idObjeto[%2$s], aun no ha sido registrado previamente.";
    public static final String CONF_OBJETO_NOT_REGISTRED_MESSAGE =
            "No existe un registro en CONF_OBJETO con idObjeto[%1$s].";
    public static final String WORKFLOW_STATE_NOT_REGISTRED_MESSAGE =
            "No existe un registro en WORKFLOW_STATE con idWorkflowStatte[%1$s].";
    @Autowired
    ConfObjetoService confObjetoService;
    @Autowired
    WorkflowCtlDAO workflowCtlDAO;
    @Autowired
    WorkflowStateService workflowStateService;

    public WorkflowCtl saveWorkflowCtl(Long idReferencia, Long idObjeto, String currentState,
            String login) throws GenericServiceException {
        try {
            WorkflowCtl workflowCtl =
                    this.workflowCtlDAO.getWorkflowCtlByIdReferenciAndIdObjeto(
                    idReferencia, idObjeto);
            if (workflowCtl != null) {
                throw new GenericServiceException(
                        String.format(WorkflowCtlServiceImpl.OBJECT_REGISTRED_MESSAGE,
                        idReferencia, idObjeto));
            } else {
                ConfObjeto confObjeto = this.confObjetoService.getByIdObjeto(idObjeto);
                if (confObjeto == null) {
                    throw new GenericServiceException(
                            String.format(WorkflowCtlServiceImpl.CONF_OBJETO_NOT_REGISTRED_MESSAGE,
                            idObjeto));
                }
                WorkflowState workflowState =
                        this.workflowStateService.getWorkflowStateByIdWorkflowState(currentState);
                if (workflowState == null) {
                    throw new GenericServiceException(
                            String.format(
                            WorkflowCtlServiceImpl.WORKFLOW_STATE_NOT_REGISTRED_MESSAGE,
                            currentState));
                }
                workflowCtl = new WorkflowCtl();
                workflowCtl.setConfObjeto(confObjeto);
                workflowCtl.setIdreferencia(idReferencia);
                workflowCtl.setWorkflowCurrentState(workflowState);
                workflowCtl.setLogin(login);
                workflowCtl.setFecha(GregorianCalendar.getInstance().getTime());
                this.workflowCtlDAO.save(workflowCtl);
                return workflowCtl;
            }
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public void updateWorkflowCtl(Long idReferencia, Long idObjeto, String currentState)
            throws GenericServiceException {
        try {
            WorkflowCtl workflowCtl = this.getWorkflowCtlByIdReferenciAndIdObjeto(idReferencia, idObjeto);
            if (workflowCtl == null) {
                throw new GenericServiceException(
                        String.format(WorkflowCtlServiceImpl.OBJECT_NOT_REGISTRED_MESSAGE,
                        idReferencia, idObjeto));
            } else {
                ConfObjeto confObjeto = this.confObjetoService.getByIdObjeto(idObjeto);
                if (confObjeto == null) {
                    throw new GenericServiceException(
                            String.format(WorkflowCtlServiceImpl.CONF_OBJETO_NOT_REGISTRED_MESSAGE,
                            idObjeto));
                }
                WorkflowState workflowState =
                        this.workflowStateService.getWorkflowStateByIdWorkflowState(currentState);
                if (workflowState == null) {
                    throw new GenericServiceException(
                            String.format(WorkflowCtlServiceImpl.WORKFLOW_STATE_NOT_REGISTRED_MESSAGE,
                            currentState));
                }
                workflowCtl.setConfObjeto(confObjeto);
                workflowCtl.setIdreferencia(idReferencia);
                workflowCtl.setWorkflowCurrentState(workflowState);
                this.updateWorkflowCtl(workflowCtl);
            }
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public void updateWorkflowCtl(WorkflowCtl workflowCtl) throws GenericServiceException {
        try {
            this.workflowCtlDAO.update(workflowCtl);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public WorkflowCtl getWorkflowCtlByIdReferenciAndIdObjeto(Long idReferencia,
            Long idObjeto) throws GenericServiceException {
        try {
            if (idReferencia != null) {
                return this.workflowCtlDAO.getWorkflowCtlByIdReferenciAndIdObjeto(
                        idReferencia, idObjeto);
            } else {
                return null;
            }
        } catch (GenericDAOException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }
}
