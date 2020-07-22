/*The variable list1 and list2 are reference arrays that each have 5 elements. 
Write code that copies the values in list1 to list2. 
Values in list1 are input by user.*/

package com.Java.Arrays;
import java.util.Scanner;

public class Array_4_CopyArray {

	public static void main(String[] args) {
		
		final int SIZE=5;
		int[] arr1=new int[SIZE];
		int[] arr2=new int[SIZE];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + SIZE + " values");
		for(int i=0;i<SIZE;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<SIZE;i++) {
			arr2[i] = arr1[i];
		}
		
		for(int pArray:arr2) {
			System.out.print(pArray+", ");
		}
		

	}

}
