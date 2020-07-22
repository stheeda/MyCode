package com.Overloading;

public class FloatInt {

	public void m1(float f, int i) {
		System.out.println("Float-Int Method Implemented");
	}

	public void m1(int i, float f) {
		System.out.println("Int-Float Method Implemented");
	}

	public static void main(String[] args) {

		FloatInt f = new FloatInt();
				
		f.m1(4.0f, 5);
		f.m1(5, 4f);
		// f.m1(1, 1); Java wont promote 1 to 1.0f in this case due to ambiguity
		// f.m1(1.0, 1);

		
			
	}

}
