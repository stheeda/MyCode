//Draw this pattern
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 



package com.Java.Loops;

import java.util.Scanner;

public class NestedForLoop_Pattern2 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Input the pattern size low to high: ");
		
		int size = obj.nextInt();
		for (int i=1;i<=size;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

