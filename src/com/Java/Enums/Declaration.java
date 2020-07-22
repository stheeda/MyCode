package com.Java.Enums;

import java.util.Arrays;

public class Declaration {

	public static void main(String[] args) {

		Beer[] range = Beer.values(); // values methods lists out all the values in an ENUM
		// System.out.println(Arrays.toString(range));
		for (Beer b2 : range) {
			System.out.println(b2 + " index is " + b2.ordinal());
		}

		Beer b = Beer.Budweiser;

		switch (b) {

		case Budweiser:
			System.out.println(Beer.Budweiser + " is " + "The King of Beers");
			return;

		case Hoegaarden:
			System.out.println("Best Wheat Beer");
			return;

		case Kronenberg:
			System.out.println("Bargain Beer");
			return;

		default:
			System.out.println("Other brands are not available");
		}
	}
}

enum Beer {

	Budweiser, Hoegaarden, Kronenberg,
}
