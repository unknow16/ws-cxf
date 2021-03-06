package com.fuyi.soap11client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-10-24T14:43:01.346+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "HIService", 
                  wsdlLocation = "http://localhost:5555/hello?wsdl",
                  targetNamespace = "http://jax_ws_server/") 
public class HIService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://jax_ws_server/", "HIService");
    public final static QName HIPort = new QName("http://jax_ws_server/", "HIPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:5555/hello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HIService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:5555/hello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HIService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HIService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HIService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HIService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HIService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HI
     */
    @WebEndpoint(name = "HIPort")
    public HI getHIPort() {
        return super.getPort(HIPort, HI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HI
     */
    @WebEndpoint(name = "HIPort")
    public HI getHIPort(WebServiceFeature... features) {
        return super.getPort(HIPort, HI.class, features);
    }

}
