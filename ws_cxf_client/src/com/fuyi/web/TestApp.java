package com.fuyi.web;

public class TestApp {

	public static void main(String[] args) {
		HelloServiceService helloServiceService = new HelloServiceService();
		HelloService port = helloServiceService.getHelloServicePort();
		String result = port.sayHi("模压");
		System.out.println(result);
	}

}
