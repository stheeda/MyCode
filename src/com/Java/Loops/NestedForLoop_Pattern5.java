////Draw this pattern
//
//              *
//            * *
//          * * *
//        * * * * 
//      * * * * * 
//    * * * * * *  

package com.Java.Loops;
import java.util.Scanner;

public class NestedForLoop_Pattern5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		for (int i=1;i<=size;i++) {
			for (int j=1;j<=size-i+1;j++) {
				System.out.print("  ");
			}
			for (int j=0;j<=i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
