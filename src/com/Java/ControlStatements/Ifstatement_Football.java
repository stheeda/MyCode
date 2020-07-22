package com.Java.ControlStatements;

import java.util.Scanner;

public class Ifstatement_Football {

	public static void main(String[] args) {

		int goalsBarc;
		int goalsMadr;

		Scanner obj = new Scanner(System.in);
		System.out.println("Goals Scored by Barcelona");
		goalsBarc = obj.nextInt();
		System.out.println("Goals Scored by Madrid");
		goalsMadr = obj.nextInt();

		System.out.println("\nThe result of the match is:\n");
		System.out.println("Barcelona " + goalsBarc + " - " + "Madrid " + goalsMadr);

		if (goalsBarc > goalsMadr) {
			System.out.println("Barcelona won the match");
		} else if (goalsBarc < goalsMadr) {
			System.out.println("Madrid won the match");
		} else{
			System.out.println("Match is tied");
		}
		
		if (goalsBarc - goalsMadr > 3) {
			System.out.println("What a match by Barcelona players");
		}
			else {System.out.println("What a match by Madrid players");
		}

	}

}
