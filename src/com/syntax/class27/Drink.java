package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Drink {

	public static void main(String[] args) {
		//3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 
         ArrayList<String>drinks=new ArrayList<>();
         drinks.add("Cocoa Cola");
         drinks.add("Spirite");
         drinks.add("Fanta");
         drinks.add("Beer");
         drinks.add("tea");
         drinks.add("Milk");
         
		Iterator<String> dr = drinks.iterator();
		while (dr.hasNext()) {
			String d=dr.next();
			if(d.contains("a")||d.contains("e")) {
				//System.out.println(d.replaceAll(d, "Water"));
			}
			System.out.println(d.replaceAll(d, "Water"));
		}
		
		//System.out.println(drinks);
	}

}
