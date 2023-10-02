package com.test.creational.singleton;

public class SingletonClient {

	public static void main(String[] args) {
//		EarlySingletonInstance earlySingletonInstance1 = EarlySingletonInstance.getInstance();
//		EarlySingletonInstance earlySingletonInstance2 = EarlySingletonInstance.getInstance();
//		System.out.println(earlySingletonInstance1==earlySingletonInstance2);
		
		LazySingletonInstance lazySingletonInstance1 = LazySingletonInstance.getInstance();
		LazySingletonInstance lazySingletonInstance2 = LazySingletonInstance.getInstance();
		System.out.println(lazySingletonInstance1==lazySingletonInstance2);
	}
}
