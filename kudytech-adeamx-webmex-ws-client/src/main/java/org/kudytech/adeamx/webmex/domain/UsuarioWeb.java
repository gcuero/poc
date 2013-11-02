
package org.kudytech.adeamx.webmex.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.kudytech.ws.client.adapter.DateAdapter;


/**
 * <p>Clase Java para usuarioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarioWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authoritys" type="{http://ws.webservices.compras.adeamx.com/}authority" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaalta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechabaja" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fecharevocado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="intentos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "usuarioWeb", propOrder = {
    "authoritys",
    "cliente",
    "email",
    "fechaalta",
    "fechabaja",
    "fecharevocado",
    "intentos",
    "login",
    "nombre",
    "password",
    "status"
})
public class UsuarioWeb {

    @XmlElement(nillable = true)
    protected List<Authority> authoritys;
    protected double cliente;
    protected String email;
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected Date fechaalta;
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected Date fechabaja;
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected Date fecharevocado;
    protected double intentos;
    protected String login;
    protected String nombre;
    protected String password;
    protected String status;

    /**
     * Gets the value of the authoritys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authoritys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthoritys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authority }
     * 
     * 
     */
    public List<Authority> getAuthoritys() {
        if (authoritys == null) {
            authoritys = new ArrayList<Authority>();
        }
        return this.authoritys;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     */
    public double getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     */
    public void setCliente(double value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaalta.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechaalta() {
        return fechaalta;
    }

    /**
     * Define el valor de la propiedad fechaalta.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechaalta(Date value) {
        this.fechaalta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechabaja.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechabaja() {
        return fechabaja;
    }

    /**
     * Define el valor de la propiedad fechabaja.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechabaja(Date value) {
        this.fechabaja = value;
    }

    /**
     * Obtiene el valor de la propiedad fecharevocado.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFecharevocado() {
        return fecharevocado;
    }

    /**
     * Define el valor de la propiedad fecharevocado.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFecharevocado(Date value) {
        this.fecharevocado = value;
    }

    /**
     * Obtiene el valor de la propiedad intentos.
     * 
     */
    public double getIntentos() {
        return intentos;
    }

    /**
     * Define el valor de la propiedad intentos.
     * 
     */
    public void setIntentos(double value) {
        this.intentos = value;
    }

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
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
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
