// Print the following:
//     	3
// * 
// *  * 
// *  *  * 
// *  * 
// * 

package com.Java.Loops;

import java.util.Scanner;

public class NestedForLoop_Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int rows = 2 * size - 1;

		for (int i = 1; i <= rows; i++) {

			if (i <= size) {
				for (int k = 1; k <= i; k++) {
					System.out.print(" * ");
				}
			} else {
				for (int k = 1; k <= rows - i + 1; k++) {

					System.out.print(" * ");
				}
			}
			System.out.println();
		}

		

	}
}
