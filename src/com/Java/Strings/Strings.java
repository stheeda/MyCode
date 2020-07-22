package com.Java.Strings;

public class Strings {

	public static void main(String[] args) {

		String S = "Welcome";
		String S1 = new String("Welcome to India");
		String S2 = "";
		System.out.println(S);
		System.out.println(S1);
		System.out.println(S == S1);
		// Returns false bcos one String is in string pool area and another in heap area
		// which means comparing by object reference
		System.out.println(S.equals(S1)); // comparing by value
		System.out.println(S.charAt(0)); // Extracts the char at index
		System.out.println(S.length()); // Gives the length of the String starting from 0th index
		System.out.println(S.substring(0)); // Gives the string result starting from 0th index
		System.out.println("substring" + S.substring(2,2));// Gives the string from 0th index to 5th index
		System.out.println(S.contains("come")); // Searches the string and returns if any match
		System.out.println(S1.isEmpty()); // Returns boolean value false if it contains text
		System.out.println(S.concat(" to the Java")); // adds the text to existing String
		System.out.println(S.replace('W', 'C')); // replaces W with C
		System.out.println(S.indexOf('m')); // Returns the index of specified character, if specified NA it returns -1
		System.out.println(S.lastIndexOf('d'));
		String output = S.substring(1,2).toUpperCase() + S.substring(1);
		System.out.println(output + " current ");
		// System.out.println(S1.trim());

		String cars = "Bentley,Mercedez,BMW,Ford,Vauxall,Peugeot";
		String[] cars1 = cars.split(",");
		for (String BCars : cars1) {
			System.out.println(BCars);
		}
	}

}
