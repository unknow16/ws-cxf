package com.fuyi.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(portName="myHelloService", serviceName="HelloServices", name="HelloService", targetNamespace="hello.fuyi.com")
public class PersonService {

	private List<Person> list = new ArrayList<Person>();
	
	
	public void addPerson(@WebParam(name="sir") Person person) {
		list.add(person);
	}
	
	@WebResult(name="sirHello")
	public List<Person> getAllPerson() {
		return list;
	}
}
