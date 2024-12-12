package com.test.structural.decorator;

public class CappuccinoDecorator extends BeverageDecorator {
	
	public CappuccinoDecorator(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public double getCost() {
		return super.cost;
	}
	
	@Override 
	public String getDescription() {
		return super.description+ "Cappuccino";
				
	}
}
