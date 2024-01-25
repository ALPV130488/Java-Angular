package springAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("springAutowiring")
public class Test {

	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);

		Employee emp = (Employee) factory.getBean("emp");

		System.out.println(emp);

		Object add1 = (Address) factory.getBean("add");

		System.out.println(add1);

	}

}
