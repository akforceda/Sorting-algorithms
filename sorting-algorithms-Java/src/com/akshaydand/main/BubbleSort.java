package com.akshaydand.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort {

	public static int[] sort(int[] inputArray) {
		for (int i = inputArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {

					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;

				}
			}
		}
		return inputArray;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberOfElements = Integer.parseInt(br.readLine());
		int[] inputArray = new int[numberOfElements];

		String inputLine = br.readLine();
		String[] stringInput = inputLine.trim().split("\\s+");

		for (int i = 0; i < numberOfElements; i++) {
			inputArray[i] = Integer.parseInt(stringInput[i]);
		}

		int[] sortedArray = sort(inputArray);

		for (int i = 0; i < numberOfElements; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}
}
