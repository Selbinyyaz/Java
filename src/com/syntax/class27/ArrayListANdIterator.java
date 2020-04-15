package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListANdIterator {

	public static void main(String[] args) {
		// let's create an ArrayList of chocolate
		ArrayList<String> choco = new ArrayList<>();
		choco.add("Kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snikers");

		// create arraylist of sweets
		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);// gets of ArrayList of chocolate

		System.out.println(sweets.size());
		System.out.println(sweets);

		// we want to iterate through the collection
		Iterator<String> sw = sweets.iterator();
		while (sw.hasNext()) {
			String element = sw.next();
			if (element.equals("ice cream")) {
				sw.remove();
			}
		}
		System.out.println(" Arraylist after removing element ");
		System.out.println(sweets);

		// I want to get elements backwards
		for (int i = sweets.size() - 1; i >= 0; i--) {
			System.out.print(sweets.get(i) + ";");
		}
		// advanced for loop
		// iterates/loops in only one direction, not backwards
		for (String str : sweets) {
			System.out.println(str);
		}

	}

}
