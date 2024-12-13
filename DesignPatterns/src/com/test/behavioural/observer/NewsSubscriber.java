package com.test.behavioural.observer;

public class NewsSubscriber implements Observer {

	private String name;

	public NewsSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println("Subscriber " + name + " received message: " + message);
	}

}
