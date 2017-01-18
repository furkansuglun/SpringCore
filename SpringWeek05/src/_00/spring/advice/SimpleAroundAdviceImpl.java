package _00.spring.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleAroundAdviceImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("before advice");
		Object retValue = arg0.proceed();
		System.err.println("after advice");
		return null;
	}

}
