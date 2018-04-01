
package com.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateTruck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateTruck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="truck" type="{http://services.group9.itmd566.iit.edu/}truck" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateTruck", propOrder = {
    "truck"
})
public class UpdateTruck {

    protected Truck truck;

    /**
     * Gets the value of the truck property.
     * 
     * @return
     *     possible object is
     *     {@link Truck }
     *     
     */
    public Truck getTruck() {
        return truck;
    }

    /**
     * Sets the value of the truck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Truck }
     *     
     */
    public void setTruck(Truck value) {
        this.truck = value;
    }

}
