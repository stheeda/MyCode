package com.Java.ControlStatements;

import java.util.Scanner;

/*Write a program that asks the user to enter a number and 
  displays whether entered number is an odd number or even number.
  */

public class Ifstatement_EvenorOdd {
	
	public static void main (String[] args) {
		
		int number;
		System.out.println("Input a number to verify if it is even or odd:");
		Scanner num = new Scanner(System.in);
		number = num.nextInt();
		
		if(number%2==0)
		{
			System.out.println(number + " is an even number");
		}
		else {System.out.println(number + " is an odd number");
		
		}
	}
	

}
