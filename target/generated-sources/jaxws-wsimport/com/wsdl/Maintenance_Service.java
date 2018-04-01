
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
@WebServiceClient(name = "maintenance", targetNamespace = "http://services.group9.itmd566.iit.edu/", wsdlLocation = "http://dhcp114.merunorth100.iit.edu:8080/TruckShippingSystemWebServices/maintenance?wsdl")
public class Maintenance_Service
    extends Service
{

    private final static URL MAINTENANCE_WSDL_LOCATION;
    private final static WebServiceException MAINTENANCE_EXCEPTION;
    private final static QName MAINTENANCE_QNAME = new QName("http://services.group9.itmd566.iit.edu/", "maintenance");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://dhcp114.merunorth100.iit.edu:8080/TruckShippingSystemWebServices/maintenance?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MAINTENANCE_WSDL_LOCATION = url;
        MAINTENANCE_EXCEPTION = e;
    }

    public Maintenance_Service() {
        super(__getWsdlLocation(), MAINTENANCE_QNAME);
    }

    public Maintenance_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MAINTENANCE_QNAME, features);
    }

    public Maintenance_Service(URL wsdlLocation) {
        super(wsdlLocation, MAINTENANCE_QNAME);
    }

    public Maintenance_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MAINTENANCE_QNAME, features);
    }

    public Maintenance_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Maintenance_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MaintenanceService
     */
    @WebEndpoint(name = "MaintenanceServicePort")
    public MaintenanceService getMaintenanceServicePort() {
        return super.getPort(new QName("http://services.group9.itmd566.iit.edu/", "MaintenanceServicePort"), MaintenanceService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MaintenanceService
     */
    @WebEndpoint(name = "MaintenanceServicePort")
    public MaintenanceService getMaintenanceServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.group9.itmd566.iit.edu/", "MaintenanceServicePort"), MaintenanceService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MAINTENANCE_EXCEPTION!= null) {
            throw MAINTENANCE_EXCEPTION;
        }
        return MAINTENANCE_WSDL_LOCATION;
    }

}
