package com.syntax.class29;

import java.util.*;

public class SetFamily {
	public static void main(String[] args) {
		// all set classes ignore duplicates
		// hashSet does not guarantee insertion order.there is no order
		Set<String> veggies = new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");

		System.out.println(veggies);

		// hashSet does guarantee insertion order.there is order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");

		System.out.println(fruits);

		// treeSet stores objects in alphabatical order
		Set<String> food = new TreeSet<>(veggies);
		food.addAll(fruits);
		System.out.println(food);

	}

}
