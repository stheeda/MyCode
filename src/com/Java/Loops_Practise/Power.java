//Two numbers are entered through the keyboard. 
//Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

package com.Java.Loops_Practise;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Find out the power of number: ");
		int num1 = sc.nextInt();
		System.out.println("Compute the power by: ");
		int num2 = sc.nextInt();
		
		int result = 1;
		
		for (int i=1;i<num2;i++) {
			result *= num1;
		}
		System.out.println("\n"+result);
				
	}

}
