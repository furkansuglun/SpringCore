package _04.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareWriter implements BeanNameAware , BeanClassLoaderAware ,ApplicationContextAware{

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName");
	}

	@Override
	public void setBeanClassLoader(ClassLoader arg0) {
		// TODO Auto-generated method stub
		System.out.println("setBeanClassLoader");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext");
	}

}
