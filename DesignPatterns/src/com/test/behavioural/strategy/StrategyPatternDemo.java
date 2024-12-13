package com.test.behavioural.strategy;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		int[] numbers = {2,5,1,8,3};
		Context context = new Context();
		
        // Set the strategy to bubble sort
		context.setStrategy(new BubbleSortStrategy());
		context.sort(numbers);
		System.out.println("Sorted Array using Bubble Sort:");
		printArray(numbers);

		// Set the strategy to Quick sort
		context.setStrategy(new QuickSortStrategy());
		context.sort(numbers);
		System.out.println("Sorted Array using Quick Sort:");
		printArray(numbers);
	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
			System.out.println();
		}
	}
}
