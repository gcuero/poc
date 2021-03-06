package org.kudytech.compras.ws.confsistema.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybrid;

/**
 * <p>Clase Java para getNumberValueByatCalogAndVariableResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="getNumberValueByatCalogAndVariableResponse">
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
@XmlType(name = "getNumberValueByatCalogAndVariableResponse", propOrder = {
    "_return"
})
public class GetNumberValueByatCalogAndVariableResponse {

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
