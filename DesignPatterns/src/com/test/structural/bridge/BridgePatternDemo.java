package com.test.structural.bridge;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Device tvDevice = new Telivision();
		Device radioDevice = new Radio();
		RemoteControl tvRemote = new RemoteControl(tvDevice); 
		RemoteControl radioRemote = new RemoteControl(radioDevice);
		
		tvRemote.turnOn();
		tvRemote.turnOff();
		radioRemote.turnOn();
		radioRemote.turnOff();
	}
}
