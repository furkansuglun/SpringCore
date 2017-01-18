package _04.collection.injection.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionAnnotationTest {

	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"04.collection.injection.annotation.xml");

		CollectionInjectionAnnotationModel model = context.getBean("collectionInjectionAnnotationModelId",
				CollectionInjectionAnnotationModel.class);

		System.out.println(model);

		context.close();
		
	}
	
}
