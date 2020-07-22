package com.Java.ControlStatements;

import java.util.Scanner;

public class Ifstatement_Markscalculator {

	public static void main(String[] args) {

		int Biology, Physics, Chemistry, Sanskrit, English;
		double grade;
		Scanner obj = new Scanner(System.in);
		System.out.println("Marks scored in Biology");
		Biology = obj.nextInt();
		System.out.println("Marks scored in Physics");
		Physics = obj.nextInt();
		System.out.println("Marks scored in Chemistry");
		Chemistry = obj.nextInt();
		System.out.println("Marks scored in Sanskrit");
		Sanskrit = obj.nextInt();
		System.out.println("Marks scored in English");
		English = obj.nextInt();

		grade = (Biology + Physics + Chemistry + Sanskrit + English) / 5;

		if (grade >= 90) {
			System.out.println("Your grade is A");
		} else if (grade >= 80) {
			System.out.println("Your grade is B");
		} else if (grade >= 70) {
			System.out.println("Your grade is C");
		} else if (grade >= 60) {
			System.out.println("Your grade is D");
		} else if (grade >= 50) {
			System.out.println("Your grade is E");
		} else {
			System.out.println("Your grade is B");
		}

	}

}
