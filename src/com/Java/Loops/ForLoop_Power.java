package com.Java.Loops;

import java.util.Scanner;

public class ForLoop_Power {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int num = obj.nextInt();
		int squ = obj.nextInt();
		int result = 1;
		for (int i = 0; i <= squ; i++) {
			result = result * num;
			System.out.println(result);
		}
		System.out.println(result);

	}

}
