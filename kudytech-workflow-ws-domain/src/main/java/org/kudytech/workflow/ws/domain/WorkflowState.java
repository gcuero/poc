package org.kudytech.workflow.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Clase Java para workflowState complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="workflowState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confColor" type="{http://ws.webservices.compras.adeamx.com/}confColor" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fechaAlta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaModif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idworkflowState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginAlta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginModif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflowState", propOrder = {
    "confColor",
    "description",
    "estatus",
    "fechaAlta",
    "fechaModif",
    "icon",
    "idworkflowState",
    "loginAlta",
    "loginModif"
})
public class WorkflowState {

    protected ConfColor confColor;
    protected String description;
    protected Boolean estatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAlta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModif;
    protected String icon;
    protected String idworkflowState;
    protected String loginAlta;
    protected String loginModif;

    /**
     * Obtiene el valor de la propiedad confColor.
     *
     * @return possible object is {@link ConfColor }
     *
     */
    public ConfColor getConfColor() {
        return confColor;
    }

    /**
     * Define el valor de la propiedad confColor.
     *
     * @param value allowed object is {@link ConfColor }
     *
     */
    public void setConfColor(ConfColor value) {
        this.confColor = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Obtiene el valor de la propiedad icon.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Define el valor de la propiedad icon.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Obtiene el valor de la propiedad idworkflowState.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdworkflowState() {
        return idworkflowState;
    }

    /**
     * Define el valor de la propiedad idworkflowState.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdworkflowState(String value) {
        this.idworkflowState = value;
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
}
