package ws_cxf_server;

import org.apache.cxf.frontend.ServerFactoryBean;

public class TestApp {

	public static void main(String[] args) {
		//创建服务工厂对像
		ServerFactoryBean sfb = new ServerFactoryBean();
		//设置服务地址
		sfb.setAddress("http://localhost:7777/hello");
		//设置服务类
		sfb.setServiceClass(HelloService.class);
		//设置服务对象实例
		sfb.setServiceBean(new HelloService());
		//发布服务
		sfb.create();
	}
}
