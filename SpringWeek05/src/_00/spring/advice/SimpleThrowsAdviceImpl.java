package _00.spring.advice;

import org.springframework.aop.ThrowsAdvice;

public class SimpleThrowsAdviceImpl implements ThrowsAdvice {
	
	
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("***");
		System.out.println("Generic exception capture(almak)");
		System.out.println("Cought "+ex.getClass().getName());
		System.out.println("***");
	}
	
}
