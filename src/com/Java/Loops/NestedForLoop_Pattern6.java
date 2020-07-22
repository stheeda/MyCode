package com.Java.Loops;
import java.util.Scanner;

public class NestedForLoop_Pattern6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int input = sc.nextInt();
		
		for (int i=1;i<=input;i++) {
			for (int k=1;k<=input-i;k++) {
				System.out.print("  ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
