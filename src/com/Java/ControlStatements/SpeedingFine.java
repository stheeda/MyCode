/*	/**
	 * You are driving a little too fast, and a police officer stops you. 
	 * Write code to compute the fine you would have to pay. 
	 * If your speed is 60 or less, the result is 0 since there is no fine. 
	 * If speed is between 61 and 80 inclusive, the fine is 100 dollars. 
	 * If speed is 81 or more, the result is 200. 
	 * Unless it is a holiday -- on that day, your speed can be 5 higher in all cases. <br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		speedingFine(60, false)  <b>---></b> 0 <br>
		speedingFine (65, false)   <b>---></b> 100 <br>
		speedingFine (65, true) <b>---></b> 0 <br>
		*/

package com.Java.ControlStatements;

public class SpeedingFine {

	public static int speedingFine(int speed, boolean isHoliday) {
		if (speed > 65 || speed <= 85 && isHoliday == true) {
			return 100;
		}
		if (speed > 85 && isHoliday == true) {
			return 200;
		}
		if (speed <= 65 && isHoliday == true) {
			return 0;
		}
		if (speed > 60 || speed <= 80) {
			return 100;
		}
		if (speed >= 81) {
			return 200;
		} else
			return 0;
	}

	public static int speedingFineV1(int speed, boolean isHoliday) {

		int maxSpeed = 80;
		int minSpeed = 60;
		int fine = 0;

		if (isHoliday) {
			maxSpeed += 5;
			minSpeed += 5;
		}
		if (speed > minSpeed && speed <= maxSpeed)
			fine = 100;
		if (speed >= maxSpeed)
			fine = 200;
		if (speed <= minSpeed)
			fine = 0;

		return fine;

	}

	public static void main(String[] args) {

		System.out.println("The fine you have to pay is " + speedingFineV1(156, true) + "$");

	}

}
