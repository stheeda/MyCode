package com.Overloading;

public class StringOverload {

	public void m1(String s) {
		System.out.println("String Version");
	}

	public void m1(StringBuffer sb) {
		System.out.println("String Buffer Version");
	}

	public static void main(String[] args) {
		
		StringOverload S = new StringOverload();
		
		S.m1("String");
		S.m1(new StringBuffer("String Buffer"));
		//S.m1(null); As string and string buffer both are child classes of Object there is conflict hence CE error

	}
}
