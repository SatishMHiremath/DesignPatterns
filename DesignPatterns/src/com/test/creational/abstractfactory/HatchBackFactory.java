package com.test.creational.abstractfactory;

public class HatchBackFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new HatchBack();
	}
}
