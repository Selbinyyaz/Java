package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {
		Map<String, String> country = new TreeMap<>();
		country.put("Turkmenistan", "Ashgabat");
		country.put("Turkey", "Ankara");
		country.put("USA", "Washington DC");
		country.put("Canada", "Toronta");
		country.put("Russia", "Moscow");
		country.put("India", "Delhi");
		country.put("Iran", "Tehran");

		// stroring all entry objects into a set, in here Entry is object
		Set<Entry<String, String>> allEntries = country.entrySet();
		for (Entry<String, String> entr : allEntries) {
			String key = entr.getKey();
			String value = entr.getValue();
			System.out.println(key + " " + value);
		}
		System.out.println("----------------------------");
		// country.entrySet().iterator();
		Iterator<Entry<String, String>> it = allEntries.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next().getKey());-->you will get key
			// System.out.println(it.next().getValue());you will get running error
			Entry<String, String> e = it.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key);
			
			System.out.println(value);
		}

	}

}
