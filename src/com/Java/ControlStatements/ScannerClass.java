package com.Java.ControlStatements;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main (String[] args) {
		
		Scanner chai = new Scanner (System.in);
		
		System.out.println("Enter Name");
		String name = chai.next();
		System.out.println("Enter Gender");
		char gender = chai.next().charAt(0);
		
		System.out.println(name + " is " + gender );
		
		
	}

}
