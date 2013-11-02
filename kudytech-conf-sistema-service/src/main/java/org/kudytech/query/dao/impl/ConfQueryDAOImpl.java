/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.query.dao.impl;

import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.query.dao.ConfQueryDAO;
import org.kudytech.query.model.ConfQuery;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("confQueryDAO")
public class ConfQueryDAOImpl extends
		GenericDAOImpl<ConfQuery, String> implements ConfQueryDAO{
    
}
