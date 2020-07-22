// Given a number, print a sum of the numbers 
package com.Java.Loops;

import java.util.Scanner;

public class ForLoop_Sumofnumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the sum of the number you wish to find out: ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			sum += i;
		}
		System.out.println(sum);

	}
}

/*
 * int increment = 0;
 * 
 * for (int i = 1; i < 5; i++) { increment = increment + i;
 * System.out.println(increment); // if you sysout inside for loop, it will
 * print value after each iteration } System.out.println(increment);// if you
 * sysout outside for loop, it will print final value of iteration
 */