package com.collections;

//1.utility met's/variables.

//2.homogeneous/heterogenous dt's will be accepted.

//3.It's not fixed in size.

//LIST:-
//
//4.It will allow duplicates
//
//5.The insertion order is stored

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
		
		obj.add("String");
		
		obj.add("String");
		
		obj.add(123);
		
		obj.add(3.14f);
		
		obj.add(true);
		
		obj.add('a');
		
		System.out.println(obj);
		
		obj.add(343);
		
		System.out.println(obj);
		
		
		
	}

}
