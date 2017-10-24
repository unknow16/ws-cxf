package com.fuyi.jaxws;

public class TestApp {

	public static void main(String[] args) {
		HIService hiService = new HIService();
		HI hiPort = hiService.getHIPort();
		String result = hiPort.sayHi("fuyi111");
		System.out.println(result);
	}
}
