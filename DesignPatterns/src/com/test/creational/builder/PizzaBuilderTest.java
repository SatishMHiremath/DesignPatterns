package com.test.creational.builder;

public class PizzaBuilderTest {
	public static void main(String[] args) {
		
		Pizza pizza = new PizzaBuilder().withCheese(Cheese.AMERICAN).withCrust(Crust.THIN).withTopping(Topping.FARMHOUSE).withSize(Size.REGULAR).build();
		System.out.println("Pizza Cost : ");
		double totalCost  = pizza.getCheese().getCost()+pizza.getTopping().getCost()+pizza.getSize().getCost()+pizza.getCrust().getCost();
		System.out.println(Cheese.AMERICAN+" : "+pizza.getCheese().getCost());
		System.out.println(Topping.FARMHOUSE+" : "+pizza.getTopping().getCost());
		System.out.println(Size.REGULAR+" : "+pizza.getSize().getCost());
		System.out.println(Crust.THIN+" : "+pizza.getCrust().getCost());
		System.out.println("Total Cost : "+pizza.addToPrice(totalCost));
	}
}
