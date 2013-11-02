/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.dao;

import java.util.List;
import org.kudytech.adeamx.mexweb.model.Authority;
import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.dao.GenericDAOException;

/**
 *
 * @author gcuero
 */
public interface AuthorityDAO extends GenericDAO<Authority, String> {

    List<Authority> getAuthoritiesByLogin(String login) throws GenericDAOException;
}
