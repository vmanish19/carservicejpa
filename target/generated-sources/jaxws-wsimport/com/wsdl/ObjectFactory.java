
package com.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateCustomerResponse_QNAME = new QName("http://services.group9.itmd566.iit.edu/", "createCustomerResponse");
    private final static QName _CreateCustomer_QNAME = new QName("http://services.group9.itmd566.iit.edu/", "createCustomer");
    private final static QName _GetCustomerDetailsById_QNAME = new QName("http://services.group9.itmd566.iit.edu/", "getCustomerDetailsById");
    private final static QName _GetCustomerDetailsByIdResponse_QNAME = new QName("http://services.group9.itmd566.iit.edu/", "getCustomerDetailsByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerDetailsById }
     * 
     */
    public GetCustomerDetailsById createGetCustomerDetailsById() {
        return new GetCustomerDetailsById();
    }

    /**
     * Create an instance of {@link GetCustomerDetailsByIdResponse }
     * 
     */
    public GetCustomerDetailsByIdResponse createGetCustomerDetailsByIdResponse() {
        return new GetCustomerDetailsByIdResponse();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ContactDetails }
     * 
     */
    public ContactDetails createContactDetails() {
        return new ContactDetails();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.group9.itmd566.iit.edu/", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.group9.itmd566.iit.edu/", name = "createCustomer")
    public JAXBElement<CreateCustomer> createCreateCustomer(CreateCustomer value) {
        return new JAXBElement<CreateCustomer>(_CreateCustomer_QNAME, CreateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetailsById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.group9.itmd566.iit.edu/", name = "getCustomerDetailsById")
    public JAXBElement<GetCustomerDetailsById> createGetCustomerDetailsById(GetCustomerDetailsById value) {
        return new JAXBElement<GetCustomerDetailsById>(_GetCustomerDetailsById_QNAME, GetCustomerDetailsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetailsByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.group9.itmd566.iit.edu/", name = "getCustomerDetailsByIdResponse")
    public JAXBElement<GetCustomerDetailsByIdResponse> createGetCustomerDetailsByIdResponse(GetCustomerDetailsByIdResponse value) {
        return new JAXBElement<GetCustomerDetailsByIdResponse>(_GetCustomerDetailsByIdResponse_QNAME, GetCustomerDetailsByIdResponse.class, null, value);
    }

}
