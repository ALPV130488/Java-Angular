package com.oops;

import com.classexamples.UserInput;

public class ConstructorEx  {

	public ConstructorEx() { // default constructor

		System.out.println("Iam from Default constructor");
	}

	public ConstructorEx(String name) {
//		System.out.println("Iam from parametraised const ");
//		System.out.println("My name is:-" + name);
	}

	public static void main(String[] args) {

		ConstructorEx obj1 = new ConstructorEx("apple");

		
		UserInput obj = new UserInput();
		
		obj.test();
		
	}

}
