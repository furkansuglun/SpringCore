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
		
		//logwriter sonrasında SimpleAfterReturningAdviceImpl classında kontrol ettirip loglamasını yasptırıp sonra  onu cagırdık.!
		//AfterReturningAdvice
	}

}
