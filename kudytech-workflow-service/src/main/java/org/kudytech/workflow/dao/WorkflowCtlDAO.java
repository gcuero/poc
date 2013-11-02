/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao;

import java.util.List;
import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.workflow.model.WorkflowCtl;

/**
 *
 * @author gcuero
 */
public interface WorkflowCtlDAO extends GenericDAO<WorkflowCtl, Long> {

    WorkflowCtl getWorkflowCtlByIdReferenciAndIdObjeto(Long idReferencia, Long idObjeto) throws GenericDAOException;

    List<WorkflowCtl> getWorkflowCtlListByCurrentState(String currentSate) throws GenericDAOException;
}
