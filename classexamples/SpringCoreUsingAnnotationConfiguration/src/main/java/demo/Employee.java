package demo;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	public void displayMsg() {
		System.out.println("Iam from the Employee class");
	}

	@Override
	public String toString() {
		return "Iam from the Employee class";
	}

	
}
