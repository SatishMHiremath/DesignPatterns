package com.test.creational.builder;

public enum Cheese {
	AMERICAN {
		double getCost() {
			return 40.0;
		}
	},
	ITALIAN {
		double getCost() {
			return 60.0;
		}
	};
	
	abstract double getCost();
}
