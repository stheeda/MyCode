/*Write a program that creates an array of 10 elements size. 
Your program should prompt the user to input numbers in array 
and then display the sum of all array elements.	*/

package com.Java.Arrays;
import java.util.Scanner;

public class Array_3_Declare_Sum_Array {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int len = arr.length;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		int num=len;
		
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<len;i++) {
			sum+=arr[i];
			System.out.println(sum);
		}
		System.out.println(sum);
		
	}

}
