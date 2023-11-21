package com.classexamples;
public class StaticEx {

	static int staticcounter;

	int instancecounter;

	public void counter() {
		
		staticcounter++;

		instancecounter++;
	}

	public void display() {

		System.out.println("static counter:-" + staticcounter);
		System.out.println("Instance counter:-" + instancecounter);

	}

	public static void main(String[] args) {
		
			StaticEx obj1 = new StaticEx();
			
			StaticEx obj2 = new StaticEx();
			
			StaticEx obj3 = new StaticEx();
			
			obj1.counter();
			
			obj2.counter();
			
			obj3.counter();
			
			obj3.display();
			
			

	}

}
