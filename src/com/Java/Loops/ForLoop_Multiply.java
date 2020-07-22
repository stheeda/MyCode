package com.Java.Loops;
import java.util.Scanner;

public class ForLoop_Multiply {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Which number table do you want to compute");
		int tableName = sc.nextInt();
		
		for (int i=1;i<11;i++) {
			int result = tableName * i;
			System.out.println(tableName + " x " + i + " = " + result);
		
		}
	}
}

