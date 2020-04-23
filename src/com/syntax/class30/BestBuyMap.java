package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BestBuyMap {

	public static void main(String[] args) {
//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
		
		Map<Integer, String> item = new LinkedHashMap<>();
		item.put(101, "Printer");
		item.put(203, "TV");
		item.put(213, "Monitor");
		item.put(432, "Computer");
		item.put(123, "KitchAid");

		Set<Entry<Integer, String>> items = item.entrySet();
		for (Entry<Integer, String> i : items) {
			System.out.println(i);
		}
		System.out.println("---------------Using iterator----------------");
		Iterator<Entry<Integer, String>> it = items.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> obj = it.next();
			Integer key = obj.getKey();
			String value = obj.getValue();
			System.out.println(key + " " + value);
		}

	}

}
