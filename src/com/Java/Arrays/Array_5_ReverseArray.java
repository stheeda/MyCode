package com.Java.Arrays;

public class Array_5_ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 7, 8, 2 };
		int len = arr.length;
		System.out.println(len);

		for (int i = len - 1; i >= 0; i--) {
			//if (arr[len - i] < arr[len - 1]) {
				System.out.print(arr[i] + ", ");
			//} else {
			//	System.out.print(arr[i] + ".");
			}
		}

	}

