package com.exceptions;

public class Throw {

	static void valid(int value) {
	  
	  if(value==0) {
		  
		  throw new ArithmeticException("The value should be 0");
		  
	  }else{
		  
		  System.out.println("The value is not 0");
		
	  }
	  
  }
	
	public static void main(String[] args) {
		
		valid(0);
		
	}

}
