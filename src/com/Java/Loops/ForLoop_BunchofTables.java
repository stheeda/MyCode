package com.Java.Loops;

public class ForLoop_BunchofTables {

	public static void main(String[] args) {

		for (int j = 2; j < 21; j++) {
			for (int i = 1; i < 11; i++) {
				int table = j * i;
				System.out.println(j + " x " + i + " = " + table);
			}
			System.out.println();
		}
	}

}
