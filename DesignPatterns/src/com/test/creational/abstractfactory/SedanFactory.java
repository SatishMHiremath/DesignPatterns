package com.test.creational.abstractfactory;

public class SedanFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Sedan();
	}
	
}
