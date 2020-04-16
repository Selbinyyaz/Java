package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class LinkedListDemo {

	public static void main(String[] args) {
		

		LinkedList<String> llist = new LinkedList<>();
		llist.add("Yunus");
		llist.add(0, "Reyhan");
		llist.add("Pavel");
		llist.add("Farid");

		int size = llist.size();
		System.out.println(size);
		System.out.println(llist);

		// get all elements 1 by 1 in 3 different ways
		System.out.println("-------Using advanced for loop---------");
		for (String b : llist) {
			System.out.println(b);
		}
		System.out.println("-------Using regular for loop---------");
		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println("----------Using iterator-----------------------");
		Iterator<String> l = llist.iterator();
		while (l.hasNext()) {
			l.next();
		}
		System.out.println(llist);
		System.out.println("-------Food object--------");
		
		//can we store objects of user defined classes?
		List<Food>foods=new LinkedList<>();
		foods.add(new Palow());
		foods.add(new Manti());
		
		for(Food f:foods) {
			f.eat();
			f.cook();
			f.traditionalFood();
		}
		
		
	}

}
