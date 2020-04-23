package com.syntax.class29;
import java.util.*;
public class Task {

	public static void main(String[] args) {
//1.Create a Set collection in which you need to add names of the countries.
//In this set we want all objects to be sorted in alphabetical order. 
//Using 2 different ways retrieve all elements from set.
		
		Set<String> countries = new TreeSet<>();
		countries.add("Turkmenistan");
		countries.add("USA");
		countries.add("Turkey");
		countries.add("Britain");
		countries.add("Ozbekistan");
		countries.add("Russia");

		for (String country : countries) {
			System.out.println(country);
		}
		System.out.println("------Using Iterator-------");
		Iterator<String> c = countries.iterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		System.out.println("----------------------------------");
//2.Create a Set of cities in which you want to make sure that insertion order is maintained.
//Using Iterator remove any city that starts with “A”;
		Set<String> cities = new LinkedHashSet<>();
		cities.add("Little Rock");
		cities.add("Ashgabat");
		cities.add("London");
		cities.add("Ankara");
		cities.add("Tashkent");
		cities.add("Chicago");
		
		Iterator<String> city = cities.iterator();
		while(city.hasNext()) {
			if(city.next().startsWith("A")) {
				city.remove();
			}
			
		}
		System.out.println(cities);
		System.out.println("----------------------------------");
//3.Create a Set collection that will hold Objects of Student Type. 
//In this set we do not care about the insertion order. 
//Each student object should have name and studentID. Display name of each student.		
		Set<String> studentType = new HashSet<>();
		studentType.add("Engineer");
		studentType.add("Doctor");
		studentType.add("Teacher");
		studentType.add("Computer Science");
		studentType.add("Nurse");
		
	}

}
