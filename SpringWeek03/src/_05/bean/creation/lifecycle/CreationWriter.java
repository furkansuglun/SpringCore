package _05.bean.creation.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

public class CreationWriter implements InitializingBean {

	@PostConstruct
	public void testPostConstruct() {
		System.out.println("testPostConstruct");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet");
	}

	public void testInitMethod() {
		System.out.println("testInitMethod");
	}
	
}
