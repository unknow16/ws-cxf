
package com.fuyi.person;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fuyi.person package. 
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

    private final static QName _GetAllPerson_QNAME = new QName("http://ws.fuyi.com/", "getAllPerson");
    private final static QName _AddPersonResponse_QNAME = new QName("http://ws.fuyi.com/", "addPersonResponse");
    private final static QName _GetAllPersonResponse_QNAME = new QName("http://ws.fuyi.com/", "getAllPersonResponse");
    private final static QName _AddPerson_QNAME = new QName("http://ws.fuyi.com/", "addPerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fuyi.person
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link GetAllPerson }
     * 
     */
    public GetAllPerson createGetAllPerson() {
        return new GetAllPerson();
    }

    /**
     * Create an instance of {@link GetAllPersonResponse }
     * 
     */
    public GetAllPersonResponse createGetAllPersonResponse() {
        return new GetAllPersonResponse();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fuyi.com/", name = "getAllPerson")
    public JAXBElement<GetAllPerson> createGetAllPerson(GetAllPerson value) {
        return new JAXBElement<GetAllPerson>(_GetAllPerson_QNAME, GetAllPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fuyi.com/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fuyi.com/", name = "getAllPersonResponse")
    public JAXBElement<GetAllPersonResponse> createGetAllPersonResponse(GetAllPersonResponse value) {
        return new JAXBElement<GetAllPersonResponse>(_GetAllPersonResponse_QNAME, GetAllPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fuyi.com/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

}
