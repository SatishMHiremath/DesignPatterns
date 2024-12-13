package com.test.structural.composite;

public class Leaf implements Component {

	private static int val = 1;
	
	@Override
	public void operation() {
		
		System.out.println("Leaf object - "+ val++);
	}
	
}
