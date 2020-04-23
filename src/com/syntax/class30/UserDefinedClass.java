package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;


abstract class Store {

	String type, name;

	public Store(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void display() {
		System.out.println("This is store " + name);
	}

	public abstract void workingHours();
}

class Nike extends Store {

	public Nike(String name, String type) {
		super(name, type);

	}

	@Override
	public void workingHours() {
		System.out.println(name + " works from 10 am till 6pm");
	}

}

class Costco extends Store {

	public Costco(String name, String type) {
		super(name, type);

	}

	@Override
	public void workingHours() {
		System.out.println(name + " works from 8am until 8pm");

	}

}
public class UserDefinedClass{
	public static void main(String[] args) {
		//we want to store stores in form 1-->Amazon; 2-->Cosco
		
		Map<Integer,Store>storeMap=new LinkedHashMap<>();
		storeMap.put(1, new Nike("Nike","retail"));
		storeMap.put(2, new Costco("Costco","wholesale"));
		System.out.println(storeMap);
		
		//to get access to all methods of our Store objects:values(), keySet(),entrySet();
		
		//1.way--->get all value objects
		Collection<Store> col = storeMap.values();
		for(Store c:col) {
			c.display();
			c.workingHours();
		}
		System.out.println("----------  USING ENTRY SET -------------------");
		//2. way --> get all Entry Objects --> getValue
		Set<Entry<Integer, Store>> storeSet=storeMap.entrySet();
		for(Entry<Integer, Store> entry: storeSet) {
			entry.getValue().workingHours();
			entry.getValue().display();
			System.out.println("-----------------------------");
		}
		
		//3 .way --> get all Keys --> get value of specified key
		Set<Integer> keys=storeMap.keySet();
		for(Integer key: keys) {
			Store obj=storeMap.get(key);
			obj.display();
			obj.workingHours();
			System.out.println("-----------------------------");
		}

	}
	
}