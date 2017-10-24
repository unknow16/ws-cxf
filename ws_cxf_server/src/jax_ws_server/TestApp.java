package jax_ws_server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class TestApp {

	public static void main(String[] args) {

		JaxWsServerFactoryBean sfb = new JaxWsServerFactoryBean();
		
		sfb.getInInterceptors().add(new LoggingInInterceptor()); //信息输入时的拦截器 –请求
		sfb.getOutInterceptors().add(new LoggingOutInterceptor()); //信息输出时的拦截器-响应
		// 设置服务地址
		sfb.setAddress("http://localhost:5555/hello");
		// 设置服务类
		sfb.setServiceClass(HI.class);
		// 设置服务对象实例
		sfb.setServiceBean(new HIImpl());
		// 发布服务
		sfb.create();
	}
}
