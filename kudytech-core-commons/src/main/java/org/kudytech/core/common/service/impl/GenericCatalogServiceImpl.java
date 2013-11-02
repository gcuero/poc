/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.core.common.service.impl;

import java.io.Serializable;
import java.util.List;
import org.kudytech.core.common.dao.GenericDAO;
import org.kudytech.core.common.service.AbstractGenericService;
import org.kudytech.core.common.service.GenericCatalogService;
import org.kudytech.core.common.service.GenericServiceException;

/**
 *
 * @author gcuero
 */
public abstract class GenericCatalogServiceImpl<T, PK extends Serializable>
        extends AbstractGenericService
        implements GenericCatalogService<T, PK> {

    GenericDAO<T, PK> genericDAO;

    /**
     *
     * @param genericDAO
     */
    public void setGenericDAO(GenericDAO<T, PK> genericDAO) {
        this.genericDAO = genericDAO;
    }

    /**
     * Lista la colleccion de objetos de la base de datos
     *
     * @return
     */
    public List<T> findAll() throws GenericServiceException {
        try {
            List findAll = this.genericDAO.findAll();
            return findAll;
        } catch (Exception e) {
            error(e);
            throw new GenericServiceException(e);
        }

    }

    /**
     * Guardar
     *
     * @param Producto
     */
    public PK save(T transientObject) throws GenericServiceException {
        try {
            return this.genericDAO.save(transientObject);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    /**
     * Elimina
     *
     * @param Producto
     */
    public void delete(T transientObject) throws GenericServiceException {
        try {
            this.genericDAO.remove(transientObject);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }

    /**
     * Actualiza la informacion
     *
     * @param Producto
     */
    public void update(T transientObject) throws GenericServiceException {
        try {
            this.genericDAO.update(transientObject);
        } catch (Exception ex) {
            error(ex);
        }
    }

    /**
     * Busca el objeto por ID
     *
     * @param id
     * @return
     */
    public T find(PK id) throws GenericServiceException {
        try {
            return this.genericDAO.find(id);
        } catch (Exception ex) {
            error(ex);
            throw new GenericServiceException(ex);
        }
    }
}
