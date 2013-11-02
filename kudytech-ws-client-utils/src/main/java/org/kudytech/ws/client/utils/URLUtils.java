/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.ws.client.utils;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.WebServiceException;

/**
 *
 * @author gcuero
 */
public class URLUtils {

    public static URL getURLFromString(String urlPath) throws MalformedURLException {
        try {
            return new URL(urlPath);
        } catch (MalformedURLException ex) {
            throw new WebServiceException(ex);
        }
    }
}
