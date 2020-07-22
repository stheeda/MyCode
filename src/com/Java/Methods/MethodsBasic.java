package com.Java.Methods;

public class MethodsBasic {

	public static void main(String[] args) {

		String print = MyUtils.printJava("Java learning");
		System.out.println(print);
		MyUtils.printJava(12);
		MyUtils.addten(35);
		int n = MyUtils.addten(25);
		System.out.println(n);
		MyUtils.sumnum(5, 10);
	}
}
