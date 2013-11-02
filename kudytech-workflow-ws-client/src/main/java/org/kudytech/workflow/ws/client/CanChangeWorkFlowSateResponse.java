package org.kudytech.workflow.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybrid;

/**
 * <p>Clase Java para canChangeWorkFlowSateResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="canChangeWorkFlowSateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.webservices.compras.adeamx.com/}abstractSimpleResponseMessageHybrid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "canChangeWorkFlowSateResponse", propOrder = {
    "_return"
})
public class CanChangeWorkFlowSateResponse {

    @XmlElement(name = "return")
    protected AbstractSimpleResponseMessageHybrid _return;

    /**
     * Obtiene el valor de la propiedad return.
     *
     * @return possible object is {@link AbstractSimpleResponseMessageHybrid }
     *
     */
    public AbstractSimpleResponseMessageHybrid getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     *
     * @param value allowed object is
     *     {@link AbstractSimpleResponseMessageHybrid }
     *
     */
    public void setReturn(AbstractSimpleResponseMessageHybrid value) {
        this._return = value;
    }
}
