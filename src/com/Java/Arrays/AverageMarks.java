//Allow user to input no of students and their marks, then take an average

package com.Java.Arrays;
import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("How many students in the class?");
		int students = sc.nextInt();
		
		int[] marks = new int[students];
		
		
		//loop to allow user to input the marks 
		for (int i=0;i<students;i++) {
			int x=i+1;
			System.out.println("Input marks of the student no." + x);
			marks[i]=sc.nextInt();
		}
		
		//loop to sum all the marks of the class
		int averageMarks = 0;
		for (int i=0;i<students;i++) {
			averageMarks = averageMarks + marks[i];
		}
		
		averageMarks = averageMarks/students;
		System.out.println("The average marks of this class is " + averageMarks);

	}

}
