//Java program to input sum of numbers;
package com.Java.Arrays;
import java.util.Scanner;

public class Array_Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to input: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		
		for(int i=0;i<num;i++) {
			int x = i+1;
			System.out.println("Input Number" + x);
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		for (int i=0;i<num;i++) {
		sum += arr[i];	
		}
		System.out.println(sum);
	}

}
