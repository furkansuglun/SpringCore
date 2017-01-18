package _00.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SimpleBeforeAdviceImpl implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("befor method : " + method.getName());
	}

}
