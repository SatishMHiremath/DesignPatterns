package com.test.structural.decorator;

public class CappuccinoDecorator extends BeverageDecorator {
	
	public CappuccinoDecorator(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public double getCost() {
		return super.getCost()+0.50;
	}
	
	@Override 
	public String getDescription() {
		return super.getDescription()+ "and cost of Cappuccino is";
				
	}
}
