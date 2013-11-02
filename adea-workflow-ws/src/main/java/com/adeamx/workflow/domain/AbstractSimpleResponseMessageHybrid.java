/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain;

/**
 *
 * @author gcuero
 */
public class AbstractSimpleResponseMessageHybrid<T> {

    private int codeMessage;
    private String errorMessage;
    private T objectMessage;

    public int getCodeMessage() {
        return codeMessage;
    }

    public void setCodeMessage(int codeMessage) {
        this.codeMessage = codeMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    

    public T getObjectMessage() {
        return objectMessage;
    }

    public void setObjectMessage(T objectMessage) {
        this.objectMessage = objectMessage;
    }
    
}
