package com.syntax.class29;
import java.util.*;
public class OtherMap {

	public static void main(String[] args) {
		//to store students id and corresponding name
		//LinkedHashMap--preserves the insertion order
		Map<Integer, String> lmap=new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane ");
		lmap.put(1002, "Faisal Saki");
		lmap.put(102, "Ali Tarlaci");
		lmap.put(102, "Ali Tarlaci");
		lmap.put(103, "Ali Tarlaci");
		System.out.println(lmap);
		lmap.remove(1000);
		System.out.println(lmap);
		System.out.println("-----------------------------");
		
		//to store objects in form of key and value and you want to sort your keys is Ascending order
		Map<Integer, String> tmap=new TreeMap<>();
		tmap.put(1000, "John Smith");
		tmap.put(1001, "Jane Smith");
		tmap.put(1002, "Faisal Sakhi");
		tmap.put(102, "Ali Tarlaci");
		System.out.println(tmap);
		
		System.out.println("-----------------------------------------------------------------");
		//create a map of Country and population and sort countries in Alphabetical order
		
		Map<String, Integer> population=new TreeMap<>();
		population.put("USA", 330000000);
		population.put("Kazakhstan", 18000000);
		population.put("India", 1326000000);
		population.put("Afghanistan", 37000000);
		
		System.out.println(population);

        
	}

}
