package com.fuyi.ws;

import javax.xml.ws.Endpoint;

public class TestPublish {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8077/service", new PersonService());
	}
}
