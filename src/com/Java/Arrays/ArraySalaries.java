//Java Program to input the salaries

package com.Java.Arrays;
import java.util.Scanner;

public class ArraySalaries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the Number of Employees:");
		int emp = sc.nextInt();
		int[] sal = new int[emp];
		
		for (int i=0;i<emp;i++) {
			System.out.println("Input the salaries: ");
			sal[i]=sc.nextInt();
		}
		for (int i=0;i<emp;i++) {
			System.out.print(sal[i] + ", " );
		}
		System.out.println();
		
	}

}
