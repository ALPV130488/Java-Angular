package com.classexamples;//address of the current class

public class VariablesEx {//------->class 

	 int value = 123;;//Global variable instance
	
	 static int value1 = 456;//Global variable static
	
	
	
	public static void main(String[] args) {//------->method
		
		int value = 678;//local variable intialization
		
		System.out.println(value);
		
		System.out.println(VariablesEx.value1);
		
		VariablesEx obj = new VariablesEx();
		
		
		System.out.println(obj.value);
		
		
		
		
	}
}
