package com.syntax.class30;
import java.util.*;
import java.util.Map.Entry;
public class PersonTest {

	public static void main(String[] args) {
		//In Test Class create a Map that will store key in ascending order.
		//In that map store personId and a Person Object. Print each object details.
		
		Map<Integer, Person> person = new TreeMap<>();
		person.put(101, new Person("John", "Smith", 35, 60000));
		person.put(102, new Person("Gulsum", "Ince", 28, 70000));

//		System.out.println("------------Getting key set-----------------");
//		for (Integer p : person.keySet()) {
//			person.get(p).display();
//
//		}
//		System.out.println("-------------Getting value from Map----------------");
//		for (Person per : person.values()) {
//			per.display();
//		}
		System.out.println("------------Getting Entry set-----------------");
		Set<Entry<Integer, Person>> obj = person.entrySet();
		Iterator<Entry<Integer, Person>> ent = obj.iterator();
		while (ent.hasNext()) {
			Entry<Integer, Person> it = ent.next();
			Integer id = it.getKey();
			Person per = it.getValue();
			System.out.println("Employee Id: " + id);
			per.display();

		}

	}

}
