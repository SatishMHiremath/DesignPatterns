package com.test.behavioural.observer;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		NewsPublisher publisher = new NewsPublisher();

		NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
		NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");

		publisher.addObserver(subscriber1);
		publisher.addObserver(subscriber2);

		publisher.setNews("Breaking News: A new tech gadget is launched!");
	}
}
