package com.Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LList {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<>();

		// 1. Write a Java program to append the specified element to the end of a
		// linked list.
		fruits.add("Ice Apple");
		fruits.add("Custard Apple");
		fruits.add("Mangoes");
		fruits.add("Sapota");
		fruits.addLast("Apple");
		System.out.println(fruits);

		// 2. Write a Java program to iterate through all elements in a linked list, try
		// them in 6 ways

		// ******PENDING******

		// 3. Write a Java program to iterate through all elements in a linked list
		// starting at the specified position.

		// set Iterator at specified index
		Iterator<String> i = fruits.listIterator(1); // starting at position 1
		// print list from second position
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// 4. Write a Java program to iterate a linked list in reverse order.

		Iterator<String> desc = fruits.descendingIterator();
		while (desc.hasNext()) {
			System.out.println("List in reverse order " + desc.next());
		}

		// 5. Write a Java program to insert the specified element at the specified
		// position in the linked list.

		fruits.add(2, "Papaya");
		System.out.println(fruits);

		// 6. Write a Java program to insert elements into the linked list at the first
		// and last position.

		fruits.addFirst("Grapes");
		fruits.addLast("Pineapple");
		System.out.println(fruits);

		// 7. Write a Java program to insert the specified element at the front of a
		// linked list.

		fruits.offerFirst("Apple");
		fruits.addFirst("Blueberry");
		System.out.println(fruits);

		// 8. Write a Java program to insert the specified element at the end of a
		// linked list.

		fruits.offerLast("Raspberry");
		System.out.println(fruits);

		// 9. Write a Java program to insert some elements at the specified position
		// into a linked list.

		fruits.add(2, "JackFruit");
		System.out.println(fruits);

		// 10. Write a Java program to get the first and last occurrence of the
		// specified elements in a linked list.

		System.out.println(fruits.getFirst());
		System.out.println(fruits.getLast());

		// 11. Write a Java program to display the elements and their positions in a
		// linked list.

		for (int p = 0; p < fruits.size(); p++) {
			System.out.println("Index at " + p + ": " + fruits.get(p));
		}

		// 12. Write a Java program to remove a specified element from a linked list.
		// 13. Write a Java program to remove first and last element from a linked list.
		// 14. Write a Java program to remove all the elements from a linked list.

		fruits.remove(0);
		System.out.println(fruits);
		fruits.removeFirst();
		fruits.removeLast();
		// fruits.removeAll();

		// 15. Write a Java program of swap two elements in an linked list.
		Collections.swap(fruits, 2, 5);
		System.out.println(fruits);

		// 16. Write a Java program to shuffle the elements in a linked list.

		Collections.shuffle(fruits);
		System.out.println(fruits);

		// 17. Write a Java program to join two linked lists.

		LinkedList<String> joinLL = new LinkedList<>();
		joinLL.addAll(fruits);
		System.out.println(joinLL);

		// 18. Write a Java program to clone an linked list to another linked list.

		LinkedList<String> cloneLL = new LinkedList<>();
		cloneLL = (LinkedList) joinLL.clone();
		System.out.println(cloneLL);

		// 19. Write a Java program to remove and return the first element of a linked
		// list.

		// System.out.println(cloneLL.pop());

		// 20. Write a Java program to retrieve but does not remove, the first & last
		// element of a linked list.

		System.out.println(cloneLL.peek());
		System.out.println(cloneLL.peekLast());

		// 21. Write a Java program to check if a particular element exists in a linked
		// list.

		System.out.println(fruits.contains("JackFruit"));

		// 22. Write a Java program to convert a linked list to array list.

		List<String> all = new ArrayList<>(fruits);
		System.out.println(all);

		// 23. Write a Java program to replace an element in a linked list.

		fruits.add(2, "Plum");
		System.out.println(fruits);
		fruits.set(2, "Sharon");
		System.out.println(fruits);
	}
}
