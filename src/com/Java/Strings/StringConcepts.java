package com.Java.Strings;

public class StringConcepts {

	public static void main(String[] args) {

		String immutable = new String("Durga ");
		immutable.concat("Software"); // as you are not assigning it with any reference variable
		System.out.println("Immutable Output " + immutable);
		//Output: Durga
		
		StringBuffer mutable = new StringBuffer("Durga ");
		mutable.append("Software");
		System.out.println("Mutable Output "+ mutable);
		//Output: Durga Software
		
		String s = new String("Durga");
		String s1 = new String("Durga");
		
		System.out.println(s == s1); // == does reference/address comparison to check if they refer to same object
		//Output:False
		System.out.println(s.equals(s1)); //equals 
		//Ouput: True
		
		
		StringBuffer sb = new StringBuffer("Durga");
		StringBuffer sb1 = new StringBuffer("Durga");
		System.out.println(sb == sb1);
		//Output: False
		System.out.println(sb.equals(sb1));
		//Output: False
		
		
	}

}
