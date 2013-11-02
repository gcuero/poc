/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.web;

import com.adeamx.workflow.domain.AbstractSimpleResponseMessage;
import java.util.List;

/**
 *
 * @author jaymzhck
 */
public class ObjectListResponseMessage<T> extends AbstractSimpleResponseMessage{
    
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    
}
