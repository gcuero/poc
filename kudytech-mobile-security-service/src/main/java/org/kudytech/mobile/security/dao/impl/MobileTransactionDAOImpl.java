/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.mobile.security.dao.impl;

import org.kudytech.core.common.dao.impl.GenericDAOImpl;
import org.kudytech.mobile.security.dao.MobileTransactionDAO;
import org.kudytech.mobile.security.model.MobileTransaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gcuero
 */
@Repository("mobileTransactionDAO")
public class MobileTransactionDAOImpl extends GenericDAOImpl<MobileTransaction,Long> implements MobileTransactionDAO{
    
}
