package org.kudytech.workflow.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para workflowStateMap complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="workflowStateMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="object" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://ws.webservices.compras.adeamx.com/}workflowState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflowStateMap", propOrder = {
    "object",
    "state"
})
public class WorkflowStateMap<T> {

    protected T object;
    protected WorkflowState state;

    /**
     * Obtiene el valor de la propiedad object.
     *
     * @return possible object is {@link Object }
     *
     */
    public T getObject() {
        return object;
    }

    /**
     * Define el valor de la propiedad object.
     *
     * @param value allowed object is {@link Object }
     *
     */
    public void setObject(T value) {
        this.object = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     *
     * @return possible object is {@link WorkflowState }
     *
     */
    public WorkflowState getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     *
     * @param value allowed object is {@link WorkflowState }
     *
     */
    public void setState(WorkflowState value) {
        this.state = value;
    }
}
