package com.oops;

class GrandParent{
	static int grandParent=90;
	
	public static void displayMsg1() {
		System.out.println("Iam from the grand Parent Class");
	}
}

class Parent extends GrandParent{
	
	static int parent =45;
	
	public static void displayMsg() {
		System.out.println("Iam from the parent class");
	}
}

public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Child.displayMsg();
		
		System.out.println(Child.parent);
		
		Child.displayMsg1();
		
		System.out.println(Child.grandParent);
	}

}
