package org.kudytech.compras.ws.confsistema.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.kudytech.confsistema.ws.domain.ConfSistema;

/**
 * <p>Clase Java para testConfSistema complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="testConfSistema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confSistema" type="{http://ws.webservices.compras.adeamx.com/}confSistema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testConfSistema", propOrder = {
    "confSistema"
})
public class TestConfSistema {

    protected ConfSistema confSistema;

    /**
     * Obtiene el valor de la propiedad confSistema.
     *
     * @return possible object is {@link ConfSistema }
     *
     */
    public ConfSistema getConfSistema() {
        return confSistema;
    }

    /**
     * Define el valor de la propiedad confSistema.
     *
     * @param value allowed object is {@link ConfSistema }
     *
     */
    public void setConfSistema(ConfSistema value) {
        this.confSistema = value;
    }
}
