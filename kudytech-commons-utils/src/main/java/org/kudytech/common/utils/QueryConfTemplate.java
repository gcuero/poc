/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.common.utils;

import java.util.List;
import java.util.Map;
import org.kudytech.dao.utils.QueryParam;

/**
 *
 * @author gcuero
 */
public class QueryConfTemplate {

    private Map<String, List<QueryParam>> queryParmsMap;
    
    public List<QueryParam> getListParamTemplateByName(String name){
        return this.queryParmsMap.get(name);
    }

    public Map<String, List<QueryParam>> getQueryParmsMap() {
        return queryParmsMap;
    }

    public void setQueryParmsMap(Map<String, List<QueryParam>> queryParmsMap) {
        this.queryParmsMap = queryParmsMap;
    }
}
