
package org.kudytech.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractSimpleResponseMessageHybrid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractSimpleResponseMessageHybrid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeMessage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectMessage" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractSimpleResponseMessageHybrid", propOrder = {
    "codeMessage",
    "errorMessage",
    "objectMessage"
})
public class AbstractSimpleResponseMessageHybrid {

    protected int codeMessage;
    protected String errorMessage;
    protected Object objectMessage;

    /**
     * Gets the value of the codeMessage property.
     * 
     */
    public int getCodeMessage() {
        return codeMessage;
    }

    /**
     * Sets the value of the codeMessage property.
     * 
     */
    public void setCodeMessage(int value) {
        this.codeMessage = value;
    }

    /**
     * Gets the value of the errorMessage property.
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
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the objectMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getObjectMessage() {
        return objectMessage;
    }

    /**
     * Sets the value of the objectMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setObjectMessage(Object value) {
        this.objectMessage = value;
    }

}
