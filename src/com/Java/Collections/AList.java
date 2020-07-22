package com.Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		List<Integer> lsync = Collections.synchronizedList(al); // convert arraylist to a syncronized array
		
		al.add(37);
		al.add(42);
		al.add(45); // add items on to the list
		System.out.println("Size of the array list is " + al.size()); // find out size of the array list
		System.out.println(al.get(2)); // returns the value of the item in index number 2
		al.set(0,15); // amend the values in a given index 
		System.out.println(al.get(0)); 
		System.out.println(al); //print array
		
		Collections.sort(lsync);
		
		Collections.sort(al);
		
		for (int i : al) {
			System.out.println(i);
		}
	}
}
