package com.Durga.OOPS;

public class App {

	public static void main(String[] args) {
		
		//P p = new P();
		Plant p1 = new Plant();
		
		// C c = new C()
		Tree tree = new Tree();
		
		//P p = new C()
		Plant p2 = tree;
		
		Plant p3 = new Tree();
		
		
		p3.grow();
		p1.grow();
		
		Tree dcast = (Tree) p1;
		dcast.shedleaves();
		
	}
	
	public static void doGrow(Plant p) {
		p.grow();
	}
	

}
