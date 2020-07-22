//Write a program to calculate the sum of first 10 natural number.

package com.Java.Loops_Practise;

public class SumofNumbers {

	public static void main(String[] args) {
		
		int x=10;
		int sum=0;
		for(int i=0;i<=x;i++) {
			sum +=i;
		}
			System.out.println("The sum of the numbers 1 to 10 is: "+ sum);
	}

}
