//Java program to allow user to input marks for each student, then take average of these marks 

package com.Java.Arrays;

import java.util.Scanner;

public class Array_AvgMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of students in class 10B: ");
		int num = sc.nextInt();

		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			int x = i + 1;
			System.out.println("Input the marks of student number " + x);
			a[i] = sc.nextInt();
		}

		int averageMarks = 0;

		for (int j = 0; j < num; j++) {
			averageMarks += a[j];
		}

		averageMarks /= num;
		System.out.println("The average marks of class 10B is " + averageMarks);
	}

}
