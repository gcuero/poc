/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.ws.utils;

import org.kudytech.ws.response.AbstractSimpleResponseMessageHybrid;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybridList;

/**
 *
 * @author gcuero
 */
public class ResponseMessageUtils {

    private static final String MESSAGE_ERROR = "Error al realizar la petición. Código [%1$s] Mensaje : [%2$s].";

    public static Object processResponseMessageHybrid(
            AbstractSimpleResponseMessageHybrid responseMessageHybrid) throws Exception {
        if (responseMessageHybrid.getCodeMessage() == ResponseMessageConstants.SUCCES_MESSAGE) {
            return responseMessageHybrid.getObjectMessage();
        } else {
            String message = String.format(ResponseMessageUtils.MESSAGE_ERROR,
                    responseMessageHybrid.getCodeMessage(),
                    responseMessageHybrid.getErrorMessage());
            throw new RuntimeException(message);
        }
    }

    public static Object processResponseMessageHybrid(
            AbstractSimpleResponseMessageHybridList responseMessageHybridList)
            throws Exception {
        if (responseMessageHybridList.getCodeMessage() == ResponseMessageConstants.SUCCES_MESSAGE) {
            return responseMessageHybridList.getObjectMessage();
        } else {
            String message = String.format(ResponseMessageUtils.MESSAGE_ERROR,
                    responseMessageHybridList.getCodeMessage(),
                    responseMessageHybridList.getErrorMessage());
            throw new RuntimeException(message);
        }
    }
}
