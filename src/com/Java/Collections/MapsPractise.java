package com.Java.Collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

class Employee {

	String Name;
	int Membership;
	String Accesslevel;

	Employee(String Name, int Membership, String Accesslevel) {
		this.Name = Name;
		this.Membership = Membership;
		this.Accesslevel = Accesslevel;
	}
}

public class MapsPractise {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "April");
		hm.put(2, "May");
		hm.put(3, "June");
		hm.put(4, "July");

		for (Entry<Integer, String> e : hm.entrySet()) {
			//System.out.println(e.getKey() + " " + e.getValue());

			HashMap<Integer, Employee> hm1 = new HashMap<>();

			Employee e1 = new Employee("Rob", 2, "Gold");
			Employee e2 = new Employee("Jesse", 3, "Platinum");
			Employee e3 = new Employee("Pinkman", 1, "Silver");

			hm1.put(1, e1);
			hm1.put(2, e2);
			hm1.put(3, e3);
			

			// Traverse the Hashmap

			for (Entry<Integer, Employee> printemp : hm1.entrySet()) {

				int key = printemp.getKey();
				Employee e11 = printemp.getValue();
				System.out.println(key + "Info");
				//System.out.println(e11.Name + " " + e11.Membership + " " + e11.Accesslevel);
			}

		}

	}
}
