
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
@WebServiceClient(name = "LoginService", targetNamespace = "http://services.group9.itmd566.iit.edu/", wsdlLocation = "http://dhcp114.merunorth100.iit.edu:8080/TruckShippingSystemWebServices/LoginService?wsdl")
public class LoginService_Service
    extends Service
{

    private final static URL LOGINSERVICE_WSDL_LOCATION;
    private final static WebServiceException LOGINSERVICE_EXCEPTION;
    private final static QName LOGINSERVICE_QNAME = new QName("http://services.group9.itmd566.iit.edu/", "LoginService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://dhcp114.merunorth100.iit.edu:8080/TruckShippingSystemWebServices/LoginService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOGINSERVICE_WSDL_LOCATION = url;
        LOGINSERVICE_EXCEPTION = e;
    }

    public LoginService_Service() {
        super(__getWsdlLocation(), LOGINSERVICE_QNAME);
    }

    public LoginService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOGINSERVICE_QNAME, features);
    }

    public LoginService_Service(URL wsdlLocation) {
        super(wsdlLocation, LOGINSERVICE_QNAME);
    }

    public LoginService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOGINSERVICE_QNAME, features);
    }

    public LoginService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoginService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LoginService
     */
    @WebEndpoint(name = "LoginServicePort")
    public LoginService getLoginServicePort() {
        return super.getPort(new QName("http://services.group9.itmd566.iit.edu/", "LoginServicePort"), LoginService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoginService
     */
    @WebEndpoint(name = "LoginServicePort")
    public LoginService getLoginServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.group9.itmd566.iit.edu/", "LoginServicePort"), LoginService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOGINSERVICE_EXCEPTION!= null) {
            throw LOGINSERVICE_EXCEPTION;
        }
        return LOGINSERVICE_WSDL_LOCATION;
    }

}
