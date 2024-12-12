package com.test.structural.decorator;

public abstract class BeverageDecorator {

	private Beverage beverage;
	double cost;
	String description;
	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public abstract double getCost();

	public abstract String getDescription();
	
}
