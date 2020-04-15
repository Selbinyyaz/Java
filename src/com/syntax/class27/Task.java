package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
//Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String> cars = new ArrayList<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Tesla");
		// retrieve all the values using 3 different ways
		System.out.println(cars);

		System.out.println("----Using regular for loop----- ");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("----Using advanced for loop----- ");
		for (String car : cars) {
			System.out.println(car);
		}
		System.out.println("-----Using iterator----");
		Iterator<String> obj = cars.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
		System.out.println("----------------------------");
		
		//Create an arrayList of words. Remove every word that ends with “e”. Use iterator
		
		ArrayList<String> words = new ArrayList<>();
		words.add("hello");
		words.add("able");
		words.add("bye");
		words.add("good");

		Iterator<String> word = words.iterator();
		while (word.hasNext()) {
			if (word.next().endsWith("e")) {
				word.remove();
			}
		}
		System.out.println(words);
	}

}
