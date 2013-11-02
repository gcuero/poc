/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.ws.client.utils;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;

/**
 *
 * @author gcuero
 */
public class AbstractWebServiceProvider extends Service {

    private String urlPath;

    public static URL getURL(String urlPath) {
        try {
            return URLUtils.getURLFromString(urlPath);
        } catch (MalformedURLException ex) {
            throw new WebServiceException(ex);
        }
    }

    public AbstractWebServiceProvider(URL wsdlDocumentLocation, QName serviceName) {
        super(wsdlDocumentLocation, serviceName);
    }

    public AbstractWebServiceProvider(String wsdlDocumentLocationPath, QName serviceName) {
        super(AbstractWebServiceProvider.getURL(wsdlDocumentLocationPath), serviceName);
        this.urlPath = wsdlDocumentLocationPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getUrlPath() {
        return urlPath;
    }
}
