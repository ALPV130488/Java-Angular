package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\December.txt");
	
		int i = fr.read();
		
		while(i!=-1) {			//-1 is end of the line
			
			System.out.println((char)i);
			
			i=fr.read();
				
		}
		
		System.out.println("file is read successfully");
	
	}
	


}
