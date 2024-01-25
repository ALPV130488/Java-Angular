package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@ComponentScan("demo")
@Configuration
public class Test {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("SpringConfig.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
//		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);
		
		Product pro =(Product) factory.getBean("product");
		
		Employee emp =(Employee) factory.getBean("emp");
		
		System.out.println(pro);
		
		System.out.println(emp);
	}

}
