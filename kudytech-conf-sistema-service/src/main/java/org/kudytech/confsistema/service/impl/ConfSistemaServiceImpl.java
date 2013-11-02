/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.confsistema.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.kudytech.confsistema.dao.ConfSistemaDAO;
import org.kudytech.confsistema.model.ConfSistema;
import org.kudytech.confsistema.model.ConfSistemaPK;
import org.kudytech.confsistema.service.ConfSistemaService;
import org.kudytech.core.common.service.AbstractGenericService;
import org.kudytech.core.common.service.GenericServiceException;
import org.springframework.stereotype.Service;

/**
 *
 * @author gca
 */
@Service("confSistemaService")
public class ConfSistemaServiceImpl extends AbstractGenericService implements ConfSistemaService {

    public static final String STR_TYPE = "STR";
    public static final String NUM_TYPE = "NUM";
    public static final String DATE_TYPE = "DATE";
    public static final String BLOB_TYPE = "BLOB";
    private static final String TYPE_ERROR_MESSAGE =
            "El tipo del registro no correpsonde al registro solicitado.";
    private static final String CATALOG_NOT_FOUND_MESSAGE =
            "El catalogo no se encuentra registrado en la Base de datos.";
    @Resource
    ConfSistemaDAO confSistemaDAO;
    private static final String CATALOG_PROPERTY_NAME = "id.idvariable";

    @Override
    public List<ConfSistema> findByCatalog(String catalog) throws GenericServiceException {
        try {
            return this.confSistemaDAO.findByProperty(ConfSistemaServiceImpl.CATALOG_PROPERTY_NAME, catalog);
        } catch (Exception ex) {
            error(ex);
            throw getGenericException(ex);
        }
    }

    @Override
    public ConfSistema findByCatalogAndVariable(String catalog, String variable) throws GenericServiceException {
        try {
            ConfSistemaPK confSistemaPK = new ConfSistemaPK();
            confSistemaPK.setIdvariable(catalog);
            confSistemaPK.setVariable(variable);
            return this.confSistemaDAO.find(confSistemaPK);
        } catch (Exception ex) {
            error(ex);
            throw getGenericException(ex);
        }
    }

    public String getStringValueByCatalogAndVariable(String catalog,
            String variable) throws GenericServiceException {
        ConfSistema confSistema = this.findByCatalogAndVariable(catalog, variable);
        if (ConfSistemaServiceImpl.STR_TYPE.equals(
                confSistema.getTipoValor())) {
            return confSistema.getValorstr();
        } else {
            throw new GenericServiceException(
                    ConfSistemaServiceImpl.TYPE_ERROR_MESSAGE);
        }
    }

    public Long getNumberValueByatCalogAndVariable(String catalog, String variable)
            throws GenericServiceException {
        ConfSistema confSistema = this.findByCatalogAndVariable(catalog, variable);
        if (ConfSistemaServiceImpl.NUM_TYPE.equals(
                confSistema.getTipoValor())) {
            return confSistema.getValornum();
        } else {
            throw new GenericServiceException(
                    ConfSistemaServiceImpl.TYPE_ERROR_MESSAGE);
        }
    }

    public Date getDateValueByatCalogAndVariable(String catalog, String variable)
            throws GenericServiceException {
        ConfSistema confSistema = this.findByCatalogAndVariable(catalog, variable);
        if (ConfSistemaServiceImpl.DATE_TYPE.equals(
                confSistema.getTipoValor())) {
            return confSistema.getValordate();
        } else {
            throw new GenericServiceException(
                    ConfSistemaServiceImpl.TYPE_ERROR_MESSAGE);
        }
    }

    public byte[] getBlobValueByatCalogAndVariable(String catalog, String variable)
            throws GenericServiceException {
        ConfSistema confSistema = this.findByCatalogAndVariable(catalog, variable);
        if (ConfSistemaServiceImpl.BLOB_TYPE.equals(
                confSistema.getTipoValor())) {
            return confSistema.getValorblob();
        } else {
            throw new GenericServiceException(
                    ConfSistemaServiceImpl.TYPE_ERROR_MESSAGE);
        }
    }

    public Map<String, String> getMapStringByCatalog(String catalog) throws GenericServiceException {
        List<ConfSistema> confSistemas = this.findByCatalog(catalog);
        if (confSistemas == null) {
            throw new GenericServiceException(
                    ConfSistemaServiceImpl.CATALOG_NOT_FOUND_MESSAGE);
        }
        Map<String, String> toReturn = new HashMap<String, String>();
        for (ConfSistema confSistema : confSistemas) {
            if (ConfSistemaServiceImpl.STR_TYPE.equals(
                    confSistema.getTipoValor())) {
                toReturn.put(confSistema.getId().getVariable(), confSistema.getValorstr());
            }
        }
        return toReturn;
    }
}
