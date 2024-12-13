package com.test.structural.decorator;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Beverage beverage = new Cappuccino();
		beverage = new CappuccinoDecorator(beverage);
		System.out.println(beverage.getDescription()+ " $"+beverage.getCost());
	}
}
