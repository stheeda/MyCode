//Write a program to find the factorial value of any number entered through the keyboard. 
//eg 5 ...5x4x3x2x1

package com.Java.Loops_Practise;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the factorial value of: ");
		int num = sc.nextInt();
		int factorial = 1;
		for (int i=num;i>0;i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

}
