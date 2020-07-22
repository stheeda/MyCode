// Print the following:
//     		1  
//          2  3  
//        4  5  6  
//      7  8  9  10  
//    11  12  13  14  15  
//  16  17  18  19  20  21  
//22  23  24  25  26  27  28  


package com.Java.Loops;
import java.util.Scanner;

public class NestedForLoop_Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int number = 1;
		
		for (int i=1;i<=size;i++) {
			for (int k=1;k<=size-i;k++) {
				System.out.print("  ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print(number++ + "  ");
				
			}
			System.out.println();
		}
	}

}
