package com.test.behavioural.strategy;

public interface SortingStrategy {
	
	void sort(int[] numbers);
	void sort(int[] numbers, int low, int high);
}
