//We have a loud barking dog. The "hour" parameter is current hour time in the range 0 to 23. 
//We are in trouble if the dog is barking and the hour is before 7 or after 20. Return true if we are in trouble. 

package com.Java.ControlStatements;

public class BarkingDog_Exercise {

	public static boolean barkingDog(boolean barking, int time) {

		if (barking) {
			if (time < 7 || time > 20) {
				return true;
			} else
				return false;

		} else {
			return false;
		}
	}

	public static boolean barkingDogFemale(boolean barking, int time) {

		return (barking && (time < 7 || time > 20));
	}

	public static void main(String[] args) {
		
			
		System.out.println(barkingDog(false,8));
		System.out.println(barkingDogFemale(true,11));

	}

}
