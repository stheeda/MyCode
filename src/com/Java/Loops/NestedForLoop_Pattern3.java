////Draw this pattern
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

package com.Java.Loops;

import java.util.Scanner;

public class NestedForLoop_Pattern3 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Input the pattern size high to low: ");

		int num = obj.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
