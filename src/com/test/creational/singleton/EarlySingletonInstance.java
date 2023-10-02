package com.test.creational.singleton;

public class EarlySingletonInstance {
	
	private EarlySingletonInstance() {
		
	}
	
	private static final EarlySingletonInstance EARLY_SINGLETON_INSTANCE = new EarlySingletonInstance();
	
	
	public static EarlySingletonInstance getInstance() {
		return EARLY_SINGLETON_INSTANCE;
	}
	
}
