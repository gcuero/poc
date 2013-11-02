/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adea.controller;

import java.util.List;
import javax.faces.model.SelectItem;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author gcuero
 */
public interface Controller<E> {

    public List<E> getList();

    public List<E> getSearchList();

    public E getSelected();

    public void setSelected(E current);

    public void prepareCreate();

//    public String create();

    public E getCreate();

    public void onRowSelect(SelectEvent event);

    public void rowEditListener(RowEditEvent event);

    public void removeSelected();

    public SelectItem[] getItemsAvailableSelectOne();

    public List<E> autocomplete(String query);
}
