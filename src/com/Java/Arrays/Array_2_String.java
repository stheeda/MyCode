/*Question 2

a) Write a statement that declares a string array initialized with the following strings:
"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
b) Write a loop that displays the contents of each element in the array that you declared.
*/

package com.Java.Arrays;

public class Array_2_String {

	public static void main(String[] args) {
		
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for(String d:days){
			System.out.println(d);
		}
		
	}

}
