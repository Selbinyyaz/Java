package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//create a collection that will store only unique objects and we do not care about the order
      HashSet<String>breakfast=new HashSet<>();
      breakfast.add("eggs");
      breakfast.add("bread");
      breakfast.add("tea");
      breakfast.add("cream cheese ");
      breakfast.add("eggs");
      breakfast.add("coffee");
      
      //how many elements in the set?
      int size=breakfast.size();
      System.out.println(size);
      //order is not maintained
      System.out.println(breakfast);
      
      //we can retrieve all elements
      Iterator<String>myIterator=breakfast.iterator();
      while(myIterator.hasNext()) {
    	 System.out.println( myIterator.next());
      }
      //we cannot use regular for loop
      //there is no get method!!!
      System.out.println("-------Advanced loop ----------------");
      //advanced/enhances for loop 
      for(String item:breakfast) {
    	  System.out.println(item);
      }
	}

}
