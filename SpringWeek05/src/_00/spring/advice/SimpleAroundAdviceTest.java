package _00.spring.advice;

import org.springframework.aop.framework.ProxyFactory;

public class SimpleAroundAdviceTest {

	
	public static void main(String[] args) {
		
		LogWriter targetClass = new LogWriter();
		ProxyFactory pf = new ProxyFactory();
		
		pf.addAdvice(new SimpleAroundAdviceImpl());
		
		pf.setTarget(targetClass);

		targetClass = (LogWriter) pf.getProxy();
		
		targetClass.log();
		
	}
	
}
