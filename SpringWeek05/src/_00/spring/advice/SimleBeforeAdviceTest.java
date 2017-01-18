package _00.spring.advice;

import org.springframework.aop.framework.ProxyFactory;

public class SimleBeforeAdviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogWriter target = new LogWriter();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleBeforeAdviceImpl());
		pf.setTarget(target);
		
		LogWriter proxyObject = (LogWriter) pf.getProxy();
		proxyObject.log();
	}

}
