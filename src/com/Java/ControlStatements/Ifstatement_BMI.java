package com.Java.ControlStatements;

import java.util.Scanner;

public class Ifstatement_BMI {
	static String category;	
	@SuppressWarnings("resource")
	public static void main (String[] args) {
		/*int mass;
		double height;
		double formula = mass / (height * height);
	*/
	
	Scanner Weight = new Scanner(System.in);
	System.out.println("Enter Weight");
	int mass = Weight.nextInt();
	System.out.println("Enter Height");
	double height = Weight.nextDouble();
	float BMI = (float) (mass / (height * height));
	System.out.println(BMI);
	
	
	if (BMI < 18) {
		System.out.println("Underweight"); 
		}
	else if (BMI <25) {
		System.out.println("Ideal Weight"); 
	}
	else if (BMI >= 25 && BMI <=33) {
		System.out.println("\nObese"); 
	}
	else {
		System.out.println("Morbidly Obese");
	}
	}
	

}
