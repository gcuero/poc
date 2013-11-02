/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.workflow.dao.impl;

import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.workflow.dao.ConfObjetoDAO;
import org.kudytech.workflow.model.ConfObjeto;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("confObjetoDAO")
public class ConfObjetoDAOImpl extends GenericDAOImpl<ConfObjeto, Long> implements ConfObjetoDAO {
}
