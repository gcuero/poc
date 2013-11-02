/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.service.impl;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.kudytech.confsistema.service.ConfSistemaService;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.workflow.dao.WorkflowStateDAO;
import org.kudytech.workflow.model.WorkflowCtl;
import org.kudytech.workflow.model.WorkflowState;
import org.kudytech.workflow.service.WorkflowStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cocampo
 */
@Service("workflowStateService")
public class WorkflowStateServiceImpl extends AbstractDebug implements WorkflowStateService {

    private static final String WORKFLOW_STATE_CATALOG = "WORKFLOW_STATE";
    private static final String PIPE_SEPARATOR = "|";
    @Autowired
    WorkflowStateDAO workflowStateDAO;
    @Autowired
    ConfSistemaService confSistemaService;

    public WorkflowState getWorkflowStateByIdWorkflowState(String idWorkflowState)
            throws GenericServiceException {

        try {
            return this.workflowStateDAO.find(idWorkflowState);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    public WorkflowState getWorkflowNextState(WorkflowCtl ctl) throws GenericServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public WorkflowState canChangeWorkFlowSate(WorkflowCtl ctl) throws GenericServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> getListStateByName(String name) throws GenericServiceException {
        String s =
                this.confSistemaService.getStringValueByCatalogAndVariable(
                WORKFLOW_STATE_CATALOG, name);
        String[] split = StringUtils.split(s, PIPE_SEPARATOR);
        List<String> asList = Arrays.asList(split);
        return asList;
    }
}
