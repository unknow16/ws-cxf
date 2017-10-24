package jax_ws_server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

@WebService
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface HI {

	public String sayHi(String name);
}
