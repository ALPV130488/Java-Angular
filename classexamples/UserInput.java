package com.classexamples;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter your name:-");
		
		String name = scan.next();
		
		System.out.println("Hi"+name+"! Welcome to java Programming");
		
	}

}
