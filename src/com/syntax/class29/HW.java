package com.syntax.class29;
import java.util.*;
public class HW {

	public static void main(String[] args) {
//Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
//Insert 7 entries with duplicate keys and values. 
//Check how many entries you have?
//Update company on a 4th floor 
//Remove company on the 7th floor
//Print your map
		
		Map<Integer, String> building = new LinkedHashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Amazon");
		building.put(4, "CyberTech");
		building.put(5, "T-Mobile");
		building.put(6, "UPS");
		building.put(7, "DropBox");
		building.put(3, "Amazon");
		building.put(5, "T-Mobile");

		// Check how many entries you have?
		System.out.println("Size: " + building.size());
		System.out.println(building);
		System.out.println("-------------------------------");
		
		

		// Update company on a 4th floor 
		building.replace(4, "Yahoo");
		System.out.println(building);
		
		// Remove company on the 7th floor
		building.remove(7);
		System.out.println(building);

	}

}
