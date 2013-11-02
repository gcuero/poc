/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.core.common.service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author gcuero
 */
public interface GenericCatalogService<T, PK extends Serializable> {

    /**
     * Lista la colleccion de objetos de la base de datos
     *
     * @return
     */
    public List<T> findAll() throws GenericServiceException;

    /**
     * Guardar
     *
     * @param Producto
     */
    public PK save(T transientObject) throws GenericServiceException;

    /**
     * Elimina
     *
     * @param Producto
     */
    public void delete(T transientObject) throws GenericServiceException;

    /**
     * Actualiza la informacion
     *
     * @param Producto
     */
    public void update(T transientObject) throws GenericServiceException;

    /**
     * Busca el objeto por ID
     *
     * @param id
     * @return
     */
    public T find(PK id) throws GenericServiceException;
}
