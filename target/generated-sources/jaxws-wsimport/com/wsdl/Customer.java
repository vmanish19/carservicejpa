
package com.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://services.group9.itmd566.iit.edu/}address" minOccurs="0"/>
 *         &lt;element name="contactdetails" type="{http://services.group9.itmd566.iit.edu/}contactDetails" minOccurs="0"/>
 *         &lt;element name="custFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="custLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "address",
    "contactdetails",
    "custFirstName",
    "custId",
    "custLastName"
})
public class Customer {

    protected Address address;
    protected ContactDetails contactdetails;
    protected String custFirstName;
    protected int custId;
    protected String custLastName;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactdetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getContactdetails() {
        return contactdetails;
    }

    /**
     * Sets the value of the contactdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setContactdetails(ContactDetails value) {
        this.contactdetails = value;
    }

    /**
     * Gets the value of the custFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustFirstName() {
        return custFirstName;
    }

    /**
     * Sets the value of the custFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustFirstName(String value) {
        this.custFirstName = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     */
    public int getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     */
    public void setCustId(int value) {
        this.custId = value;
    }

    /**
     * Gets the value of the custLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLastName() {
        return custLastName;
    }

    /**
     * Sets the value of the custLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLastName(String value) {
        this.custLastName = value;
    }

}
