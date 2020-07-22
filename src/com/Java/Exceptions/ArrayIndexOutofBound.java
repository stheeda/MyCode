package com.Java.Exceptions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayIndexOutofBound {

	void ArrayExeception(int arr[], int index) {

		try {
			System.out.println(arr[index]);
		} catch (ArrayIndexOutOfBoundsException AE) {
			System.out.println("Check your array boundaries");
		}
	}

	void NumberException(String text) {

		try {
			System.out.println(Integer.parseInt(text));
		} catch (NumberFormatException NE) {
			System.out.println("You argument was not a number");
			System.out.println(NE.toString());
		}
	}

	public static void main(String[] args) {

		ArrayIndexOutofBound A = new ArrayIndexOutofBound();
		A.ArrayExeception(new int[]{2,4,5,2},4);
		A.NumberException("test");
		
	}

}
