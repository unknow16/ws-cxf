package com.fuyi.soap11client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-10-24T14:43:01.254+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://jax_ws_server/", name = "HI")
@XmlSeeAlso({ObjectFactory.class})
public interface HI {

    @WebMethod
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://jax_ws_server/", className = "com.fuyi.soap11client.SayHi")
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://jax_ws_server/", className = "com.fuyi.soap11client.SayHiResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHi(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}