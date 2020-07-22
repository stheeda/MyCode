//Write a program to calculate the sum of following series where n is input by user
// 1 + 1/2 + 1/3 + 1/4 + 1/5 +.....1/n	

package com.Java.Loops;
import java.util.Scanner;

public class ForLoop_SumbyFraction {

	public static void main(String[] args) {

		Scanner obj = new Scanner (System.in);
		System.out.println("Input a number: ");
		
		int num = obj.nextInt();
		float result = 0;
		for(float i=1;i<num;i++) {
			result += 1/i;
			System.out.println(result);
			
		}
		System.out.println(result);
	}

}

