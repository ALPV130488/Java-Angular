package com.string;

public class StringEx2 {
	
	public static void main(String[] args) {
		
		String name= "apple";
		
		String name1= "apple";
		
		System.out.println(name==name1);//true

		System.out.println(name.equalsIgnoreCase(name1));//true
		
		System.out.println(name.equals(name1));//true
		
		System.out.println(name.compareTo(name1));//0
		
		
		String name2 = new String("apple");
		
		String name3 = new String("apple");
		
		System.out.println(name2==name3);//false

		System.out.println(name2.equalsIgnoreCase(name3));//true
		
		System.out.println(name2.equals(name3));//true
		
		System.out.println(name2.compareTo(name3));//0
		
		
	}

}
