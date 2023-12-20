package com.mt;

public class MultiThreadingEx implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<6;i++) {
		System.out.println(i);}
		
	}
	
	public static void main(String[] args) {
		
		MultiThreadingEx obj = new MultiThreadingEx();
		
		Thread thread = new Thread(obj);
		
		thread.start();				//run method
		
		for(int i=6;i<11;i++) {
			System.out.println(i);}
		
	}

}
