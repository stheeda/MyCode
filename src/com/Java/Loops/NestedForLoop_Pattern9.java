// Print the following:
//     	3
// * 
// *  * 
// *  *  * 
// *  * 
// * 

package com.Java.Loops;

import java.util.Scanner;

public class NestedForLoop_Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(" * ");

		for (int k = 2; k <= n - 1; k++) {
			System.out.print(" * ");
			for (int j = 1; j <= k - 2; j++) {
				System.out.print("  ");
			}
			System.out.println("*");
			
		}
		for (int i = 1; i <= n-1; i++) {
			System.out.print(" * ");
		}
	}
}
