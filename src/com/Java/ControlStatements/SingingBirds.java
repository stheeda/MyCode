/* /**
	The birds in Florida like to sing during favorable temperatures. 
	In particular, they sing if the temperature is between 60 and 90 (inclusive). 
	Unless it is summer, then the upper limit is 100 instead of 90. 
	Given an int temperature and a boolean isSummer, 
	return true if the birds are singing and false otherwise. <br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		birdsSinging(70, false)   <b>---></b> true <br>
		birdsSinging(95, false)    <b>---></b> false <br>
		birdsSinging(95, true) <b>---></b> true <br>
	 */

package com.Java.ControlStatements;

public class SingingBirds {

	public static boolean isSinging(int temp, boolean isSummer) {

		if (isSummer) {
			return (temp >= 60 && temp <= 100);
		} else
			return (temp >= 60 && temp <= 90);
	}

	public static boolean isSingingV1(int temp, boolean isSummer) {

		return (isSummer) ? (temp >= 60 && temp <= 100) : (temp >= 60 && temp <= 90);
	}

	public static void main(String[] args) {
		
		System.out.println(isSinging(95,true));
		System.out.println(isSingingV1(95,true));

	}

}
