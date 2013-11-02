package org.kudytech.confsistema.ws.domain;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.kudytech.ws.client.adapter.DateAdapter;

/**
 * <p>Clase Java para confSistema complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="confSistema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fechaModif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://ws.webservices.compras.adeamx.com/}confSistemaPK" minOccurs="0"/>
 *         &lt;element name="loginModif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorblob" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="valordate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="valornum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valorstr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confSistema", propOrder = {
    "descripcion",
    "estatus",
    "fechaModif",
    "id",
    "loginModif",
    "tipoValor",
    "valorblob",
    "valordate",
    "valornum",
    "valorstr"
})
public class ConfSistema {

    protected String descripcion;
    protected Boolean estatus;
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected Date fechaModif;
    protected ConfSistemaPK id;
    protected String loginModif;
    protected String tipoValor;
    protected byte[] valorblob;
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected Date valordate;
    protected Long valornum;
    protected String valorstr;

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
     * Obtiene el valor de la propiedad fechaModif.
     *
     * @return possible object is {@link Date }
     *
     */
    public Date getFechaModif() {
        return fechaModif;
    }

    /**
     * Define el valor de la propiedad fechaModif.
     *
     * @param value allowed object is {@link Date }
     *
     */
    public void setFechaModif(Date value) {
        this.fechaModif = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     *
     * @return possible object is {@link ConfSistemaPK }
     *
     */
    public ConfSistemaPK getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     * @param value allowed object is {@link ConfSistemaPK }
     *
     */
    public void setId(ConfSistemaPK value) {
        this.id = value;
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
     * Obtiene el valor de la propiedad tipoValor.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTipoValor() {
        return tipoValor;
    }

    /**
     * Define el valor de la propiedad tipoValor.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTipoValor(String value) {
        this.tipoValor = value;
    }

    /**
     * Obtiene el valor de la propiedad valorblob.
     *
     * @return possible object is byte[]
     */
    public byte[] getValorblob() {
        return valorblob;
    }

    /**
     * Define el valor de la propiedad valorblob.
     *
     * @param value allowed object is byte[]
     */
    public void setValorblob(byte[] value) {
        this.valorblob = value;
    }

    /**
     * Obtiene el valor de la propiedad valordate.
     *
     * @return possible object is {@link Date }
     *
     */
    public Date getValordate() {
        return valordate;
    }

    /**
     * Define el valor de la propiedad valordate.
     *
     * @param value allowed object is {@link Date }
     *
     */
    public void setValordate(Date value) {
        this.valordate = value;
    }

    /**
     * Obtiene el valor de la propiedad valornum.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getValornum() {
        return valornum;
    }

    /**
     * Define el valor de la propiedad valornum.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setValornum(Long value) {
        this.valornum = value;
    }

    /**
     * Obtiene el valor de la propiedad valorstr.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValorstr() {
        return valorstr;
    }

    /**
     * Define el valor de la propiedad valorstr.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValorstr(String value) {
        this.valorstr = value;
    }
}
