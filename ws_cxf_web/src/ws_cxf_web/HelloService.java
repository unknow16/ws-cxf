package ws_cxf_web;

import javax.jws.WebService;

@WebService
public class HelloService {

	public String sayHi(String name) {
		return "hello " + name; 
	}
}
