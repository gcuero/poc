/*
 * COPYRIGHT. Mariela Juárez Zuñiga 2012. Todos los derechos reservados.
 * 
 * Este software es sólo para ser utilizado para el propósito para el que ha sido
 * proporcionado. Ninguna parte de este se ha de reproducir, desensamblar, transmitir,
 * almacenar en algún sistema de recuperación, ni ser interpretado por ningún lenguaje
 * humano o de computadora, en cualquier forma o para cualquier otro propósito sin el
 * consentimiento previo por escrito de M. C. Mariela Juárez Zuñiga.
 */
package com.adea.controller;

import com.adea.controller.utils.JsfUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.kudytech.ws.client.catalog.CatalogGenericService;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;

/**
 *
 * @param <E>
 * @author gca
 */
public abstract class AbstractGenericController<E, K> extends AbstractSessionController
        implements Controller<E> {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private static final String EMPTY = "";
    List<E> list;
    private E current;

    public abstract Class<E> getEntityClass();

    public abstract CatalogGenericService<E, K> getCatalogGenericService();

    @Override
    public List<E> getList() {
        try {
            final List<E> list2return = this.getCatalogGenericService().list();
            return list2return;
        } catch (Exception ex) {
            LOGGER.error(ex);
            return null;
        }
    }

    @Override
    public E getSelected() {
        if (current == null) {
            this.prepareCreate();
        }
        return current;
    }

    @Override
    public void setSelected(E current) {
        this.current = current;
    }

    @Override
    public void prepareCreate() {
        current = null;
        try {
            current = this.getEntityClass().newInstance();
        } catch (InstantiationException ex) {
            this.error(AbstractGenericController.EMPTY, ex);
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            this.error(AbstractGenericController.EMPTY, ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public E getCreate() {
        try {
            prepareCreate();
            return current;
        } catch (Exception e) {
            current = null;
            return current;
        }
    }

    @Override
    public void onRowSelect(SelectEvent event) {
        current = (E) event.getObject();
    }

    @Override
    public void rowEditListener(RowEditEvent event) {
        try {
            final E buffer = (E) event.getObject();
            this.getCatalogGenericService().update(buffer);
        } catch (Exception ex) {
            LOGGER.error(AbstractGenericController.EMPTY, ex);
        }
    }

    @Override
    public void removeSelected() {
        try {
            this.getCatalogGenericService().remove(current);
        } catch (Exception ex) {
            LOGGER.fatal(AbstractGenericController.EMPTY, ex);
        }
    }

    /**
     * Inserta un usuaario
     *
     * @param actionEvent
     */
    public void insert(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito", "Registro creado exitósamente.");
        try {
            this.getCatalogGenericService().save(current);
        } catch (Exception e) {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e.getMessage());
        }
        context.addMessage(null, msg);
    }

    public void update(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito", "Registro actualizado exitósamente.");
        try {
            this.getCatalogGenericService().update(current);
        } catch (Exception e) {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e.getMessage());
        }
        context.addMessage(null, msg);
    }

    public void remove(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito", "Registro eliminado exitósamente.");
        try {
            this.getCatalogGenericService().remove(current);
        } catch (Exception e) {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e.getMessage());
        }
        context.addMessage(null, msg);
    }

    @Override
    public List<E> getSearchList() {
        return this.list;
    }

    public E getCurrent() {
        return current;
    }

    public void setCurrent(E current) {
        this.current = current;
    }

    /**
     *
     * <p> <b> Log a debug step. </b> </p>
     *
     * @param message
     */
    protected final void debug(final String message) {
        if (this.LOGGER.isDebugEnabled()) {
            this.LOGGER.debug("[" + getClass().getSimpleName() + "] :: " + message);
        }
    }

    /**
     *
     * <p> <b> Log an info step. </b> </p>
     *
     * @param message
     */
    protected final void info(final String message) {
        if (this.LOGGER.isInfoEnabled()) {
            this.LOGGER.info("[" + getClass().getSimpleName() + "] :: " + message);
        }
    }

    /**
     *
     * <p> <b> Log an error step. </b> </p>
     *
     * @param message
     * @param error
     */
    protected final void error(final String message, final Throwable error) {
        this.LOGGER.error("[" + getClass().getSimpleName() + "] :: " + message, error);
    }

    @Override
    public SelectItem[] getItemsAvailableSelectOne() {
        try {
            return JsfUtil.getSelectItems(this.getCatalogGenericService().list(), true);
        } catch (Exception ex) {
            LOGGER.error(EMPTY, ex);
            return null;
        }
    }

    @Override
    public List<E> autocomplete(String query) {
        List<E> suggestions = new ArrayList<E>();
        List<E> elementos = new ArrayList<E>();
        try {
            elementos = this.getCatalogGenericService().list();
        } catch (Exception ex) {
            LOGGER.error(AbstractGenericController.EMPTY, ex);
        }
        for (E p : elementos) {
            if (p.toString().startsWith(query)) {
                suggestions.add(p);
            }
        }
        return suggestions;
    }
}
