
package org.kudytech.adeamx.webmex.client;

import org.kudytech.adeamx.webmex.domain.MenuWeb;
import org.kudytech.adeamx.webmex.domain.AbstractSimpleResponseMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para menuResponseMessage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="menuResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.webservices.compras.adeamx.com/}abstractSimpleResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="applicationMenu" type="{http://ws.webservices.compras.adeamx.com/}menuWeb" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menuResponseMessage", propOrder = {
    "applicationMenu"
})
public class MenuResponseMessage
    extends AbstractSimpleResponseMessage
{

    @XmlElement(nillable = true)
    protected List<MenuWeb> applicationMenu;

    /**
     * Gets the value of the applicationMenu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationMenu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationMenu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MenuWeb }
     * 
     * 
     */
    public List<MenuWeb> getApplicationMenu() {
        if (applicationMenu == null) {
            applicationMenu = new ArrayList<MenuWeb>();
        }
        return this.applicationMenu;
    }

}
