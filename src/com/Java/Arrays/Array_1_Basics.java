/*Question 1

Write Java statements that do the following:
a) Declare an array numArray of 15 elements of type int.
b) Output the value of the tenth element of the array alpha.
c) Set the value of the fifth element of the array alpha to 35.
d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
*/
package com.Java.Arrays;

public class Array_1_Basics {

	public static void main(String[] args) {
		
		int[] alpha = new int[15];
		alpha[4]=35;
		System.out.println(alpha[14]);
		System.out.println(alpha[5]);
		System.out.println(alpha[12]);
		
		alpha[8] = alpha[4] + alpha[12];
		System.out.println(alpha[8]);
		
		}
		
	}

