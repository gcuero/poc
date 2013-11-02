/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.dao.utils;

/**
 *
 * @author gcuero
 */
public class QueryParam<T> {

    private String queryParamName;
    private T queryParamValue;

    public String getQueryParamName() {
        return queryParamName;
    }

    public void setQueryParamName(String queryParamName) {
        this.queryParamName = queryParamName;
    }

    public T getQueryParamValue() {
        return queryParamValue;
    }

    public void setQueryParamValue(T queryParamValue) {
        this.queryParamValue = queryParamValue;
    }
}
