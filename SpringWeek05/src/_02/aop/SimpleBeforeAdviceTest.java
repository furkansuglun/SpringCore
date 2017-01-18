package _02.aop;

import org.springframework.aop.framework.ProxyFactory;

public class SimpleBeforeAdviceTest {

	public static void main(String[] args) {
		//registry - kaydetme
		LogWriter target = new LogWriter();
			//register etmemiz gerekiyorr.bunun i�in proxt factory kullan�yoruz
		ProxyFactory factory  = new ProxyFactory();
		factory.addAdvice(new SimpleBeforeAdviceImpl());
		factory.setTarget(target);
		//
		
		LogWriter proxyObject = (LogWriter) factory.getProxy();
		proxyObject.log();
		
		//logwriter �ncesinde simplebeforeadvice class�nda kontrol ettirip loglamas�n� yaspt�r�p �nce onu cag�rd�k.!
		//MethodBeforeAdvice
		
	}

}
