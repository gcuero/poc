/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.core.common.dao;

/**
 *
 * @author gcuero
 */
public class RestrictionModel<T> {

    private String propertyName;
    private String operator;
    private T objectValue;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public T getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(T objectValue) {
        this.objectValue = objectValue;
    }
}
