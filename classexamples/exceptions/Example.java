package com.exceptions;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a numerator value:-");
		
		int num = scan.nextInt();
		
		System.out.println("Enter a denominator value:-");
		
		int den =scan.nextInt();
		
		try {
		int result = (num/den);
		
		System.out.println("The result is :-"+result);}
		
		catch(ArithmeticException e) {
			System.out.println("Don't enter 0 as the denominator!!!");
		}
		
		System.out.println("Remaning 10000 lines of code");
		
	}
}
