import com.fuyi.hello.HelloService;
import com.fuyi.hello.HelloServiceService;

public class TestApp {

	public static void main(String[] args) {
		HelloServiceService helloServiceService = new HelloServiceService();
		HelloService helloServicePort = helloServiceService.getHelloServicePort();
		String result = helloServicePort.sayHello("lisi");
		System.out.println(result);
	}
}
