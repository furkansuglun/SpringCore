package _06.bean.destruction.lifecycle;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;


public class DestructionWriter implements DisposableBean {

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
	
}
