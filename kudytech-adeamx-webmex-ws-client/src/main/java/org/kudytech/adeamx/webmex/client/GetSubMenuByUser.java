
package org.kudytech.adeamx.webmex.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getSubMenuByUser complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getSubMenuByUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAplicacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idParent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubMenuByUser", propOrder = {
    "login",
    "idAplicacion",
    "idParent"
})
public class GetSubMenuByUser {

    protected String login;
    protected int idAplicacion;
    protected double idParent;

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
     * Obtiene el valor de la propiedad idAplicacion.
     * 
     */
    public int getIdAplicacion() {
        return idAplicacion;
    }

    /**
     * Define el valor de la propiedad idAplicacion.
     * 
     */
    public void setIdAplicacion(int value) {
        this.idAplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idParent.
     * 
     */
    public double getIdParent() {
        return idParent;
    }

    /**
     * Define el valor de la propiedad idParent.
     * 
     */
    public void setIdParent(double value) {
        this.idParent = value;
    }

}
