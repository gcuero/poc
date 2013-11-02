/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.query.dao.impl;

import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.query.dao.QueryConfDAO;
import org.kudytech.query.model.QueryConf;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("queryConfDAO")
public class QueryConfDAOImpl extends GenericDAOImpl<QueryConf, String>
        implements QueryConfDAO {
}
