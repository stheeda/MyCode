package com.Java.Loops;

public class Category_Example {

	public static void printCategory(String str) {

		int i = 0;
		while (true) {
			int found = str.indexOf("category:", i);
		//	if (found == -1) break;
			int start = found + 9;
			int end = str.indexOf(" ", start);
			System.out.print(str.substring(start, end));
			i = end + 1;
		}
	}

	public static void main(String[] args) {

		String str = "We have a large inventory of things in our warehouse falling in the category: apparel, demanding "
				+ "category: make up ";
				
		
		printCategory(str);
	}

}
