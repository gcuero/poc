/**
 *
 */
package org.kudytech.core.common.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.criterion.DetachedCriteria;
import org.kudytech.core.common.model.PaginationRequest;
import org.kudytech.core.common.model.PaginationResponse;

/**
 * @author ERNESTO
 *
 */
public interface GenericDAO<T, PK extends Serializable> {

    /**
     * Lista todos los producto de la base de datos y esto lo hace mediante
     * paginacion
     *
     * @param batchsize
     * @param firstResult
     * @return
     */
    public List<T> findAll(int batchsize, int firstResult);

    /**
     * Lista la colleccion de objetos de la base de datos
     *
     * @return
     */
    public List<T> findAll();
    
    /**
     * Lista la colleccion de objetos de la base de datos
     *
     * @return
     */
    public List<T> findAllByPageAndNumRows(Query query, int page, int numRows);

    /**
     * Guardar
     *
     * @param Producto
     */
    public PK save(T transientObject) throws Exception;

    /**
     * Elimina
     *
     * @param Producto
     */
    public void remove(T transientObject) throws Exception;

    /**
     * Actualiza la informacion
     *
     * @param Producto
     */
    public void update(T transientObject) throws Exception;

    /**
     * Busca el objeto por ID
     *
     * @param id
     * @return
     */
    public T find(PK id) throws Exception;

    /**
     * Busca el objeto por ID
     *
     * @param id
     * @return
     */
    public List<T> findByProperty(String property, Object obj) throws Exception;
    
    /**
     *
     * @param restrictionModels
     * @return
     * @throws Exception
     */
    List<T> findByRestrictionList(List<RestrictionModel> restrictionModels)
            throws Exception;

    
    /**
     *
     * @param restrictionModels
     * @return
     * @throws Exception
     */
    T findUniqueResultByRestriction(List<RestrictionModel> restrictionModels)
            throws Exception;
    /**
     *
     * @param paginationRequest
     * @param hql
     * @param values
     * @return
     */
    public PaginationResponse extraeDatosXHQL(PaginationRequest paginationRequest, 
            String hql, Object... values);

    /**
     *
     * @param paginationRequest
     * @param detachedCriteria
     * @return
     */
    public PaginationResponse extraeDatosXCriteria(PaginationRequest paginationRequest, 
            DetachedCriteria detachedCriteria);
    
    /**
     *
     * @param query
     * @return
     * @throws GenericDAOException
     */
    public Integer getCount(Query query) throws Exception;
}
