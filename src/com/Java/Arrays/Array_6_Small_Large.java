package com.Java.Arrays;

public class Array_6_Small_Large {

	public static void main(String[] args) {

		int[] arr = { -9, -8, -99, 323, 453, 87899, 7488, 234, 22, 0, 1, 3, 5, 8, 9, 2, 3, 5 };
		int smallArray = arr[0];
		int largeArray = arr[0];
		int len = arr.length;

		for (int i = 1; i < len; i++) {
			if (arr[i] < smallArray) {
				smallArray = arr[i];
			}
			else if (arr[i] > largeArray) {
				largeArray = arr[i];
			}
		}

		for (int e : arr) {
			System.out.print(e + "   ");
		}
		
		System.out.println("\nLargest value in the array is " + largeArray);
		System.out.println("Smallest value in the array is " + smallArray);
	}
}
