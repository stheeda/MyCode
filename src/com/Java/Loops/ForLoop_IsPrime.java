package com.Java.Loops;

import java.util.Scanner;

public class ForLoop_IsPrime {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Input a number to find out if it is a Prime number or not");
		int num = obj.nextInt();
		boolean isPrime = true;
		
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				isPrime = false;
				break;
			}
			if(num<2) {
				isPrime = false;
			}
			
		}
		System.out.println("isPrime" + isPrime);
	}
}


