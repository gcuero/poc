package org.kudytech.workflow.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Clase Java para confModulo complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="confModulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fechaAlta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaModif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idaplicacion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idmodulo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="loginAlta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginModif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confModulo", propOrder = {
    "descripcion",
    "estatus",
    "fechaAlta",
    "fechaModif",
    "idaplicacion",
    "idmodulo",
    "loginAlta",
    "loginModif",
    "prefijo"
})
public class ConfModulo {

    protected String descripcion;
    protected Boolean estatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAlta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModif;
    protected Long idaplicacion;
    protected long idmodulo;
    protected String loginAlta;
    protected String loginModif;
    protected String prefijo;

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
     * Obtiene el valor de la propiedad idaplicacion.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getIdaplicacion() {
        return idaplicacion;
    }

    /**
     * Define el valor de la propiedad idaplicacion.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setIdaplicacion(Long value) {
        this.idaplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idmodulo.
     *
     */
    public long getIdmodulo() {
        return idmodulo;
    }

    /**
     * Define el valor de la propiedad idmodulo.
     *
     */
    public void setIdmodulo(long value) {
        this.idmodulo = value;
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
     * Obtiene el valor de la propiedad prefijo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * Define el valor de la propiedad prefijo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPrefijo(String value) {
        this.prefijo = value;
    }
}
