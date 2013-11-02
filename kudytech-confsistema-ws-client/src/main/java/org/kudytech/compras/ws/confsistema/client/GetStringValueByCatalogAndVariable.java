package org.kudytech.compras.ws.confsistema.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para getStringValueByCatalogAndVariable complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="getStringValueByCatalogAndVariable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getStringValueByCatalogAndVariable", propOrder = {
    "catalogo",
    "variable"
})
public class GetStringValueByCatalogAndVariable {

    protected String catalogo;
    protected String variable;

    /**
     * Obtiene el valor de la propiedad catalogo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCatalogo() {
        return catalogo;
    }

    /**
     * Define el valor de la propiedad catalogo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCatalogo(String value) {
        this.catalogo = value;
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
