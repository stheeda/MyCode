package com.Java.Loops_Practise;

public class Loop_Demo {

	public static void main(String[] args) {

		int pic = 9;

		for (int i = 1; i <= pic; i++) {
			for (int k = 1; k <= i-1; k++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= pic-i+1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}