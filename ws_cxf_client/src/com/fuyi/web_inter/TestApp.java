package com.fuyi.web_inter;

public class TestApp {

	public static void main(String[] args) {
		HiServiceService hiServiceService = new HiServiceService();
		HiService port = hiServiceService.getHiServicePort();
		System.out.println(port.sayHi("dogg"));
	}

}
