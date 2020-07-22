package com.Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercises {

	public static void main(String[] args) {

		List<String> cl = new ArrayList<>();
		// 1. Write a Java program to create a new array list, add some colors (string)
		cl.add("Red");
		cl.add("Orange");
		cl.add("Blue");
		cl.add("Black");
		// System.out.println(cl); // and print out the collection.

		// 2. Write a Java program to iterate through all elements in a array list.

		// for (int i = 0; i < cl.size(); i++) {
		// System.out.print(cl.get(i) + ", " + "\n");
		// }
		//
		// for (String s: cl) {
		// System.out.println(s);
		// }

		// 3. Write a Java program to insert an element into the array list at the first
		// and last position.
		cl.add(0, "Violet");
		System.out.println("The size is " + cl.size());
		cl.add(5, "Green");
		System.out.println(cl);

		// 4. Write a Java program to retrieve an element (at a specified index) from a
		// given array list.
		System.out.println(cl.get(3));

		// 5. Write a Java program to remove the third element from a array list.
		cl.remove(4);
		System.out.println(cl);

		// 6. Write a Java program to search an element in a array list.
		System.out.println(cl.contains("Blue"));
		if (cl.contains("Blue")) {
			System.out.println("Yes, blue is on the list");
		} else {
			System.out.println("No, Blue is not on the list");
		}

		// 7. Write a Java program to sort a given array list.

		System.out.println("List before the sort: " + cl);
		Collections.sort(cl);
		System.out.println("List after the sort: " + cl);

		// 8. Write a Java program to copy one array list into another.

		List<String> l2 = new ArrayList<>(cl.size());
		System.out.println(cl.size());
		System.out.println(l2.size());
		Collections.copy(cl, l2);
		System.out.println(cl);

		l2.add("Pink");

		// 9. Write a Java program to shuffle elements in a array list.

		Collections.shuffle(cl);

		// 10. Write a Java program to reverse elements in a array list.

		Collections.reverse(cl);

		// 11. Write a Java program to extract a portion of a array list.

		System.out.println(cl.subList(0, 4));

		// 14. Write a Java program of swap two elements in an array list.
		System.out.println("Before Swap " + cl);
		Collections.swap(cl, 0, 2);
		System.out.println("After Swap " + cl);

		// 15. Write a Java program to join two array lists.

		List<String> copy = new ArrayList<>();
		copy.addAll(cl);
		copy.addAll(l2);
		System.out.println(copy);

		// 16. Write a Java program to clone an array list to another array list.
		// 17. Write a Java program to empty an array list.
		cl.remove(cl);
		cl.removeAll(cl);
		cl.clear();
		// 18. Write a Java program to test an array list is empty or not.
		System.out.println(cl.isEmpty());
		// 19. Write a Java program to trim the capacity of an array list the current
		// list size.
		ArrayList<String> tr = new ArrayList<>();
		tr.trimToSize();

		// 20. Write a Java program to increase the size of an array list.
		tr.ensureCapacity(9);
		System.out.println(tr.size());
		
	}
}
