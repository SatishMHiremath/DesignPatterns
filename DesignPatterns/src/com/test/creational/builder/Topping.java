package com.test.creational.builder;

public enum Topping {
	PEPPERONI {
		double getCost() {
			return 30; 
		}
	},
	MUSHROOM {
		double getCost() {
			return 35; 
		}
	},
	FARMHOUSE {
		double getCost() {
			return 90; 
		}
	},
	VEGGIEPARADISE {
		double getCost() {
			return 85; 
		}
	}, MARGHAREITA {
		double getCost() {
			return 50;
		}
	};
	abstract double getCost();
}
