package com.Overloading;

public class StringvsObject {
	
	public void m1(Object o) {
		System.out.println("Object Version");
	}
	
	public void m1(String s) {
		System.out.println("String version");
	}
	
	public static void main(String[] args) {
		
		StringvsObject OS = new StringvsObject();
		OS.m1(new Object());
		OS.m1("String");
		OS.m1(null);//String gets the priority
	}

}


