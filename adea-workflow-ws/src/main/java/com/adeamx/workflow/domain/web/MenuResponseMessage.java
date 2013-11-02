/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.web;

import com.adeamx.workflow.domain.AbstractSimpleResponseMessage;
import java.util.List;

/**
 *
 * @author gcuero
 */
public class MenuResponseMessage extends AbstractSimpleResponseMessage {

    private List<MenuWeb> applicationMenu;

    public List<MenuWeb> getApplicationMenu() {
        return applicationMenu;
    }

    public void setApplicationMenu(List<MenuWeb> applicationMenu) {
        this.applicationMenu = applicationMenu;
    }
}
