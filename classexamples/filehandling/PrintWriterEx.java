package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\December.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("good morning");
		
		pw.println(1234);
		
		pw.println(true);
		
		char ch[] = {'a','b','c'};
		
		pw.print(ch);
		
		pw.flush();
		
		pw.close();
		
		 System.out.println("written into the file successfully");
	
	}

}
