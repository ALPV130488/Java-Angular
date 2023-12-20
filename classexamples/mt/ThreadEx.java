package com.mt;

public class ThreadEx extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1;i<6;i++) {
		System.out.println(i);}
		
	}
	
	public static void main(String[] args) {
		 
		ThreadEx obj = new ThreadEx();
		
		obj.start();    //calling run met
		
		for(int i=6;i<11;i++) {
			System.out.println(i);}
		
	}

}
