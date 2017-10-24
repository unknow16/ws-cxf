package com.fuyi.stub;

public class TestApp {

	public static void main(String[] args) {
		HelloService helloService = new HelloService();
		HelloServicePortType helloServicePort = helloService.getHelloServicePort();
		String result = helloServicePort.sayHello("fuyi");
		System.out.println(result);
	}
}
