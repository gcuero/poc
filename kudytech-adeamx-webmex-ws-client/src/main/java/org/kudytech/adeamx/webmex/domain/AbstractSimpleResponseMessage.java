
package org.kudytech.adeamx.webmex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.kudytech.adeamx.webmex.client.MenuResponseMessage;
import org.kudytech.adeamx.webmex.client.UsuarioResponseMessage;


/**
 * <p>Clase Java para abstractSimpleResponseMessage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abstractSimpleResponseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeMessage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractSimpleResponseMessage", propOrder = {
    "codeMessage",
    "errorMessage"
})
@XmlSeeAlso({
    UsuarioResponseMessage.class,
    MenuResponseMessage.class
})
public class AbstractSimpleResponseMessage {

    protected int codeMessage;
    protected String errorMessage;

    /**
     * Obtiene el valor de la propiedad codeMessage.
     * 
     */
    public int getCodeMessage() {
        return codeMessage;
    }

    /**
     * Define el valor de la propiedad codeMessage.
     * 
     */
    public void setCodeMessage(int value) {
        this.codeMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
