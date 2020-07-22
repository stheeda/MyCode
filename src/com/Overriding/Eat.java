package com.Overriding;

public class Eat {
	public void feed() {
		System.out.println("Feed me Food");

	}

	public void feeds() {

		System.out.println("Feed");
	}
}

class Goat extends Eat {
	public void feed() {
		System.out.println("Feed me grass");
	}
}

class Lion extends Eat {
	public void feed() {
		System.out.println("Feed me Meat");
	}
}

class Parent {
	public void m1(int... a) {
		System.out.println("Int var-arg");
	}
}

class child extends Parent {
	public void m1(int a) {
		System.out.println("Double var-arg");
	}
}
