/*Write a program that asks the user to enter a number and 
 * displays the absolute value of that number.
 */

package com.Java.ControlStatements;

import java.util.Scanner;

public class Ifstatement_AbsValue {

	public static void main(String[] args) {

		int abs;
		Scanner num = new Scanner(System.in);
		System.out.println("Input a negative number");

		abs = num.nextInt();
		if (abs < 0) {
			abs = -abs;
			System.out.println(abs);
		} else {
			System.out.println(abs + " is already an absolute value");
		}
	}

}
