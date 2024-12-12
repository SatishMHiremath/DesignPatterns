package com.test.structural.bridge;

public class RemoteControl {
	private Device device;
	
	public RemoteControl(Device device) {
		this.device = device;
	}
	
	public void turnOn() {
		device.turnOn();
	}
	
	public void turnOff() {
		device.turnOff();
	}
}
