
package com.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CustomerService", targetNamespace = "http://services.group9.itmd566.iit.edu/", wsdlLocation = "http://dhcp114.merunorth100.iit.edu:8080/TruckShippingSystemWebServices/CustomerService?wsdl")
public class CustomerService_Service
    extends Service
{

    private final static URL CUSTOMERSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERSERVICE_EXCEPTION;
    private final static QName CUSTOMERSERVICE_QNAME = new QName("http://services.group9.itmd566.iit.edu/", "CustomerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://dhcp114.merunorth100.iit.edu:8080/TruckShippingSystemWebServices/CustomerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERSERVICE_WSDL_LOCATION = url;
        CUSTOMERSERVICE_EXCEPTION = e;
    }

    public CustomerService_Service() {
        super(__getWsdlLocation(), CUSTOMERSERVICE_QNAME);
    }

    public CustomerService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERSERVICE_QNAME, features);
    }

    public CustomerService_Service(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERSERVICE_QNAME);
    }

    public CustomerService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERSERVICE_QNAME, features);
    }

    public CustomerService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServicePort")
    public CustomerService getCustomerServicePort() {
        return super.getPort(new QName("http://services.group9.itmd566.iit.edu/", "CustomerServicePort"), CustomerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServicePort")
    public CustomerService getCustomerServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.group9.itmd566.iit.edu/", "CustomerServicePort"), CustomerService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERSERVICE_EXCEPTION!= null) {
            throw CUSTOMERSERVICE_EXCEPTION;
        }
        return CUSTOMERSERVICE_WSDL_LOCATION;
    }

}
