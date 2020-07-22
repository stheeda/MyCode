package com.Java.Loops_Practise;

import java.util.Scanner;

public class Array_Sum {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// System.out.println("How many numbers?");
		// int num = sc.nextInt();

		int[] arrA = { 3, 4, 7, 9, 0 };
		int[] arrB = new int[5];
		int len = arrA.length;
		System.out.println(len);
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(arrA[i]+"\n");
		}
		for (int i = 0; i < 5; i++) {
			arrB[i] = arrA[i];
		}
		for (int c : arrA) {
			System.out.print(c + " ");
		}

	}

}
