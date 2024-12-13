package com.test.behavioural.strategy;

public class Context {
	private SortingStrategy strategy;

	public void setStrategy(SortingStrategy sortingStrategy) {
		this.strategy = strategy;
	}

	public void sort(int[] nums) {
		strategy.sort(nums);
	}
}
