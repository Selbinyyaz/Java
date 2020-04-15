package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {

		// lets ArrayList that stores Double type of (only) object
		// 1. generic collection/arraylist
		ArrayList<Double> alist = new ArrayList<>();// ()-->constructor call
		alist.add(10.99);
		alist.add(12.99);
		alist.add(100.99);
		// alist.add(200);it is Double type
		System.out.println(alist);

		// replace element
		alist.set(1, 13.99);
		System.out.println(alist);

		// remove element
		alist.remove(13.99);
		System.out.println(alist);

		// retrieve(or get) single element
		System.out.println(alist.get(1));

		// retrieve all elements from collection
		// 1. use advanced/enhanced for loop
		for (double list : alist) {
			System.out.println("All element:" + list);
		}
		// 2. for loop
		for (int i = 0; i < alist.size(); i++) {
			double d = alist.get(i);
			System.out.println(d);
		}
		System.out.println("------Iterator------");
		// 3.Iterator
		Iterator<Double> a = alist.iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}

		System.out.println("------Non generic Collection--------");

		// 2. non generic collection/arraylist
		ArrayList obj = new ArrayList();
		obj.add("hello");// store single object
		obj.add(100);
		obj.add('c');
		obj.addAll(alist);// store collection object
		System.out.println(obj);

		// retrieve all elements from collection
		for (Object o : obj) {//
			System.out.println(o);
		}

	}

}
