/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.common.utils;

import java.util.List;
import org.kudytech.core.common.service.GenericServiceException;
import org.kudytech.dao.utils.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
@Service("queryParamsSetter")
public class QueryParamsSetter {

    private static final String PARAMETERS_LENGTH_INCOSISTENCE_MESSAGE =
            "La cantidad de valores de los parámetros no coinciden con los configurados "
            + "para [%1$s].";
    private static final String CONFPARMSNAME_NOT_FOUND_MESSAGE =
            "No esxiste una configuración de parámetros para [%1$s].";
    @Autowired
    QueryConfTemplate queryConfTemplate;

    public List<QueryParam> populateQueryParamList(String confParmsName, Object... parmsValues)
            throws GenericServiceException {
        List<QueryParam> queryParams =
                this.queryConfTemplate.getListParamTemplateByName(confParmsName);
        if (queryParams != null) {
            if (validateParamsLength(queryParams, parmsValues)) {
                for (int i = 0; i < parmsValues.length; i++) {
                    queryParams.get(i).setQueryParamValue(parmsValues[i]);
                }
            } else {
                throw new GenericServiceException(String.format(
                        QueryParamsSetter.PARAMETERS_LENGTH_INCOSISTENCE_MESSAGE,
                        confParmsName));
            }
        } else {
            throw new GenericServiceException(String.format(
                    QueryParamsSetter.CONFPARMSNAME_NOT_FOUND_MESSAGE, confParmsName));
        }
        return queryParams;
    }

    private boolean validateParamsLength(List<QueryParam> queryParams, Object[] args) {
        return queryParams.size() == args.length;
    }
}
