package com.Java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateListSixWays {
	
	public static void main(String[] args) {
		
		List<String> tvseries = new ArrayList<>();
		tvseries.add("24");
		tvseries.add("Prison Break");
		tvseries.add("Breaking Bad");
		tvseries.add("Inbetweeners");
		tvseries.add("Friday Night Dinner");
		tvseries.add("Fawlty Towers");
		
		//1) Iterate using lambda expression
		System.out.println("**** Using Lambda Expression");
		tvseries.forEach(shows -> { System.out.println(shows);});
		
		//2) Using Iterator
		System.out.println("**** Using Iterator"+"\n");
		Iterator<String> it = tvseries.iterator();
		
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
			
		//3) Using Iterator and Java 8 lambda and forEachRemainding() method
			
		it = tvseries.iterator();
		it.forEachRemaining(show -> {System.out.println(show);});
		
		//4) 
		
		}
	}

}
