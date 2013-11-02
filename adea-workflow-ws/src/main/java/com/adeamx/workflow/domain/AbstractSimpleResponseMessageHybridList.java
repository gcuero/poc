/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author gcuero
 */
public class AbstractSimpleResponseMessageHybridList<T> {

    private int codeMessage;
    private String errorMessage;
    private List<T> objectMessage;

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
    
    

    public List<T> getObjectMessage() {
        return objectMessage;
    }

    public void setObjectMessage(List<T> objectMessage) {
        this.objectMessage = objectMessage;
    }
    
}
