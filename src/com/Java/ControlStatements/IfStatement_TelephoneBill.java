/*Write a program to calculate the monthly telephone bills as per the following rule: 
	Minimum Rs. 200 for up to 100 calls. 
	Plus Rs. 0.60 per call for next 50 calls. 
	Plus Rs. 0.50 per call for next 50 calls. 
	Plus Rs. 0.40 per call for any call beyond 200 calls.
*/

package com.Java.ControlStatements;

import java.util.Scanner;

public class IfStatement_TelephoneBill {

	public static void main(String[] args) {

		int numberOfCalls;
		double bill;

		Scanner calls = new Scanner(System.in);
		System.out.println("Calls this month");
		numberOfCalls = calls.nextInt();

		if (numberOfCalls <= 100) {
			bill = 200;
		} else if (numberOfCalls <= 150) {
			bill = 200 + (numberOfCalls - 100) * 0.60;
		} else if (numberOfCalls <= 200) {
			bill = 200 + 50 * 0.60 + (numberOfCalls - 150) * 0.50;
		} else {
			bill = 200 + 50 * 0.60 + 50 * 0.50 + (numberOfCalls - 200) * 0.40;
		}
		System.out.println("The telephone bill is " + bill);

	}

}
