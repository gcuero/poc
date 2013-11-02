/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.compras.ws.service;

import java.util.Date;
import java.util.List;
import org.kudytech.confsistema.ws.domain.ConfSistema;

/**
 *
 * @author Erika
 */
public interface ConfSistemaService {
    /**
     * Recupera una lista de objetos de configuracion de sistema en base al
     * catalogo
     *
     * @param catalog
     * @return
     */
    List<ConfSistema> findByCatalog(String catalog) throws Exception;

    /**
     * *
     * Recupera el objeto de configuracion de systema en base al catalogo y
     * variable a resolver
     *
     * @param catalog
     * @param variable
     * @return ConfSistema
     */
    ConfSistema findByCatalogAndVariable(String catalog, String variable) throws Exception;

    /**
     *
     * @param catalog
     * @param variable
     * @return
     * @throws Exception
     */
    String getStringValueByCatalogAndVariable(String catalog, String variable) throws Exception;

    /**
     *
     * @param catalog
     * @param variable
     * @return
     * @throws Exception
     */
    Long getNumberValueByCatalogAndVariable(String catalog, String variable) throws Exception;

    /**
     *
     * @param catalog
     * @param variable
     * @return
     * @throws Exception
     */
    Date getDateValueByatCalogAndVariable(String catalog, String variable) throws Exception;

    /**
     *
     * @param catalog
     * @param variable
     * @return
     * @throws Exception
     */
    byte[] getBlobValueByatCalogAndVariable(String catalog, String variable) throws Exception;

}
