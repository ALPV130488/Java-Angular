package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\December.txt");
		
		fw.write("good \n morning");
		
		fw.write(100);
		
		fw.write('g');
		
		char ch[] = {'a','b','c'};
		
		fw.write(ch);
		
		fw.flush();
		
		fw.close();
		
		System.out.println("data is written \n into the file successfully");
		
	//it cant write numerical values
		
	//taking new line is not possible
	
	}

}
