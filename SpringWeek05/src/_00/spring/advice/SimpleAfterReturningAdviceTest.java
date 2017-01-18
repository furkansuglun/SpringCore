package _00.spring.advice;

import org.springframework.aop.framework.ProxyFactory;

public class SimpleAfterReturningAdviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogWriter targetClass = new LogWriter();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleAfterReturningAdviceImpl());
		pf.setTarget(targetClass);
		
		targetClass = (LogWriter) pf.getProxy();
		
		targetClass.log();
		
		
	}

}
