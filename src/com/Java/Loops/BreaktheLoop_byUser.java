package com.Java.Loops;
import java.util.Scanner;

public class BreaktheLoop_byUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("Input a number");
			int input = sc.nextInt();
			System.out.println(input);
			if (input<0) {
				break;
		}
		
		}
	}

}
