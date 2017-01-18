package _02.aop;

import org.springframework.aop.framework.ProxyFactory;

public class SimpleAfterReturningAdviceTest {

	public static void main(String[] args) {
		//registry - kaydetme
		LogWriter target = new LogWriter();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleAfterReturningAdviceImpl());
		pf.setTarget(target);
		//
		
		LogWriter proxyObject = (LogWriter) pf.getProxy();
		proxyObject.log();
		
		//logwriter sonrasýnda SimpleAfterReturningAdviceImpl classýnda kontrol ettirip loglamasýný yasptýrýp sonra  onu cagýrdýk.!
		//AfterReturningAdvice
	}

}
