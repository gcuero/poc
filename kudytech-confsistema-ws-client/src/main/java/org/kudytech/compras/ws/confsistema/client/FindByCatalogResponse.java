package org.kudytech.compras.ws.confsistema.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.kudytech.ws.response.AbstractSimpleResponseMessageHybridList;

/**
 * <p>Clase Java para findByCatalogResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="findByCatalogResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.webservices.compras.adeamx.com/}abstractSimpleResponseMessageHybridList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findByCatalogResponse", propOrder = {
    "_return"
})
public class FindByCatalogResponse {

    @XmlElement(name = "return")
    protected AbstractSimpleResponseMessageHybridList _return;

    /**
     * Obtiene el valor de la propiedad return.
     *
     * @return possible object is
     *     {@link AbstractSimpleResponseMessageHybridList }
     *
     */
    public AbstractSimpleResponseMessageHybridList getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     *
     * @param value allowed object is
     *     {@link AbstractSimpleResponseMessageHybridList }
     *
     */
    public void setReturn(AbstractSimpleResponseMessageHybridList value) {
        this._return = value;
    }
}
