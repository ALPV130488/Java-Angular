package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileEx {
	
	public static void main(String[] args) throws IOException {
		
		File obj = new File("C:\\Users\\PRADEEP GOUD\\Desktop\\December.txt");
		
		System.out.println(obj.exists());
		
		System.out.println(obj.createNewFile());
		
		System.out.println(obj.exists());
		
		System.out.println("file is created successfully");
		
	}

}
