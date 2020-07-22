package com.Java.Strings;

public class StringExtractMiddle {
	
	public static String middleThree(String str) {
		int len = str.length();
		int midIdx = len/2;
		String result = str.substring(midIdx-1,midIdx+2);
		return result;
	}

	public static void main(String[] args) {

		String S = middleThree("Sasank");
		System.out.println(S);
		
		String immutable = new String("Durga ");
		immutable.concat("Software"); // as you are not assigning it with any reference variable
		System.out.println(immutable);
		//Output: Durga
		
		immutable = "Durga Software";
		System.out.println(immutable);
		
		StringBuffer mutable = new StringBuffer("Durga ");
		mutable.append("Software");
		System.out.println(mutable);
		//Output: Durga Software
		
	}

}
