package com.Java.ControlStatements;

public class Person {

		String name;

		// Constructor
		public Person(String thename) {
			this.name = thename;
		}

	// GetMethod

	public String getName(String name) {
		return name;
	}

		// SetMethod

		public void setName(String name) {
			this.name = name;
		}
		
		public String toString() {
			return "Person's name is " + name;
		}

	}
