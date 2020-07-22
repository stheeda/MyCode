package com.Java.Loops;

import java.util.Scanner;

public class ForLoop_Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fib = sc.nextInt();
		int a = 0;
		int b = 1;

		System.out.print(a + " ");
		System.out.print(b + " ");

		for (int i = 0; i < fib - 2; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}

	}
}
