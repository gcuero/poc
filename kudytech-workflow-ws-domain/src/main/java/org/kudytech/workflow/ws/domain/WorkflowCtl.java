package org.kudytech.workflow.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Clase Java para workflowCtl complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera
 * que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="workflowCtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confObjeto" type="{http://ws.webservices.compras.adeamx.com/}confObjeto" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idreferencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idworkflowCtl" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowCurrentState" type="{http://ws.webservices.compras.adeamx.com/}workflowState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflowCtl", propOrder = {
    "confObjeto",
    "fecha",
    "idreferencia",
    "idworkflowCtl",
    "login",
    "workflowCurrentState"
})
public class WorkflowCtl {

    protected ConfObjeto confObjeto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Long idreferencia;
    protected long idworkflowCtl;
    protected String login;
    protected WorkflowState workflowCurrentState;

    /**
     * Obtiene el valor de la propiedad confObjeto.
     *
     * @return possible object is {@link ConfObjeto }
     *
     */
    public ConfObjeto getConfObjeto() {
        return confObjeto;
    }

    /**
     * Define el valor de la propiedad confObjeto.
     *
     * @param value allowed object is {@link ConfObjeto }
     *
     */
    public void setConfObjeto(ConfObjeto value) {
        this.confObjeto = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idreferencia.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getIdreferencia() {
        return idreferencia;
    }

    /**
     * Define el valor de la propiedad idreferencia.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setIdreferencia(Long value) {
        this.idreferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idworkflowCtl.
     *
     */
    public long getIdworkflowCtl() {
        return idworkflowCtl;
    }

    /**
     * Define el valor de la propiedad idworkflowCtl.
     *
     */
    public void setIdworkflowCtl(long value) {
        this.idworkflowCtl = value;
    }

    /**
     * Obtiene el valor de la propiedad login.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad workflowCurrentState.
     *
     * @return possible object is {@link WorkflowState }
     *
     */
    public WorkflowState getWorkflowCurrentState() {
        return workflowCurrentState;
    }

    /**
     * Define el valor de la propiedad workflowCurrentState.
     *
     * @param value allowed object is {@link WorkflowState }
     *
     */
    public void setWorkflowCurrentState(WorkflowState value) {
        this.workflowCurrentState = value;
    }
}
