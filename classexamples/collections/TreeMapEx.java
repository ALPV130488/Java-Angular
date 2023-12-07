package com.collections;

import java.util.TreeMap;

//Map will not allow duplicate keys

//alphabetical/sequential order

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm  = new TreeMap<Integer,String>();
		
		tm.put(100,"apple");
		
		tm.put(101,"tree");
		
		tm.put(106,"apple");
		
		tm.put(103,"zoo");
		
		tm.put(105,"lion");
		
		tm.put(101,"yellow");
		
		System.out.println(tm);
		
//		System.out.println(tm.get(106));
		
		
		
	}
}
