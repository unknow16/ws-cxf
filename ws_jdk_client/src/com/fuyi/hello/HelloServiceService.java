
package com.fuyi.hello;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloServiceService", targetNamespace = "http://ws.fuyi.com/", wsdlLocation = "http://localhost/service?wsdl")
public class HelloServiceService
    extends Service
{

    private final static URL HELLOSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOSERVICESERVICE_EXCEPTION;
    private final static QName HELLOSERVICESERVICE_QNAME = new QName("http://ws.fuyi.com/", "HelloServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/service?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOSERVICESERVICE_WSDL_LOCATION = url;
        HELLOSERVICESERVICE_EXCEPTION = e;
    }

    public HelloServiceService() {
        super(__getWsdlLocation(), HELLOSERVICESERVICE_QNAME);
    }

    public HelloServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOSERVICESERVICE_QNAME, features);
    }

    public HelloServiceService(URL wsdlLocation) {
        super(wsdlLocation, HELLOSERVICESERVICE_QNAME);
    }

    public HelloServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOSERVICESERVICE_QNAME, features);
    }

    public HelloServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServicePort")
    public HelloService getHelloServicePort() {
        return super.getPort(new QName("http://ws.fuyi.com/", "HelloServicePort"), HelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServicePort")
    public HelloService getHelloServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.fuyi.com/", "HelloServicePort"), HelloService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOSERVICESERVICE_EXCEPTION!= null) {
            throw HELLOSERVICESERVICE_EXCEPTION;
        }
        return HELLOSERVICESERVICE_WSDL_LOCATION;
    }

}
