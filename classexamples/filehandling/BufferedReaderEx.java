package com.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\DailyNotes.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line!=null) {
			
			System.out.println(line);
			
			line= br.readLine();
		}
		
		System.out.println("file is read successfully");
	}

}
