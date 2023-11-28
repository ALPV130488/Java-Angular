package com.oops;

public class MethodOverloading {
	
	public void add(int a,int b) {
		System.out.println("The sum of two integers are:-"+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("The sum of three integers are:-"+(a+b+c));
	}
	public void add(float a,float b) {
		System.out.println("The sum of two float are:-"+(a+b));
	}
	public void add(int a,float b) {
		System.out.println("The sum of int and float are:-"+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("The sum of float and int are:-"+(a+b));
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.add(2,3);
		
	
	}

}
