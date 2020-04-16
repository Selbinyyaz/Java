package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Drink {

	public static void main(String[] args) {
		//3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 
         ArrayList<String>drinks=new ArrayList<>();
         drinks.add("cocoa cola");
         drinks.add("spirite");
         drinks.add("fanta");
         drinks.add("beer");
         drinks.add("tea");
         drinks.add("milk");
         
		Iterator<String> dr = drinks.iterator();// because contains a and e 
		while (dr.hasNext()) {
			String d=dr.next();
			if(d.contains("a")||d.contains("e")) {
				//System.out.println(d.replaceAll(d, "Water"));
			}
			System.out.println(d.replaceAll(d, "Water"));
		}
		
		//System.out.println(drinks);
		//use for loop
//		for (int i = 0; i < drinks.size(); i++) {
//			if (drinks.get(i).endsWith("e") || drinks.get(i).endsWith("a")) {
//				drinks.set(i, "water");
//			}
//			System.out.print(drinks.get(i) + " ");
//		}
	}

}
