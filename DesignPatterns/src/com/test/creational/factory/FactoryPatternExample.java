package com.test.creational.factory;

public class FactoryPatternExample {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.createCar("Sedan");
        Car car2 = carFactory.createCar("SUV");
        Car car3 = carFactory.createCar("Hatchback");
        car1.drive();
        car2.drive();
        car3.drive();
    }
}
