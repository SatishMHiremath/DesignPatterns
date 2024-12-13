package com.test.behavioural.strategy;

public class QuickSortStrategy implements SortingStrategy {

	@Override
	public void sort(int[] numbers, int low, int high) {
		if (low < high) {
			/* pi is partitioning index, arr[p] is now
	               at right place */
			int pi = partition(numbers, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(numbers, low, pi - 1);
			sort(numbers, pi + 1, high);
		}
	}

	private int partition(int[] numbers, int low, int high) {
		return low;
	}

	@Override
	public void sort(int[] numbers) {
		System.out.println("sort");
	}

}
