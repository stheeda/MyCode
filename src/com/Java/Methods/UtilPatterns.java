package com.Java.Methods;

public class UtilPatterns {

	public static void main(String[] args) {
		// patterLeftTriangle(5);
		// patternLeftInverseTriangle(5);
		// patternRightTriangle(5);
		patternInverseRightTriangle(5);
	}

	public static void patterLeftTriangle(int a) {

		for (int i = 0; i < a; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void patternLeftInverseTriangle(int a) {

		for (int i = 0; i < a; i++) {
			for (int k = i; k < a; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

	public static void patternRightTriangle(int a) {

		for (int i = 1; i <= a; i++) {
			for (int k = 1; k <= a - i + 1; k++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void patternInverseRightTriangle(int a) {

		for (int i = 1; i <= a; i++) {
			for (int k = 1; k <= i - 1; k++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= a - i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
