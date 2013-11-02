
package org.kudytech.adeamx.webmex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para menuWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="menuWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAplicacion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="idMenuParent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="idmenu" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onClick" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="separator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menuWeb", propOrder = {
    "descripcion",
    "icono",
    "idAplicacion",
    "idMenuParent",
    "idmenu",
    "nombre",
    "onClick",
    "ruta",
    "separator",
    "status"
})
public class MenuWeb {

    protected String descripcion;
    protected String icono;
    protected double idAplicacion;
    protected double idMenuParent;
    protected double idmenu;
    protected String nombre;
    protected String onClick;
    protected String ruta;
    protected String separator;
    protected String status;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad icono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcono() {
        return icono;
    }

    /**
     * Define el valor de la propiedad icono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcono(String value) {
        this.icono = value;
    }

    /**
     * Obtiene el valor de la propiedad idAplicacion.
     * 
     */
    public double getIdAplicacion() {
        return idAplicacion;
    }

    /**
     * Define el valor de la propiedad idAplicacion.
     * 
     */
    public void setIdAplicacion(double value) {
        this.idAplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idMenuParent.
     * 
     */
    public double getIdMenuParent() {
        return idMenuParent;
    }

    /**
     * Define el valor de la propiedad idMenuParent.
     * 
     */
    public void setIdMenuParent(double value) {
        this.idMenuParent = value;
    }

    /**
     * Obtiene el valor de la propiedad idmenu.
     * 
     */
    public double getIdmenu() {
        return idmenu;
    }

    /**
     * Define el valor de la propiedad idmenu.
     * 
     */
    public void setIdmenu(double value) {
        this.idmenu = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad onClick.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnClick() {
        return onClick;
    }

    /**
     * Define el valor de la propiedad onClick.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnClick(String value) {
        this.onClick = value;
    }

    /**
     * Obtiene el valor de la propiedad ruta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Define el valor de la propiedad ruta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuta(String value) {
        this.ruta = value;
    }

    /**
     * Obtiene el valor de la propiedad separator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * Define el valor de la propiedad separator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparator(String value) {
        this.separator = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
