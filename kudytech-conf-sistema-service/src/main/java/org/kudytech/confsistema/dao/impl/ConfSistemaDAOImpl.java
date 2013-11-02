/**
 * 
 */
package org.kudytech.confsistema.dao.impl;


import org.kudytech.confsistema.dao.ConfSistemaDAO;
import org.kudytech.confsistema.model.ConfSistema;
import org.kudytech.confsistema.model.ConfSistemaPK;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.springframework.stereotype.Repository;

/**
 * @author ERNESTO
 *
 */
@Repository("confSistemaDAO")
public class ConfSistemaDAOImpl extends
		GenericDAOImpl<ConfSistema, ConfSistemaPK> implements ConfSistemaDAO {


}
