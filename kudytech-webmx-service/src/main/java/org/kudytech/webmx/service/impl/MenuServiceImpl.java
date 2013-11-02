/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.webmx.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.kudytech.adeamx.mexweb.model.MenuWebmx;
import org.kudytech.core.common.dao.GenericDAOException;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.webmx.dao.MenuDAO;
import org.kudytech.webmx.service.MenuService;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Resource
    MenuDAO menuDAO;

    public List<MenuWebmx> getApplicationMenu(String login, int idAplicacion)
            throws GenericServiceException {
        try {
            return this.menuDAO.getApplicationMenu(login, idAplicacion);
        } catch (GenericDAOException ex) {
            Logger.getLogger(MenuServiceImpl.class.getName()).log(Level.ERROR, null, ex);
            throw new GenericServiceException(ex);
        }
    }

    public List<MenuWebmx> getApplicationSubMenu(double idParent, String login,
            int idAplicacion) throws GenericServiceException {
        try {
            return this.menuDAO.getApplicationSubMenu(idParent, login, idAplicacion);
        } catch (GenericDAOException ex) {
            Logger.getLogger(MenuServiceImpl.class.getName()).log(Level.ERROR, null, ex);
            throw new GenericServiceException(ex);
        }
    }
}
