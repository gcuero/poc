
package org.kudytech.adeamx.webmex.client;

import org.kudytech.adeamx.webmex.domain.UsuarioWeb;
import org.kudytech.adeamx.webmex.domain.AbstractSimpleResponseMessage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuarioResponseMessage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarioResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.webservices.compras.adeamx.com/}abstractSimpleResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="usuarioWeb" type="{http://ws.webservices.compras.adeamx.com/}usuarioWeb" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarioResponseMessage", propOrder = {
    "usuarioWeb"
})
public class UsuarioResponseMessage
    extends AbstractSimpleResponseMessage
{

    protected UsuarioWeb usuarioWeb;

    /**
     * Obtiene el valor de la propiedad usuarioWeb.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioWeb }
     *     
     */
    public UsuarioWeb getUsuarioWeb() {
        return usuarioWeb;
    }

    /**
     * Define el valor de la propiedad usuarioWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioWeb }
     *     
     */
    public void setUsuarioWeb(UsuarioWeb value) {
        this.usuarioWeb = value;
    }

}
