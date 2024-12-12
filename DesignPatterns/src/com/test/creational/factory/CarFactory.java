package com.test.creational.factory;

class CarFactory {
    public Car createCar(String carType) {
        if ("Sedan".equals(carType)) {
            return new Sedan();
        } else if ("SUV".equals(carType)) {
            return new SUV();
        } else if("Hatchback".equals(carType)) {
            return new HatchBack();
        }
        return null;
    }
}
