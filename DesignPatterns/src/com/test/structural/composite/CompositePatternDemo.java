package com.test.structural.composite;

public class CompositePatternDemo {
	public static void main(String[] args) {
		Composite root = new Composite();
		
		Component leaf1 = new Leaf();
		Component leaf2 = new Leaf();
		
		root.addChild(leaf1);
		root.addChild(leaf2);
		root.operation();
	}
}
