package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		// create a collection of food and using 3 ways execute methods
		ArrayList<Food> foods = new ArrayList<>();
		foods.add(new Palow());
		foods.add(new Manti());
		foods.add(new Samsa());
		foods.add(new Taco());
		System.out.println("----Using regular for loop----- ");
		for (int i = 0; i < foods.size(); i++) {
			foods.get(i).eat();
			foods.get(i).traditionalFood();
			foods.get(i).cook();
			System.out.println();
		}
		System.out.println("----Using advanced for loop----- ");
		for (Food a : foods) {
			a.cook();
			a.eat();
			a.traditionalFood();
			System.out.println();

		}
		System.out.println("-----Using iterator----");
		Iterator<Food> b = foods.iterator();
		while (b.hasNext()) {
			Food c = b.next();
			c.eat();
			c.traditionalFood();
			c.cook();
			System.out.println();
		}
	}

}
