package com.Java.ControlStatements;
import java.util.Scanner;

public class Ifstatement_ShopDiscount {

	public static void main(String[] args) {

		int price, quantity, revenue, discount;
		
		Scanner shop = new Scanner(System.in);
		System.out.println("Enter the product price:");
		price = shop.nextInt();
		System.out.println("Enter the quantity required");
		quantity = shop.nextInt();
		revenue = price*quantity;
		
		if(revenue>5000) {
			
			discount = revenue * 10 / 100;
			revenue = revenue - discount;
			
			System.out.println("The discount applied on the bill is " + discount);
			System.out.println("The final bill after discount is " + revenue);
		}
		
	
	}

}
