package com.Java.ControlStatements;

import java.util.Scanner;

public class IfStatement_Int_Compare {

	public static void main(String[] args) {

		int a, b, c;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		a = obj.nextInt();
		System.out.println("Enter 2nd number");
		b = obj.nextInt();
		System.out.println("Enter 3rd number");
		c = obj.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is the larger integer " + b + " & " + c);
		} else if (b > a && b > c) {
			System.out.println(b + " is the larger integer than " + a + " & " + c);
		} else {
			System.out.println(c + " is the larger integer than " + a + " & " + b);
		}

	}
}
