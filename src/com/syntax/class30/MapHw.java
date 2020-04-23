package com.syntax.class30;

import java.util.*;

public class MapHw {

	public static void main(String[] args) {
		Map<Integer, String> building = new LinkedHashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Amazon");
		building.put(4, "CyberTech");
		building.put(5, "T-Mobile");
		building.put(6, "UPS");
		building.put(7, "DropBox");
		building.put(3, "Amazon");
		building.put(5, "T-Mobile");

		//how get all keys
		Set<Integer>keys=building.keySet();
		
		System.out.println("-------Getting keys using Iterator---------------");
		Iterator<Integer>B=keys.iterator();
		while(B.hasNext()) {
			int k=B.next();
			//key is ____ and it is value is _____
			System.out.println("Key is "+k+" and it is value is  "+building.get(k));
		}
		System.out.println("-------------------------------");
		//how to get all values
		Collection<String>values=building.values();
		
		for(String value:values) {
			System.out.println(value);
		}
		System.out.println("-------------------------------");
	     Iterator<String>v=values.iterator();
	     while(v.hasNext()) {
	    	String K= v.next();
	    	System.out.println(K);
	     }
	}

}
