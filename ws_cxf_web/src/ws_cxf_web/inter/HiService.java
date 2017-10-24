package ws_cxf_web.inter;

import javax.jws.WebService;

@WebService
public interface HiService {

	public String sayHi(String name);
}
