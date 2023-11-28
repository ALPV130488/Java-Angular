package com.oops;

public class MethodEx {
	
	public int add(int a,int b) {//public instance met returns int 
		
		return (a+b);
	}
	
	public static String dispalyMsg() {//public static met returns string
		return "Iam from public static met";
	}

	public void display() {//public instance returns nothing
		System.out.println("Hello Everyone");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(MethodEx.dispalyMsg());
		
		MethodEx obj = new MethodEx();
		
		obj.display();
		
		System.out.println(obj.add(3, 10));
	}
	
}
