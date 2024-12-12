package com.test.creational.abstractfactory;

public class AbstractFactoryExample {
	public static void main(String[] args) {
		CarFactory carFactory = new SedanFactory();
		Car sedanCar = carFactory.createCar();
		sedanCar.drive();
		
		CarFactory hatchBackfactory = new HatchBackFactory();
		Car hatchBackCar = hatchBackfactory.createCar();
		hatchBackCar.drive();
	}
}
