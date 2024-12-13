package com.test.structural.bridge;

public class Telivision implements Device {

	@Override
	public void turnOn() {
		System.out.println("Telivision turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("Telivision turned off");
	}

}
