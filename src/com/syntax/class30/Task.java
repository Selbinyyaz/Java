package com.syntax.class30;

import java.util.*;


public class Task {

	public static void main(String[] args) {
// Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.
		
		Map<String, String> country = new TreeMap<>();
		country.put("Turkmenistan", "Ashgabat");
		country.put("Turkey", "Ankara");
		country.put("USA", "Washington DC");
		country.put("Canada", "Toronta");
		country.put("Russia", "Moscow");
		country.put("India", "Delhi");
		country.put("Iran", "Tehran");
		System.out.println(country);
        System.out.println(country.keySet());
       
        
		// Print all keys and values from a country map using for each loop and iterator.
		System.out.println("---------------Getting all keys----------------");
		for (String countr : country.keySet()) {
			System.out.println("Key is " + countr + " and it is value is " + country.get(countr));
		}
		Iterator<String> it = country.keySet().iterator();
		while (it.hasNext()) {
			System.out.println("Key is " + it.next());
		}
		 System.out.println("---------------Getting all values----------------");
		// Print all values from a country map using for each loop and iterator.
		for (String c : country.values()) {
			System.out.println(c);
		}
		Iterator<String> obj = country.values().iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
	}

}
