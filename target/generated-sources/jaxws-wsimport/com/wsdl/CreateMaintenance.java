
package com.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createMaintenance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createMaintenance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maintenance" type="{http://services.group9.itmd566.iit.edu/}maintenance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMaintenance", propOrder = {
    "maintenance"
})
public class CreateMaintenance {

    protected Maintenance maintenance;

    /**
     * Gets the value of the maintenance property.
     * 
     * @return
     *     possible object is
     *     {@link Maintenance }
     *     
     */
    public Maintenance getMaintenance() {
        return maintenance;
    }

    /**
     * Sets the value of the maintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Maintenance }
     *     
     */
    public void setMaintenance(Maintenance value) {
        this.maintenance = value;
    }

}
