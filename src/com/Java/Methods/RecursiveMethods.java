package com.Java.Methods;

public class RecursiveMethods {

	public static int printNumber(int num) {

		if (num == 0) {
			return 0;
		} else
			System.out.println(num);
		return printNumber(num - 1);
	}

	public static String allDollars(String str) {

		if (str.length() <= 0) {
			return str;
		}
		return str.charAt(0) + "$" + allDollars(str.substring(1));
	}

	public static void main(String[] args) {

		//printNumber(5);
		System.out.println(allDollars("Hello"));
	}

}
