package org.kudytech.workflow.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.kudytech.workflow.ws.domain.WorkflowCtl;

/**
 * <p>Clase Java para canChangeWorkFlowSate complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="canChangeWorkFlowSate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.webservices.compras.adeamx.com/}workflowCtl" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "canChangeWorkFlowSate", propOrder = {
    "arg0"
})
public class CanChangeWorkFlowSate {

    protected WorkflowCtl arg0;

    /**
     * Obtiene el valor de la propiedad arg0.
     *
     * @return possible object is {@link WorkflowCtl }
     *
     */
    public WorkflowCtl getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     *
     * @param value allowed object is {@link WorkflowCtl }
     *
     */
    public void setArg0(WorkflowCtl value) {
        this.arg0 = value;
    }
}
