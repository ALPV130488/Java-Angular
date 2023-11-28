package com.classexamples;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pls give the rating from 1 to 5");
		
		int x=scan.nextInt();
		
		switch(x) {
		case 1:{
			System.out.println("1.Sorry for the inconvinence ,we will improve well");
				break;
		}
		case 2:{
			System.out.println("2.Sorry for the inconvinence ,we will improve well");
			break;
		}
		case 3:{
			System.out.println("3.Sorry for the inconvinence ,we will improve well");
			break;
		}
		
		case 4:{
			System.out.println("4.Thank you ");
			
			break;
		}
		case 5:{
			System.out.println("5.Thank you ");
			
			break;
		}
		default:{
			System.out.println("Pls enter the value from 1 to 5");
			break;
		}
		}
	}
}
