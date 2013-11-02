/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.ws.client.utils;

import java.net.URL;

/**
 *
 * @author gcuero
 */
public interface URLProvider {

    /**
     *
     * @param urlPath
     * @return
     * @throws Exception
     */
    URL getURL(String urlPath) throws Exception;
}
