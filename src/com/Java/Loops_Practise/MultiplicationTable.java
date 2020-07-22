//Write a program that prompts the user to input a positive integer. 
//It should then print the multiplication table of that number. 


package com.Java.Loops_Practise;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which number table would you like to compute: ");
		int num = sc.nextInt();
		int multiply = 0;
		for(int i=1;i<=10;i++) {
			multiply = num*i;
			System.out.println(num + " x " + i + " = "+ multiply);
		}
		
	}

}
