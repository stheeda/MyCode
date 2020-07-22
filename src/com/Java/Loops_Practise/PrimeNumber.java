//Write a program that prompts the user to input a positive integer. 
//It should then output a message indicating whether the number is a prime number. 

package com.Java.Loops_Practise;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and check if it is a prime number: ");
		int num = sc.nextInt();
		boolean isPrime = true;
		
		for(int i=2;i<num;i++) {
			if(num/2==0) {
				isPrime = false;
				break;
			}
			if (num<2) {
				isPrime = false;
				break;
			}
		}
		System.out.println("IsPrime" + isPrime);
	}

}
