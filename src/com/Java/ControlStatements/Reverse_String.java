package com.Java.ControlStatements;


	// Java program to ReverseString using StringBuilder 
	import java.lang.*; 
	import java.io.*; 
	import java.util.*; 
	  
	// Class of ReverseString 
	class Reverse_String 
	{ 
	    public static void main(String[] args) 
	    { 
	        String input = "This is a Statement"; 
	  
	        StringBuilder input1 = new StringBuilder(); 
	  
	        // append a string into StringBuilder input1 
	        input1.append(input); 
	  
	        // reverse StringBuilder input1 
	        input1 = input1.reverse(); 
	  
	        // print reversed String 
	        System.out.println(input1); 
	    } 
	} 
