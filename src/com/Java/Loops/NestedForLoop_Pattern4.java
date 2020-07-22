//Draw this pattern
//* * * * * 
//  * * * * 
//    * * * 
//      * * 
//        * 



package com.Java.Loops;

import java.util.Scanner;

public class NestedForLoop_Pattern4 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Input the pattern size high to low: ");

		int input = obj.nextInt();

		for (int i = 1; i <= input; i++) {

			for (int j = 1; j <= i-1 ; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= input - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}
