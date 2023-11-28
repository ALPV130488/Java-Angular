package com.oops;

interface Parent1 {// 100% abstracting

	public void add(int a, int b);

}

interface Parent2 {// 100% abstraction

	public void add(int a, int b);

}

public class Child1 implements Parent1,Parent2 {// 0% abstraction

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		Child1 obj = new Child1();

		obj.add(10, 10);
	}

}
