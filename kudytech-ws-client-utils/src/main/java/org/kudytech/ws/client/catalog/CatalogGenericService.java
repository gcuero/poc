/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.ws.client.catalog;

import java.util.List;

/**
 *
 * @author gcuero
 */
public interface CatalogGenericService<D, K> {

    K save(D domain) throws Exception;

    void update(D domain) throws Exception;

    void remove(D domain) throws Exception;

    List<D> list() throws Exception;

    D getById(K idDomain) throws Exception;
}
