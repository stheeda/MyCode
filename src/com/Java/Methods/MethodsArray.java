package com.Java.Methods;

import java.util.Arrays;

public class MethodsArray {

	public static void main(String[] args) {
		maxvalueArray(new int[] { 3, 4, 6, 3 });
	}
	// Return average of the array

	public static int avgArray(int[] arr) {

		int len = arr.length;
		int sum = 0;

		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}
		int avg = sum / len;
		return avg;
	}

	public static void maxvalueArray(int[] arr) {

		int len = arr.length;
		int max_value = arr[1];
		int min_value = arr[1];

		for (int i = 0; i < len; i++) {
			if (arr[i] > max_value) {
				max_value = arr[i];
			}
			if (arr[i] < min_value) {
				min_value = arr[i];
			}
		}
		System.out.println(max_value + " is the max value in this array");
		System.out.println(min_value + " is the min value in this array");
	}

	public static void oddArraySum(int[] arr) {

		double sum = 0, average = 0;
		int count = 0;

		for (int oddarr : arr) {
			if (oddarr % 2 != 0) {
				count++;
				sum += oddarr;
			}
			if (count > 0) {
				average = sum / count;
			}

		}
		System.out.println(average);

	}

	public static void evenArrayCount(int[] arr) {

		int count = 0;
		int incr = 5;
		for (int element : arr) {
			if (element % 2 == 0) {
				count++;
				incr *= element;
				System.out.println(element + " x 5 is = " + incr);
			}
		}
		System.out.println("The number of even numbers in this array are " + count);

	}

	public static void reverseArray(int[] arr) {
		int len = arr.length;
		int len1 = len;
		int[] arrRev = new int[len];
		for (int i = 0; i < len; i++) {
			arrRev[len1 - 1] = arr[i];
			len1--;
		}

		for (int e : arrRev) {
			System.out.print(e + " ");
		}
	}

}
