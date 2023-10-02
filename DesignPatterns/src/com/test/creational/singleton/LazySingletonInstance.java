package com.test.creational.singleton;

public class LazySingletonInstance {
	
	private LazySingletonInstance() {
		
	}
	
	private static LazySingletonInstance lazySingletonInstance = null;
	
	public static LazySingletonInstance getInstance() {
		if(lazySingletonInstance == null) {
			synchronized (LazySingletonInstance.class) {
				if(lazySingletonInstance == null) {
					return lazySingletonInstance = new LazySingletonInstance();
				}
			}
		}
		return lazySingletonInstance;
	}
}
