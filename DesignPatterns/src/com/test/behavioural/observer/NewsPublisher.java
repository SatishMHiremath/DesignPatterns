package com.test.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private String message;

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

	public void setNews(String newMessage) {
		this.message = newMessage;
		notifyObservers();
	}

}
