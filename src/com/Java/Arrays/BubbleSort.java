package com.Java.Arrays;

public class BubbleSort {

	static boolean isSwapped = false;
	

	static void sort() {
	
		int[] arr = { 7, 2, 1, 4, 0, 6, 3, 5 };
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {

			for (int k = 0; k < len - i - 1; k++) {
				swap(arr, k);
			}
			System.out.println("iteration is: " + i);

			if (!isSwapped) {

				for (int c : arr) {
					System.out.print(c + " ");
				}
				return;
			}
		}
	}
	private static void swap(int[] arr, int k) {

		int lhs = arr[k];
		int rhs = arr[k + 1];
		if (lhs > rhs) {
			int temp = rhs;
			rhs = lhs;
			lhs = temp;
			isSwapped = true;
		}
	}
	public static void main(String[] args) {
		sort();
	}
}
