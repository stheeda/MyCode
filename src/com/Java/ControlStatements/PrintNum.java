package com.Java.ControlStatements;

class PrintNum {

	public static void show(int num) {
		System.out.println("2. The value is :" + num);
		num = 9;
		System.out.println("3. The value is :" + num);
	}

	public static void show(Person obj) {

		System.out.println("Print Statement 2" + obj);
		obj.setName("Sasank Theeda");
		obj = new Person("Theeda");
		System.out.println("Print Statement 3" + obj);

	}

	public static void main(String[] args) {

		int value = 7;
		System.out.println("1. The value is :" + value);
		show(value);
		System.out.println("4. The value is :" + value);

		Person p = new Person("Sasank");
		System.out.println("Print Statement 1" + p);

		PrintNum.show(p);

		System.out.println("Print Statement 4" + p);
	}
}
