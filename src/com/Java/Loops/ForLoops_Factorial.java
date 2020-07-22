//Java program to print factorial of a number
//Factorial is nothing but multiplying all the lower value number than itself 

package com.Java.Loops;

import java.util.Scanner;

public class ForLoops_Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the factorial of this number: ");
		int factorial = sc.nextInt();
		int result = 1;
		for (int i = factorial; i > 0; i--) {
			result *= i;
			// System.out.println(result);
		}
		System.out.println(result);
	}

}

/*
 * 
 * Scanner input = new Scanner (System.in);
 * System.out.println("Factorial of this number please: "); int factorial =
 * input.nextInt(); int fact=1; for (int i = factorial; i > 1; i--) { fact =
 * fact * i; //System.out.println(fact); } System.out.println(fact); }
 */