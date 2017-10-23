import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TestURLConnection {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost/service?wsdl");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setDoOutput(true);
		conn.setDoInput(true);
		
		conn.setRequestMethod("POST");
		
		conn.setRequestProperty("Content-type", "text/xml;charset=UTF-8");
		
		String data = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:q0=\"http://ws.fuyi.com/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
					+ "<soapenv:Body>"
					+ "<q0:sayHello>"
					+ "<arg0>1234</arg0>" 
					+ "</q0:sayHello>"
					+ "</soapenv:Body>"
					+ "</soapenv:Envelope>";
		
		OutputStream out = conn.getOutputStream();
		out.write(data.getBytes());
		
		if(conn.getResponseCode() == 200) {
			InputStream in = conn.getInputStream();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line = "";
			StringBuffer sb = new StringBuffer();
			if((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			System.out.println(sb.toString());
			
			SAXReader saxReader = new SAXReader();
			Document doc = saxReader.read(new StringReader(sb.toString()));
			List<Element> eles = doc.selectNodes("//return");
			for (Element element : eles) {
				System.out.println(element.getText());
			}
			
		}
	}
}
