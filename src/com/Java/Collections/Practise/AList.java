package com.Java.Collections.Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AList {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Chocolate Cake");
		al.add("Lemon Drizzle Cake");
		al.add("Victoria Sponge");
		al.add("Carrot Cake");
		
		//al.trimToSize();
		//Collections.copy(al2, al);
		ArrayList<String> al2 = new ArrayList<>(al);
		al.add("Fruit Cake");
		System.out.println(al.size());
		System.out.println(al2.size());
		
		
		List<String> al3 = new ArrayList<>();
		System.out.println(al2.size());
		
		//Write a Java program to copy one array list into another.
		
		
		
	}

}
