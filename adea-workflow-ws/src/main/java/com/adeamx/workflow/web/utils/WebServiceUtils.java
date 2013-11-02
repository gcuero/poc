/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.web.utils;

import com.adeamx.workflow.domain.AbstractSimpleResponseMessage;
import com.adeamx.workflow.domain.CodeMessageConstants;

/**
 *
 * @author gcuero
 */
public class WebServiceUtils {
    
    public static AbstractSimpleResponseMessage 
            getResponseMessageIfNull(Object objectMessage, 
            AbstractSimpleResponseMessage responseMessage){
        if(objectMessage == null){
            responseMessage.setCodeMessage(CodeMessageConstants.OBJECT_NOT_FOUND_CODE);
            if(responseMessage.getErrorMessage() == null){
                responseMessage.setErrorMessage(CodeMessageConstants.OBJECT_NOT_FOUND_MESSAGE);
            }
        } else {
            responseMessage.setCodeMessage(CodeMessageConstants.SUCCES_CODE);
        }
        return responseMessage;
    }
}
