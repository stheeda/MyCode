package com.Java.Enums;

public class EConstructor {

	public static void main(String[] args) {
		Cars[] c = Cars.values();
		for(Cars c1:c) {
			
			System.out.println(c1 + " " + c1.getPrice());
			
		}
		
		boolean b = Cars.Bentley.ordinal() > Cars.BMW.ordinal()?true:false;
		System.out.println(b);
	}
}

enum Cars {
	Bentley(30000), BMW(21000), Benz;
	int price;

	void Wheels() {
		System.out.println("4 Wheelers");
	}

	Cars() {
		this.price = 4000;
	}

	Cars(int value) {
		this.price = value;
	}

	public int getPrice() {
		return price;
	}
}
