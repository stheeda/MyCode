package com.Java.Loops;
import java.util.Scanner;

public class WhileLoop_SumofDigits {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(temp>0) {
			
			int lastDigit = temp % 10;
			temp /=10; // temp = temp / 10
			sum += lastDigit; // sum = sum + lastDigit
			System.out.println(lastDigit+ " " + temp + " " + sum);
		}
		System.out.println("The sum of digits of " + n + " is " + sum);
	}

}
