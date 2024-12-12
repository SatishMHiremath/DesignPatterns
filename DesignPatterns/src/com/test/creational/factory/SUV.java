package com.test.creational.factory;

import java.time.LocalDateTime;
import java.util.Arrays;

class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an SUV");
    }
}
