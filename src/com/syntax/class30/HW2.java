package com.syntax.class30;
import java.util.*;
import java.util.Map.Entry;
public class HW2 {

	public static void main(String[] args) {
//Create a Map from array of cities that will sort keys in alphabetical order.
//As a key store the name of the city and as a value store the length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//If any city name is more than 7 characters remove that city . 
		
		String[]cities= {"Washington", "Lousiana", "Chicago", "Little Rock", "Dallas", "Houston", "Lubbock","California"};
		
		Map<String, Integer>city=new TreeMap<>();
		
		for(String c:cities) {
			city.put(c, c.length());
		}
		System.out.println(city);
		
		System.out.println("----------  Use Iterator to remove -------------------");
		Iterator<Entry<String,Integer>>ent=city.entrySet().iterator();
		while(ent.hasNext()){
			Entry<String, Integer>it=ent.next();
			if(it.getKey().length()==7) {
				ent.remove();
			}
		}
		System.out.println(city);

	}

}
