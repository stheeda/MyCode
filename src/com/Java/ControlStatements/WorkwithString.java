package com.Java.ControlStatements;

public class WorkwithString {

	/*
	 * Topics: Concatenation, Convert to Upper Case, Convert to Lower Case,
	 * Substring (param1) and Substring (param1, param2)
	 */

	public static void main(String[] args) {

		String message = "Let's start coding"; // variable naming and declaration
		String squeeze = message.substring(5);// prints text from the 5th index of value stored in message
		System.out.println(squeeze);
		System.out.println(message.substring(3, 9));// prints text from 3rd index to 8th index, does not include 9th
		System.out.println(message.toLowerCase());// converts the string value to lower case
		System.out.println(message.toUpperCase());// converts the string value to upper case
		System.out.println(message.concat(" in Java"));// attaches the text declared in brackets to the end
		System.out.println(message.length()); // prints the length of the string
		System.out.println(message.charAt(17));// prints char at index 17
		String result = new StringBuffer(message).reverse().toString();
		System.out.println(result);
		String result1 = new StringBuffer("Reverse the string").reverse().toString();
		System.out.println(result1);

	}

}
