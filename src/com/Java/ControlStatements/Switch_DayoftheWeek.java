package com.Java.ControlStatements;
import java.util.Scanner;

public class Switch_DayoftheWeek {

	public static void main(String[] args) {

		Scanner d = new Scanner (System.in);
		System.out.println("Input the day of the week");
		int day = d.nextInt();
		
		switch(day) {
		
		case 7: 
			System.out.println("Today is Sunday");
			break;
		
		case 6: System.out.println("Today is Saturday "); break;
		case 8: System.out.println("Today is Public Holiday"); break;
		case 5: System.out.println("Today is Friday"); break;
		default: System.out.println("Today is Weekday");break;
		
		}
	}

}
