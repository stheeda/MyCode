package com.Java.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ALvsLL {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();
		LinkedList<Integer> ll1 = new LinkedList<>();

		getTimeDifference(ll);
		getTimeDifference(al);
		

	}

	static void getTimeDifference(List<Integer> list) {

		long start = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() + "==>" + (end - start));

	}

}
