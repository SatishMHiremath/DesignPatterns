package com.test.structural.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
