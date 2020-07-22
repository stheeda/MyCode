package com.Java.Methods;

public class MethodsLogicBuilding {

	public static void main(String[] args) {

		// reverseNumber(123456789);
		reverseString("I love java");

	}

	public static void reverseNumber(int num) {
		// Logic: Take modulus of the number by 10, multiply it by 10, add it to reverse
		// variable then
		// divide the num by 10;
		int reverse = 0;
		while (num != 0) {

			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(reverse);
	}

	public static void reverseString(String word) {

		String reverse = "";
		int len = word.length();

		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		System.out.println(reverse);
	}

}
