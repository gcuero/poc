package org.kudytech.compras.ws.confsistema.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.kudytech.confsistema.ws.domain.ConfSistema;

/**
 * <p>Clase Java para testConfSistemaResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="testConfSistemaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.webservices.compras.adeamx.com/}confSistema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testConfSistemaResponse", propOrder = {
    "_return"
})
public class TestConfSistemaResponse {

    @XmlElement(name = "return")
    protected ConfSistema _return;

    /**
     * Obtiene el valor de la propiedad return.
     *
     * @return possible object is {@link ConfSistema }
     *
     */
    public ConfSistema getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     *
     * @param value allowed object is {@link ConfSistema }
     *
     */
    public void setReturn(ConfSistema value) {
        this._return = value;
    }
}
