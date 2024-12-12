package com.test.structural.decorator;

public class Cappuccino implements Beverage {

	@Override
	public double getCost() {
		return 130.0;
	}

	@Override
	public String getDescription() {
		return "Cappuccino is my favourite coffee every day";
	}
	
}
