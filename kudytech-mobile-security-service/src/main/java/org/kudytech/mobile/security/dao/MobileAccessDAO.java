/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.mobile.security.dao;

import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.mobile.security.model.MobileAccess;
import org.kudytech.mobile.security.model.MobileAccessPK;

/**
 *
 * @author gcuero
 */
public interface MobileAccessDAO extends GenericDAO<MobileAccess, MobileAccessPK> {

    MobileAccess getMobileAccessByLoginAndToken(String login, String token) throws GenericDAOException;
}
