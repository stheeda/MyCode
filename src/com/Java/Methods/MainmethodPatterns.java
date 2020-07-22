//Allower user to give 2 inputs, one input to refer to which pattern it needs to print 
// and other input to decide on the size of that pattern

package com.Java.Methods;

import java.util.Scanner;

public class MainmethodPatterns {

	public static void main(String[] args) {
		print(2);
		int c = MethodsArray.avgArray(new int[] { 3, 4, 5, 2, 3, 98, 27, 21 });
		System.out.println("The average of this array is: " + c);
	}

	public static void print(int maxAttempts) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number between 1 and 4: ");
		int pattern = sc.nextInt();
		int count = 0;
		while (!isValidInput(pattern)) {
			if (count == maxAttempts) {
				System.out.println("Last attempt, please input range between 1 and 4 only");
			} else if (count > maxAttempts) {
				System.out.println("You are a robot");
				System.exit(0);
			} else {
				System.out.println("Pattern is out of range, input between 1 and 4 only");
			}

			pattern = sc.nextInt();
			count++;
		}

		System.out.println("Input a number between 4-20: ");
		int size = sc.nextInt();

		if (pattern == 1) {
			UtilPatterns.patterLeftTriangle(size);
		} else if (pattern == 2) {
			UtilPatterns.patternLeftInverseTriangle(size);
		} else if (pattern == 3) {
			UtilPatterns.patternInverseRightTriangle(size);
		} else if (pattern == 4) {
			UtilPatterns.patternRightTriangle(size);
		} else {
			System.out.println("Your request is out of scope");
		}
	}

	private static boolean isValidInput(int pattern) {
		return pattern >= 1 && pattern <= 4;
	}
}
