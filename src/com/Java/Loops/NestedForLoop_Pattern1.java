package com.Java.Loops;
import java.util.Scanner;

public class NestedForLoop_Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Input what size of the box you need e.g 4 x 4 ");
		int input = sc.nextInt();
		
		for (int j = 1; j <= input; j++) {
			for (int i = 1; i <= input; i++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}