package com.akshaydand.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort {

	public static int[] sort(int[] inputArray) {
		for (int i = inputArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					
					//swapping logic
					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;

				}
			}
		}
		//returning the sorted array
		return inputArray;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberOfElements = Integer.parseInt(br.readLine());
		int[] inputArray = new int[numberOfElements];
		
		//creating a string array after taking input in inputLine because, input is in a single line :5 8 9 6 3 41
		String inputLine = br.readLine();
		String[] stringInput = inputLine.trim().split("\\s+");

		//Storing the elements to an Integer array using wrapper classes
		for (int i = 0; i < numberOfElements; i++) {
			inputArray[i] = Integer.parseInt(stringInput[i]);
		}

		//Storing the entire array returned from the sort method
		int[] sortedArray = sort(inputArray);

		//Displaying the sorted output
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}
}
