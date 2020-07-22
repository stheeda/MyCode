package com.Java.Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapExercises {

	public static void main(String[] args) {
		//1. Write a Java program to associate the specified value with the specified key in a HashMap.
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Orange");
		hm.put(2, "Apple");
		hm.put(3, "Banana");
		hm.put(4, "Grapes");
		
		System.out.println(hm);
		for (Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		//2. Write a Java program to count the number of key-value (size) mappings in a map. 
		System.out.println("The size of the Hashmap <hm> is " + hm.size());
		
		//3. Write a Java program to copy all of the mappings from the specified map to another map.
		HashMap<Integer, String> fruits = new HashMap<>();
		fruits.putAll(hm);
		System.out.println(fruits);
		
		//4. Write a Java program to remove all of the mappings from a map.
		
		fruits.clear();
		System.out.println(fruits);
		
		//5. Write a Java program to check whether a map contains key-value mappings (empty) or not. 
		
		boolean result = fruits.isEmpty();
		System.out.println(result);
		
		//6. Write a Java program to get a shallow copy of a HashMap instance.
		
		HashMap<Integer, String> cloned = new HashMap<>();
		cloned = (HashMap<Integer,String>)hm.clone();
		System.out.println("Cloned " + cloned);
		System.out.println(hm.get(1));
		System.out.println(hm.values());
		
	}

}
