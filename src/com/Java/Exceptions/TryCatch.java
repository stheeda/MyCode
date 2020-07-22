package com.Java.Exceptions;

public class TryCatch {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0); // a
		} catch (ArithmeticException e) {
			System.out.println("Illegal math");
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			//System.out.println("Test");
		}

	}
}
