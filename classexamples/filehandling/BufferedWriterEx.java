package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	
	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\December.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("good \n morning");
		
		bw.newLine();
		
//		bw.write(1234);
		
		bw.newLine();
		
		bw.write('g');
		
		char ch[] = {'a','b','c'};
		
		bw.write(ch);
		
		bw.flush();
		
		bw.close();
		
		System.out.println("data is written into the file successfully");
		
		//it cant write numerical values
	}

}
