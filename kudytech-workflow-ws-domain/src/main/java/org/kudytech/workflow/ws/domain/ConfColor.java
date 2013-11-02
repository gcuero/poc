package org.kudytech.workflow.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Clase Java para confColor complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="confColor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fechaAlta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaModif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idcolor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="loginAlta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginModif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="setcolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confColor", propOrder = {
    "descripcion",
    "estatus",
    "fechaAlta",
    "fechaModif",
    "idcolor",
    "loginAlta",
    "loginModif",
    "setcolor"
})
public class ConfColor {

    protected String descripcion;
    protected Boolean estatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAlta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModif;
    protected long idcolor;
    protected String loginAlta;
    protected String loginModif;
    protected String setcolor;

    /**
     * Obtiene el valor de la propiedad descripcion.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad estatus.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isEstatus() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setEstatus(Boolean value) {
        this.estatus = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAlta.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Define el valor de la propiedad fechaAlta.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaAlta(XMLGregorianCalendar value) {
        this.fechaAlta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaModif.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaModif() {
        return fechaModif;
    }

    /**
     * Define el valor de la propiedad fechaModif.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaModif(XMLGregorianCalendar value) {
        this.fechaModif = value;
    }

    /**
     * Obtiene el valor de la propiedad idcolor.
     *
     */
    public long getIdcolor() {
        return idcolor;
    }

    /**
     * Define el valor de la propiedad idcolor.
     *
     */
    public void setIdcolor(long value) {
        this.idcolor = value;
    }

    /**
     * Obtiene el valor de la propiedad loginAlta.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLoginAlta() {
        return loginAlta;
    }

    /**
     * Define el valor de la propiedad loginAlta.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLoginAlta(String value) {
        this.loginAlta = value;
    }

    /**
     * Obtiene el valor de la propiedad loginModif.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLoginModif() {
        return loginModif;
    }

    /**
     * Define el valor de la propiedad loginModif.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLoginModif(String value) {
        this.loginModif = value;
    }

    /**
     * Obtiene el valor de la propiedad setcolor.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSetcolor() {
        return setcolor;
    }

    /**
     * Define el valor de la propiedad setcolor.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSetcolor(String value) {
        this.setcolor = value;
    }
}
