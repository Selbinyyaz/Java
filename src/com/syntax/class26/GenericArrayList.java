package com.syntax.class26;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
//Create a generic ArrayList that will store 5 names into it. 
//Find out whether the given ArrayList is empty or not? 
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that

		ArrayList <String> names=new ArrayList <String>();
		
		System.out.println("ArrayList is empty--->"+names.isEmpty());//because there is nothing in the list above.
		//Then we added an element, list is not empty and method returns false.
		names.add("John");
		names.add("Jemile");
		names.add("Jack");
		names.add("Arzuw");
		names.add("Guljemal");
		names.add(" ");
		System.out.println(names);
		
		System.out.println("the given ArrayList is empty or not-->"+names.isEmpty());
		//Check whether the specific name is present in an ArrayList or not?
		System.out.println(names.contains("John"));
		System.out.println("-------------------------");
		
		for(String name:names) {
		System.out.println(name);
		
		}
		System.out.println("the size of your arrayList: "+names.size());
	}

}
