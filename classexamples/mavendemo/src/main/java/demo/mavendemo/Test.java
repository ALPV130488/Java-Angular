package demo.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
//		Resource resource = new ClassPathResource("SpringCore.xml");
//		
//		BeanFactory factory = new XmlBeanFactory(resource);
	
	ApplicationContext factory = new ClassPathXmlApplicationContext("SpringCore.xml");	
		
		Employee emp = (Employee) factory.getBean("emp");
		
		System.out.println(emp);
		
	}

}
