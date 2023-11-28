package com.oops;

abstract class Parent4 {//0%-100% abstraction

	public abstract void add(int a, int b);//abstract met

	public void displayMsg() {//concrete met
		System.out.println("Iam from abstract classes concrete method");
	}
}

public class Child3 extends Parent4 {

	@Override
	public void add(int a, int b) {

		System.out.println(a + b);

	}

	public static void main(String[] args) {

		Child3 obj = new Child3();

		obj.displayMsg();

		obj.add(12, 13);

	}

}
