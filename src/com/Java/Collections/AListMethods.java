package com.Java.Collections;

import java.util.ArrayList;
import java.util.List;

public class AListMethods {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		List<String> vegetables = new ArrayList<String>();

		fruits.add("Alphonso Mango");
		fruits.add("Custard Apple");
		fruits.add("Jack Fruit");

		System.out.println(fruits);

		vegetables.add("White Brinjal");
		vegetables.add("Drumsticks");
		vegetables.add("Bottle Guard");

		System.out.println(vegetables);

		fruits.addAll(vegetables); // addAll methods copies all elements of one arraylist into another one
		fruits.set(2, "Ice Apple");

		System.out.println(fruits);
		System.out.println(fruits.get(0));

		// Convert ArrayList to Array
		String[] Export = new String[fruits.size()];
		fruits.toArray(Export);
		for (String s : Export) {
			System.out.println(s);
		}

	}

}
