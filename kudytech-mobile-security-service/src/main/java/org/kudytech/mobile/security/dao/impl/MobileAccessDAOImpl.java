/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.mobile.security.dao.impl;

import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.mobile.security.dao.MobileAccessDAO;
import org.kudytech.mobile.security.model.MobileAccess;
import org.kudytech.mobile.security.model.MobileAccessPK;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("mobileAccessDAO")
public class MobileAccessDAOImpl extends GenericDAOImpl<MobileAccess, MobileAccessPK> implements MobileAccessDAO {

    public MobileAccess getMobileAccessByLoginAndToken(String login, String token) throws GenericDAOException {
        MobileAccessPK mobileAccessPK = new MobileAccessPK();
        mobileAccessPK.setAccesToken(token);
        mobileAccessPK.setLogin(login);
        try {
            return this.find(mobileAccessPK);
        } catch (Exception ex) {
            error(ex);
            throw new GenericDAOException(ex);
        }
    }
    
    
}
