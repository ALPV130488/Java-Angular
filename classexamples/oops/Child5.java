package com.oops;

class MethodOverriding {
	
	public void displayMsg() {
		System.out.println("Good Evening!!!");
	}
}

class Child5 extends MethodOverriding {

	@Override
	public void displayMsg() {
		System.out.println("Good Morning !!!!");
		
		
	}
	
	public static void main(String[] args) {
		
		Child5 obj = new Child5();
		
		obj.displayMsg();
	}
	
}