package org.kudytech.workflow.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Clase Java para confObjeto complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="confObjeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clazz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confModulo" type="{http://ws.webservices.compras.adeamx.com/}confModulo" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fechaAlta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaModif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idinitialState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idobjeto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idreferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginAlta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginModif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tablaRelacionada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoObjeto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workflow" type="{http://ws.webservices.compras.adeamx.com/}workflow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confObjeto", propOrder = {
    "clazz",
    "confModulo",
    "descripcion",
    "estatus",
    "fechaAlta",
    "fechaModif",
    "idinitialState",
    "idobjeto",
    "idreferencia",
    "loginAlta",
    "loginModif",
    "nombre",
    "tablaRelacionada",
    "tipoObjeto",
    "workflow"
})
public class ConfObjeto {

    protected String clazz;
    protected ConfModulo confModulo;
    protected String descripcion;
    protected Boolean estatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAlta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModif;
    protected String idinitialState;
    protected long idobjeto;
    protected String idreferencia;
    protected String loginAlta;
    protected String loginModif;
    protected String nombre;
    protected String tablaRelacionada;
    protected Boolean tipoObjeto;
    protected Workflow workflow;

    /**
     * Obtiene el valor de la propiedad clazz.
     *
     * @return possible object is {@link String }
     *
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Define el valor de la propiedad clazz.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Obtiene el valor de la propiedad confModulo.
     *
     * @return possible object is {@link ConfModulo }
     *
     */
    public ConfModulo getConfModulo() {
        return confModulo;
    }

    /**
     * Define el valor de la propiedad confModulo.
     *
     * @param value allowed object is {@link ConfModulo }
     *
     */
    public void setConfModulo(ConfModulo value) {
        this.confModulo = value;
    }

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
     * Obtiene el valor de la propiedad idinitialState.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdinitialState() {
        return idinitialState;
    }

    /**
     * Define el valor de la propiedad idinitialState.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdinitialState(String value) {
        this.idinitialState = value;
    }

    /**
     * Obtiene el valor de la propiedad idobjeto.
     *
     */
    public long getIdobjeto() {
        return idobjeto;
    }

    /**
     * Define el valor de la propiedad idobjeto.
     *
     */
    public void setIdobjeto(long value) {
        this.idobjeto = value;
    }

    /**
     * Obtiene el valor de la propiedad idreferencia.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdreferencia() {
        return idreferencia;
    }

    /**
     * Define el valor de la propiedad idreferencia.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdreferencia(String value) {
        this.idreferencia = value;
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
     * Obtiene el valor de la propiedad nombre.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tablaRelacionada.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTablaRelacionada() {
        return tablaRelacionada;
    }

    /**
     * Define el valor de la propiedad tablaRelacionada.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTablaRelacionada(String value) {
        this.tablaRelacionada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoObjeto.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isTipoObjeto() {
        return tipoObjeto;
    }

    /**
     * Define el valor de la propiedad tipoObjeto.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setTipoObjeto(Boolean value) {
        this.tipoObjeto = value;
    }

    /**
     * Obtiene el valor de la propiedad workflow.
     *
     * @return possible object is {@link Workflow }
     *
     */
    public Workflow getWorkflow() {
        return workflow;
    }

    /**
     * Define el valor de la propiedad workflow.
     *
     * @param value allowed object is {@link Workflow }
     *
     */
    public void setWorkflow(Workflow value) {
        this.workflow = value;
    }
}
