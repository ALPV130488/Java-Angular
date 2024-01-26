package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Employee;

@SpringBootApplication
public class EmployeeCrudApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EmployeeCrudApplication.class, args);
		
		Employee emp = new Employee();
		
		emp.displayMsg();
	}

}
