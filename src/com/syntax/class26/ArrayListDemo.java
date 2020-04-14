package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// create an arraylist with names
		ArrayList<String>names=new ArrayList<>();
		names.add("John");
		names.add("Gulbahar");
		
		//access element from arraylist
		String secondElement=names.get(1);
		System.out.println(secondElement);
		
		//arraylist is a dynamic array
		names.add("Jane");
		names.add("James");
		
		//how to get number of elements inside arrayList?
		System.out.println("Size of arraylist: "+names.size());//not length!!!
		
		names.add("Hichem");
		System.out.println(names.size());
		
		//remove an item
		names.remove(1);
		System.out.println(names.size());
		
		//change an item
		names.set(1, "Ahmed");
		System.out.println(names);
		
		//how to retrieve values from arraylist 1 by 1?
		System.out.println("-----------Using for loop------");
		for(int i=0; i<names.size(); i++) {
			String element=names.get(i);
			System.out.println(element);

	}
      System.out.println("------------------------");
		
		for(String str: names) {
			System.out.println(str);
		}

	}

}
