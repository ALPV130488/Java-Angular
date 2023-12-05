package com.collections;

//1.utility met's/variables.

//2.homogeneous/heterogenous dt's will be accepted.

//3.It's not fixed in size.

//LIST:-

//4.It will allow duplicates

//5.The insertion order is stored

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("String");

		ll.add("String");

		ll.add(123);

		ll.add(3.14f);

		ll.add(true);

		ll.add('a');

		System.out.println(ll);

		ll.add(343);
		
		

		System.out.println(ll);

	}
}
