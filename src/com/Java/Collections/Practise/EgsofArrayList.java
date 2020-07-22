package com.Java.Collections.Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EgsofArrayList {

	public static void main(String[] args) {
		// 1. Write a Java program to create a new array list, add some items (string)
		// and print out the collection.
		List<String> al = new ArrayList<>();
		al.add("Chocolate Cake");
		al.add("Lemon Drizzle Cake");
		al.add("Victoria Sponge");
		al.add("Carrot Cake");
		System.out.println(al);
		

		// 2. Write a Java program to iterate through all elements in a array list.

		for (String element : al) {
			System.out.println(element);
		}

		// 3. Write a Java program to insert an element into the array list at the first
		// position.
		al.add(0, "Red Velvet Cake");
		System.out.println(al);

		// 4. Write a Java program to retrieve an element (at a specified index) from a
		// given array list.
		System.out.println(al.get(1));

		// 5. Write a Java program to update specific array element by given element.
		// al.set(5,"Pineapple Cake");
		System.out.println(al);

		// 6. Write a Java program to remove the third element from a array list.
		al.remove(2);
		System.out.println(al);

		// 7. Write a Java program to search an element in a array list.
		if (al.contains("Lemon Drizzle Cake")) {
			System.out.println("Yes the cake is on sale");
		} else {
			System.out.println("The cake is out of stock");
		}

		// 8. Write a Java program to sort a given array list. Go to the editor
		Collections.sort(al);
		System.out.println(al);
		
		
		//9. Write a Java program to copy one array list into another. 
		
		ArrayList<String> copy = new ArrayList<>(al);
//		copy.addAll(al);
//		System.out.println("original array list " + al);
		System.out.println("Testing new scenario" + copy);
		System.out.println("New Arraylist" + copy.size());
		System.out.println("Old Arraylist" + al.size());
		
		ArrayList<String> copyc1 = new ArrayList<>();
		
		System.out.println("***" + copy.size());
		System.out.println("***" + copyc1.size());
		
		//10. Write a Java program to shuffle elements in a array list.
		Collections.shuffle(al);
		
		//11. Write a Java program to reverse elements in a array list.
		Collections.reverse(al);
		System.out.println(al);
		
		//12. Write a Java program to extract a portion of a array list.
		List<String> sublist = al.subList(0, 2);
		System.out.println(sublist);
		
		//13. Write a Java program to compare two array lists. 
		System.out.println(al.equals(copy));
		
		//14. Write a Java program of swap two elements in an array list.
		Collections.swap(al, 0, 2);
		System.out.println(al);
		
		//15. Write a Java program to join two array lists. 
		List<String> join_al = new ArrayList<>();
		join_al.addAll(al);
		join_al.addAll(copy);
		System.out.println(join_al);
		
		//16. Write a Java program to clone an array list to another array list.
		
		//ArrayList<String> newc1 = (ArrayList<String>)al.clone();
		
		al.isEmpty();
		al.clear();
		
		System.out.println(copy.size());
		
		al.add("Chocolate Cake");
		al.add("Lemon Drizzle Cake");
		al.add("Victoria Sponge");
		al.add("Carrot Cake");
		
		
		//17. Write a Java program to print all the elements of a ArrayList using the position of the elements.
		
		for(int i=0;i<copy.size();i++) {
			System.out.println("Index Number " + i + " " + al.get(i));
			
		/* Pending****
		 * 
		 * 1) List<String> ll = new ArrayList<>();
		 * 2) Trim to size // 
		 * 3) Clone array list //ArrayList<String> newc1 = (ArrayList<String>)al.clone();
		 * 3) Ways to copy arrays 
		 * 4) ArrayList constructors
		 * 5) 
		 */
			
		}
		
	}

}
