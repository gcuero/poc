/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.confsistema.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.kudytech.confsistema.model.ConfSistema;
import org.kudytech.core.common.service.GenericServiceException;

/**
 *
 * @author gcuero
 */
public interface ConfSistemaService {

    /**
     * Recupera una lista de objetos de configuracion de sistema en base al
     * catalogo
     *
     * @param catalog
     * @return
     */
    List<ConfSistema> findByCatalog(String catalog) throws GenericServiceException;

    /**
     * *
     * Recupera el objeto de configuracion de systema en base al catalogo y
     * variable a resolver
     *
     * @param catalog
     * @param variable
     * @return ConfSistema
     */
    ConfSistema findByCatalogAndVariable(String catalog, String variable) throws GenericServiceException;

    /**
     *
     * @param catalog
     * @param variable
     * @return
     * @throws GenericServiceException
     */
    String getStringValueByCatalogAndVariable(String catalog, String variable) throws GenericServiceException;

    /**
     *
     * @param catalog
     * @param variable
     * @return
     * @throws GenericServiceException
     */
    Long getNumberValueByatCalogAndVariable(String catalog, String variable) throws GenericServiceException;

    /**
     *
     * @param catalog
     * @param variable
     * @return
     * @throws GenericServiceException
     */
    Date getDateValueByatCalogAndVariable(String catalog, String variable) throws GenericServiceException;

    /**
     *
     * @param catalog
     * @param variable
     * @return
     * @throws GenericServiceException
     */
    byte[] getBlobValueByatCalogAndVariable(String catalog, String variable) throws GenericServiceException;

    /**
     *
     * @param catalog
     * @return
     * @throws GenericServiceException
     */
    Map<String, String> getMapStringByCatalog(String catalog) throws GenericServiceException;
}
