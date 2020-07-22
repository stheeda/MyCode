package com.Java.Loops;

import java.util.Scanner;

public class ForLoop_Fraction_Even_Odd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 15;
		double result = 0;
		for(double i = 1;i<=num;i++){
		if (i % 2 == 0) {
			result -= 1 / i;
		} else {
			result += 1 / i;
		}
		// System.out.println(result);
}
		System.out.println(result);

	}
}