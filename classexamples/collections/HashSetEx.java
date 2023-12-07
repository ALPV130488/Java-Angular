package com.collections;

import java.util.HashSet;

//1.utility met's/variables.

//2.homogeneous/heterogenous dt's will be accepted.

//3.It's not fixed in size.

//Set:-

//4.It will not allow duplicates

//5.The insertion order is not stored

public class HashSetEx {

	public static void main(String[] args) {
	
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("shafi");
		
		hs.add("apple");
		
		hs.add("rose");
		
		hs.add("harry");
		
		hs.add("orange");
		
		hs.add("apple");
		
		
		System.out.println(hs);
		
		for(String str:hs) {
			System.out.println(str);
		}
		
	}

}
