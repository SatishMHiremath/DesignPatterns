package com.test.creational.builder;

public enum Size {
	
	REGULAR {
		double getCost() {
			return 100;
		}
	},
	MEDIUM {
		double getCost() {
			return 300;
		}

	},
	LARGE { 
		double getCost() {
			return 500;
		}
	};
	
	abstract double getCost();
	
}
