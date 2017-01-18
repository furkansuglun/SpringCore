package _02.aop;

import org.springframework.aop.framework.ProxyFactory;

public class SimpleBeforeAdviceTest {

	public static void main(String[] args) {
		//registry - kaydetme
		LogWriter target = new LogWriter();
			//register etmemiz gerekiyorr.bunun için proxt factory kullanýyoruz
		ProxyFactory factory  = new ProxyFactory();
		factory.addAdvice(new SimpleBeforeAdviceImpl());
		factory.setTarget(target);
		//
		
		LogWriter proxyObject = (LogWriter) factory.getProxy();
		proxyObject.log();
		
		//logwriter öncesinde simplebeforeadvice classýnda kontrol ettirip loglamasýný yasptýrýp önce onu cagýrdýk.!
		//MethodBeforeAdvice
		
	}

}
