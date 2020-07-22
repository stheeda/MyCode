package com.Java.ControlStatements;

import java.util.Scanner;

public class IfStatement_Football_AwayGame {

	public static void main(String[] args) {

		int goalsHomeBarc;
		int goalsAwayBarc;
		int goalsHomeMad;
		int goalsAwayMad;

		Scanner win = new Scanner(System.in);

		goalsHomeBarc = win.nextInt();
		goalsAwayBarc = win.nextInt();
		goalsHomeMad = win.nextInt();
		goalsAwayMad = win.nextInt();

		int totalgoalsMad = goalsHomeMad + goalsAwayMad;
		int totalgoalsBarc = goalsHomeBarc + goalsAwayBarc;

		if (totalgoalsMad == totalgoalsBarc) {
			goalsAwayBarc *= 2;
			goalsAwayMad *= 2;
		}
		totalgoalsMad = goalsHomeMad + goalsAwayMad;
		totalgoalsBarc = goalsHomeBarc + goalsAwayBarc;

		System.out.println("The overall result is :");
		System.out.println("Barcelona " + totalgoalsBarc + " - Madrid " + totalgoalsMad);

		if (totalgoalsMad > totalgoalsBarc) {
			System.out.println("Madrid won the tournament");
		} else if (totalgoalsBarc > totalgoalsMad) {
			System.out.println("Barcelona won the tournament");
		} else {
			System.out.println("Its a draw..Let's go for Penalties");
		}
	}

}
