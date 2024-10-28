package com.test.creational.builder;

public class Pizza {
	
	private double totalPrice;
	private Size size;
	private Crust crust;
	private Cheese cheese;
	private Topping topping;

	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Crust getCrust() {
		return crust;
	}
	public void setCrust(Crust crust) {
		this.crust = crust;
	}
	public Cheese getCheese() {
		return cheese;
	}
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
	public Topping getTopping() {
		return topping;
	}
	public void setTopping(Topping topping) {
		this.topping = topping;
	}
	public double addToPrice(double additionalCost) {
		return totalPrice+additionalCost;
	}
		
}
