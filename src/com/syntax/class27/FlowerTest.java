package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		// store flowers into array
		Flower[] flowerArray = { new Tulip("tulip"), new Rose("rose"), new Sunflower("sunflower") };// polymorphism

//		for (Flower f : flowerArray) {
//			f.bloom();
//		}
		// store flowers into arraylist
		ArrayList<Flower> flowers = new ArrayList<>();
		// flowers.add("tulip");//gives error when you put<String>;cannot add String
		// Object into ArrayList of Flower Objects

		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));

		// 1. HW to call available methods using: for loop, advanced for loop, iterator
		System.out.println("----Using regular for loop----- ");
		for (int i = 0; i < flowers.size(); i++) {
			flowers.get(i).bloom();
		}

		System.out.println("----Using advanced for loop----- ");
		for (Flower f : flowers) {
			f.bloom();
		}
		System.out.println("-----Using iterator----");
		Iterator<Flower> flo = flowers.iterator();
		while (flo.hasNext()) {
			flo.next().bloom();
		}

	}

}
