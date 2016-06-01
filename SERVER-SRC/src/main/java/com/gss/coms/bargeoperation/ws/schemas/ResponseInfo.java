
package com.gss.coms.bargeoperation.ws.schemas;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.gss.coms.bargeoperation.model.PartnerInfo;


/**
 * <p>Java class for ResponseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObj" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseInfo", propOrder = {
    "resultObj"
})
@XmlSeeAlso({
	PartnerInfo.class
})
public class ResponseInfo {

    @XmlElement(required = true, nillable = true)
    protected ArrayList<Object> resultObj;

    /**
     * Gets the value of the resultObj property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public ArrayList<Object> getResultObj() {
        return resultObj;
    }

    /**
     * Sets the value of the resultObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResultObj(ArrayList<Object> value) {
        this.resultObj = value;
    }

}
