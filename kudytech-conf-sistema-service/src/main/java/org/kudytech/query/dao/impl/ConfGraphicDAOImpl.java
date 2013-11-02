/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.query.dao.impl;

import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.query.dao.ConfGraphicDAO;
import org.kudytech.query.model.ConfGraphic;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("confGraphicDAO")
public class ConfGraphicDAOImpl extends GenericDAOImpl<ConfGraphic, String>
        implements ConfGraphicDAO {
}
