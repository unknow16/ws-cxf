package com.fuyi.soap11client;

public class TestApp {

	public static void main(String[] args) {
		HIService hiService = new HIService();
		HI hiPort = hiService.getHIPort();
		String result = hiPort.sayHi("wangwu");
		System.out.println(result);
	}
}
