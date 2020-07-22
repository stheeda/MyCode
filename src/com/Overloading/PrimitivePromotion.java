package com.Overloading;

public class PrimitivePromotion {
	
	public void m1() {
		System.out.println("No argument");
	}
	
	public void m1(int a) {
		System.out.println("Print integer value " + a);
	}
	
	public void m1 (float b) {
		System.out.println("Print double value " + b);
	}
	
	public static void main(String[] args) {
		
		PrimitivePromotion m = new PrimitivePromotion();
		m.m1();
		m.m1(3);
		m.m1(3.0f);
		m.m1(10f);
	}

}

