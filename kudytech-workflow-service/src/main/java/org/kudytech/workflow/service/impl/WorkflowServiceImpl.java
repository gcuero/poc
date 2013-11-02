/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service.impl;

import java.util.GregorianCalendar;
import java.util.List;
import org.kudytech.adeamx.mexweb.model.Authority;
import org.kudytech.confsistema.service.ConfSistemaService;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.model.utils.ModelIdProvider;
import org.kudytech.webmx.service.AuthenticationService;
import org.kudytech.workflow.dao.WorkflowDAO;
import org.kudytech.workflow.domain.WorkflowStateMap;
import org.kudytech.workflow.model.ConfObjeto;
import org.kudytech.workflow.model.Workflow;
import org.kudytech.workflow.model.WorkflowConfig;
import org.kudytech.workflow.model.WorkflowCtl;
import org.kudytech.workflow.model.WorkflowEvent;
import org.kudytech.workflow.model.WorkflowSecurity;
import org.kudytech.workflow.model.WorkflowState;
import org.kudytech.workflow.service.ConfObjetoService;
import org.kudytech.workflow.service.WorkflowConfigService;
import org.kudytech.workflow.service.WorkflowCtlService;
import org.kudytech.workflow.service.WorkflowEventService;
import org.kudytech.workflow.service.WorkflowSecurityService;
import org.kudytech.workflow.service.WorkflowService;
import org.kudytech.workflow.service.WorkflowStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("workflowService")
public class WorkflowServiceImpl extends AbstractDebug implements WorkflowService {

    private static final String WORKFLOW_CATALOG = "WORKFLOW";
    private static final String DONEXT_VARIABLE = "DO_NEXT";
    private static final String CONF_OBJ_CATALOG = "CONF_OBJ_CATALOG";
    @Autowired
    WorkflowDAO workflowDAO;
    @Autowired
    ConfObjetoService confObjetoService;
    @Autowired
    WorkflowCtlService workflowCtlService;
    @Autowired
    WorkflowEventService workflowEventService;
    @Autowired
    WorkflowStateService workflowStateService;
    @Autowired
    WorkflowConfigService workflowConfigService;
    @Autowired
    WorkflowSecurityService workflowSecurityService;
    @Autowired
    ConfSistemaService confSistemaService;
    @Autowired
    AuthenticationService authenticationService;

    public Boolean canTranscendObject(Long idReferencia, Long idObjeto,
            String event, String autorithy) throws GenericServiceException {
        try {
            WorkflowCtl workflowCtl =
                    this.workflowCtlService.getWorkflowCtlByIdReferenciAndIdObjeto(
                    idReferencia, idObjeto);
            String idworkflowState = null;
            if (workflowCtl != null) {
                idworkflowState =
                        workflowCtl.getWorkflowCurrentState().getIdworkflowState();
            }
            ConfObjeto confObjeto =
                    this.confObjetoService.getByIdObjeto(idObjeto);
            if (confObjeto == null) {
                throw new GenericServiceException(
                        String.format(WorkflowCtlServiceImpl.CONF_OBJETO_NOT_REGISTRED_MESSAGE,
                        idObjeto));
            }
            WorkflowEvent workflowEvent =
                    this.workflowEventService.getWorkflowEventById(event);
            if (workflowEvent == null) {
                throw new GenericServiceException(
                        String.format(WorkflowEventServiceImpl.WORKFLOW_EVENT_NOT_REGISTRED_MESSAGE,
                        event));
            }
            WorkflowConfig workflowConfig =
                    this.workflowConfigService.getWorkflowConfig(
                    confObjeto.getWorkflow().getIdworkflow(),
                    workflowEvent.getIdworkflowEvent(), idworkflowState,
                    Boolean.TRUE);
            if (workflowConfig == null) {
                throw new GenericServiceException(
                        String.format(
                        WorkflowConfigServiceImpl.WORKFLOW_CONFIG_NOT_REGISTRED_MESSAGE,
                        confObjeto.getWorkflow().getIdworkflow(),
                        workflowEvent.getIdworkflowEvent(),
                        workflowCtl.getWorkflowCurrentState().getIdworkflowState()));
            }
            WorkflowSecurity workflowSecurity =
                    this.workflowSecurityService.getWorkflowSecurityById(autorithy,
                    workflowConfig.getIdworkflowConfig());
            return workflowSecurity != null;
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public WorkflowState getNextState(Long idReferencia, Long idObjeto,
            String currentState, String event, String autorithy)
            throws GenericServiceException {
        try {
            WorkflowCtl workflowCtl =
                    this.workflowCtlService.getWorkflowCtlByIdReferenciAndIdObjeto(
                    idReferencia, idObjeto);
            if (workflowCtl == null) {
                throw new GenericServiceException(
                        String.format(WorkflowCtlServiceImpl.OBJECT_NOT_REGISTRED_MESSAGE,
                        idReferencia, idObjeto));
            }
            ConfObjeto confObjeto =
                    this.confObjetoService.getByIdObjeto(idObjeto);
            if (confObjeto == null) {
                throw new GenericServiceException(
                        String.format(WorkflowCtlServiceImpl.CONF_OBJETO_NOT_REGISTRED_MESSAGE,
                        idObjeto));
            }
            WorkflowEvent workflowEvent =
                    this.workflowEventService.getWorkflowEventById(event);
            if (workflowEvent == null) {
                throw new GenericServiceException(
                        String.format(WorkflowEventServiceImpl.WORKFLOW_EVENT_NOT_REGISTRED_MESSAGE,
                        event));
            }
            WorkflowConfig workflowConfig =
                    this.workflowConfigService.getWorkflowConfig(
                    confObjeto.getWorkflow(), workflowEvent,
                    workflowCtl.getWorkflowCurrentState(), Boolean.TRUE);
            if (workflowConfig == null) {
                throw new GenericServiceException(
                        String.format(
                        WorkflowConfigServiceImpl.WORKFLOW_CONFIG_NOT_REGISTRED_MESSAGE,
                        confObjeto.getWorkflow().getIdworkflow(),
                        workflowEvent.getIdworkflowEvent(),
                        workflowCtl.getWorkflowCurrentState().getIdworkflowState()));
            }
            return workflowConfig.getWorkflowNextState();
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public WorkflowCtl doNextTranscendObject(Long idReferencia, Long idObjeto,
            String login, String autorithy) throws GenericServiceException {
        String doNextEvent = this.confSistemaService.getStringValueByCatalogAndVariable(
                WorkflowServiceImpl.WORKFLOW_CATALOG,
                WorkflowServiceImpl.DONEXT_VARIABLE);
        return this.transcendObject(idReferencia, idObjeto, doNextEvent, login, autorithy);
    }

    public Workflow getWorkflowById(Long idWorkFlow) throws GenericServiceException {
        try {
            return this.workflowDAO.find(idWorkFlow);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public WorkflowCtl transcendObject(Long idReferencia, Long idObjeto, String event,
            String login, String autorithy) throws GenericServiceException {
        Boolean canTranscendObject =
                this.canTranscendObject(idReferencia, idObjeto, event, autorithy);
        if (canTranscendObject) {
            WorkflowCtl workflowCtl =
                    this.workflowCtlService.getWorkflowCtlByIdReferenciAndIdObjeto(
                    idReferencia, idObjeto);
            String idCurrentState = null;
            if (workflowCtl != null) {
                idCurrentState = workflowCtl.getWorkflowCurrentState().getIdworkflowState();
            }
            ConfObjeto confObjeto =
                    this.confObjetoService.getByIdObjeto(idObjeto);
            WorkflowEvent workflowEvent =
                    this.workflowEventService.getWorkflowEventById(event);
            WorkflowConfig workflowConfig =
                    this.workflowConfigService.getWorkflowConfig(
                    confObjeto.getWorkflow().getIdworkflow(),
                    workflowEvent.getIdworkflowEvent(),
                    idCurrentState, Boolean.TRUE);
            if (workflowCtl != null) {
                workflowCtl.setWorkflowCurrentState(workflowConfig.getWorkflowNextState());
                workflowCtl.setLogin(login);
                workflowCtl.setFecha(GregorianCalendar.getInstance().getTime());
                this.workflowCtlService.updateWorkflowCtl(workflowCtl);
            } else {
                workflowCtl =
                        this.workflowCtlService.saveWorkflowCtl(idReferencia,
                        idObjeto, workflowConfig.getWorkflowNextState().getIdworkflowState(),
                        login);
            }
            return workflowCtl;
        } else {
            throw new GenericServiceException("El usuario:" + login + " con la autoridad:"
                    + autorithy + " no cuenta con los permisos para trascender el objeto con idReferencia :"
                    + idReferencia + " e idObjeto: " + idObjeto);
        }
    }

    public WorkflowCtl transcendObject(ModelIdProvider object, String login, String event)
            throws GenericServiceException {
        String authority = this.getEnabledAuthority(object, login, event);
        Long idConfObjeto = this.getIdConfObjeto(object.getClass());
        return this.transcendObject(object.getId(), idConfObjeto, event, login, authority);
    }

    public WorkflowStateMap getWorkflowStateByObject(ModelIdProvider object)
            throws GenericServiceException {
        try {
            Long idConfObjeto = this.getIdConfObjeto(object.getClass());
            WorkflowCtl ctl =
                    this.workflowCtlService.getWorkflowCtlByIdReferenciAndIdObjeto(
                    object.getId(), idConfObjeto);
            WorkflowStateMap<ModelIdProvider> workflowStateMap =
                    new WorkflowStateMap<ModelIdProvider>();
            workflowStateMap.setObject(object);
            if (ctl != null) {
                workflowStateMap.setState(ctl.getWorkflowCurrentState());
            }
            return workflowStateMap;
        } catch (GenericServiceException ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    /**
     *
     * @param object
     * @param login
     * @param autorithy
     * @return
     * @throws GenericServiceException
     */
    public WorkflowCtl doNextByObject(ModelIdProvider object, String login,
            String autorithy) throws GenericServiceException {
        Long idConfObjeto = this.getIdConfObjeto(object.getClass());
        return this.doNextTranscendObject(object.getId(), idConfObjeto, login, autorithy);
    }

    public WorkflowCtl doNextByObject(ModelIdProvider object, String login)
            throws GenericServiceException {
        Long idConfObjeto = this.getIdConfObjeto(object.getClass());
        String doNextEvent = this.confSistemaService.getStringValueByCatalogAndVariable(
                WorkflowServiceImpl.WORKFLOW_CATALOG,
                WorkflowServiceImpl.DONEXT_VARIABLE);
        String enabledAuthority = this.getEnabledAuthority(object, login, doNextEvent);
        return this.doNextTranscendObject(object.getId(), idConfObjeto, login, enabledAuthority);
    }

    public WorkflowCtl doNextByIdReferenciaAndIdConfObjeto(Long idReferencia, Long idConfObjeto, String login)
            throws GenericServiceException {
        String doNextEvent = this.confSistemaService.getStringValueByCatalogAndVariable(
                WorkflowServiceImpl.WORKFLOW_CATALOG,
                WorkflowServiceImpl.DONEXT_VARIABLE);
        String enabledAuthority = getEnabledAuthority(idReferencia, idConfObjeto, login, doNextEvent);
        return this.doNextTranscendObject(idReferencia, idConfObjeto, login, enabledAuthority);
    }

    public Boolean canTranscendObject(ModelIdProvider object, String login, String event)
            throws GenericServiceException {
        String authority = this.getEnabledAuthority(object, login, event);
        return authority != null;
    }

    public Boolean canDoNextObject(ModelIdProvider object, String login)
            throws GenericServiceException {
        String doNextEvent = this.confSistemaService.getStringValueByCatalogAndVariable(
                WorkflowServiceImpl.WORKFLOW_CATALOG,
                WorkflowServiceImpl.DONEXT_VARIABLE);
        return this.canTranscendObject(object, login, doNextEvent);
    }

    public Boolean canDoNextObject(Long idReferencia, Long idConfObjeto, String login)
            throws GenericServiceException {
        String doNextEvent = this.confSistemaService.getStringValueByCatalogAndVariable(
                WorkflowServiceImpl.WORKFLOW_CATALOG,
                WorkflowServiceImpl.DONEXT_VARIABLE);
        String enabledAuthority = this.getEnabledAuthority(idReferencia, idConfObjeto, login, doNextEvent);
        return this.canTranscendObject(idReferencia, idConfObjeto, doNextEvent, enabledAuthority);
    }

    private String getEnabledAuthority(ModelIdProvider object, String login, String event)
            throws GenericServiceException {
        Long idConfObjeto = this.getIdConfObjeto(object.getClass());
        return this.getEnabledAuthority(object.getId(), idConfObjeto, login, event);
    }

    private String getEnabledAuthority(Long idReferencia, Long idConfObjeto,
            String login, String event) throws GenericServiceException {
        String toReturn = null;
        List<Authority> authoritys =
                this.authenticationService.getAuthoritiesByLogin(login);
        Boolean canTranscendObject;
        for (Authority authority : authoritys) {
            canTranscendObject =
                    this.canTranscendObject(idReferencia, idConfObjeto,
                    event, authority.getIdAuthority());
            if (canTranscendObject) {
                toReturn = authority.getIdAuthority();
                break;
            }
        }
        return toReturn;
    }

    public Long getIdConfObjeto(Class clazz) throws GenericServiceException {
        return this.getIdConfObjetoByClassName(clazz.getSimpleName());
    }

    public Long getIdConfObjetoByClassName(String className) throws GenericServiceException {
        ConfObjeto confObjeto = this.confObjetoService.getByClass(className);
        if (confObjeto != null) {
            return confObjeto.getIdobjeto();
        } else {
            throw new GenericServiceException(
                    "No se encuntra una configuracion de objeto para el nombre : {"
                    + className + "]");
        }
    }

    public Boolean canTranscendObjectByLogin(Long idReferencia, Long idObjeto, String login, String event)
            throws GenericServiceException {
        String authority = this.getEnabledAuthority(idReferencia, idObjeto, login, event);
        return authority != null;
    }

    public WorkflowCtl transcendObject(Long idReferencia, Long idConfObjeto,
            String login, String event) throws GenericServiceException {
        String authority = this.getEnabledAuthority(idReferencia, idConfObjeto,
                login, event);
        return this.transcendObject(idReferencia, idConfObjeto, event, login,
                authority);
    }

    public Boolean isInState(Long idReferencia, Long idObjeto, String state) throws GenericServiceException {
        WorkflowCtl workflowCtl =
                this.workflowCtlService.getWorkflowCtlByIdReferenciAndIdObjeto(
                idReferencia, idObjeto);
        return workflowCtl.getWorkflowCurrentState().getIdworkflowState().equalsIgnoreCase(state);
    }

    public Boolean isInState(ModelIdProvider object, String state) throws GenericServiceException {
        Long idConfObjeto = this.getIdConfObjeto(object.getClass());
        return this.isInState(object.getId(), idConfObjeto, state);
    }
}
