package com.Overloading;

public class Test {

	public void m1(Animal A) {
		System.out.println("Animal Version");
	}

	public void m1(Monkey M) {
		System.out.println("Monkey Version");
	}

	public static void main(String[] args) {

		Test T1 = new Test();

		Animal A = new Animal();
		T1.m1(A);

		Monkey M = new Monkey();
		T1.m1(M);

		Animal A1 = new Monkey();
		T1.m1(A1);

	}

}
