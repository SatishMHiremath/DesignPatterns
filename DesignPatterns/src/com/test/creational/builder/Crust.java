package com.test.creational.builder;

public enum Crust {
	
	THIN { 
		double getCost() {
			return 70;
		}
	},
	STUFFED {
		double getCost() {
			return 90;
		}
	};
	
	abstract double getCost();
	
}
