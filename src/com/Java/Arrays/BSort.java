package com.Java.Arrays;

public class BSort {

	public static void main(String[] args) {

		boolean isSwapped = false;

		int[] arr = { 7, 2, 1, 4, 0, 6, 3, 5 };
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {

			for (int k = 0; k < len - i - 1; k++) {
				int lhs = arr[k];
				int rhs = arr[k + 1];
				if (lhs > rhs) {
					int temp = rhs;
					rhs = lhs;
					lhs = temp;
					isSwapped = true;
				}
				System.out.println("iteration of i " + i + "  "+ "Iteration of k " +  k);

			}
		}
	}
}
