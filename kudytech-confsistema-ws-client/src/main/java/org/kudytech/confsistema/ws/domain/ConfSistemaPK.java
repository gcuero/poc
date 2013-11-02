package org.kudytech.confsistema.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para confSistemaPK complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="confSistemaPK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idvariable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confSistemaPK", propOrder = {
    "idvariable",
    "variable"
})
public class ConfSistemaPK {

    protected String idvariable;
    protected String variable;

    /**
     * Obtiene el valor de la propiedad idvariable.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdvariable() {
        return idvariable;
    }

    /**
     * Define el valor de la propiedad idvariable.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdvariable(String value) {
        this.idvariable = value;
    }

    /**
     * Obtiene el valor de la propiedad variable.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVariable() {
        return variable;
    }

    /**
     * Define el valor de la propiedad variable.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVariable(String value) {
        this.variable = value;
    }
}
