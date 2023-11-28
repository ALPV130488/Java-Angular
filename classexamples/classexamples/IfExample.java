package com.classexamples;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age:-");
		
		int age= scan.nextInt();
		
		if(age>18)
		{
			System.out.println("You r eligible for voting");
		}
		
		else {
			System.out.println("you r not eligible for the voting");
		}
	}

}
