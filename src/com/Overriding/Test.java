package com.Overriding;

public class Test {
		public static void main(String[] args) {

			Eat e = new Eat();
			e.feed();

			Goat g = new Goat();
			g.feed();

			Lion l = new Lion();
			l.feed();
			
			Eat e1 = new Lion();
			e1.feed();
			e1.feeds();
			
			Goat g1 = new Goat();
			g1.feed();
			
			Parent p = new Parent(); // var-arg argument 
			p.m1(10);
			
			child c = new child(); // int argument implemented 
			c.m1(10);
			
			Parent p1 = new child(); // var- arg argument implemented as method resolution done by Reference type
			p1.m1(10);

		}
	}

