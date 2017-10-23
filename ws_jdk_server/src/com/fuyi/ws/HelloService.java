package com.fuyi.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloService {

	public String sayHello(String name) {
		return "hello " + name + " webservice";
	}
	
	@WebMethod(exclude=true)
	public String saybye() {
		return "bye webservice";
	}
}
