package com.akshaydand.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InsertionSort {

	public static int[] sort(int[] inputArray) {
//		long a = System.nanoTime();

		for (int i = 0; i < inputArray.length - 1; i++) {
			int comaprisonElement = inputArray[i + 1];
			int j = i;
			while (j >= 0 && comaprisonElement < inputArray[j]) {
				inputArray[j + 1] = inputArray[j];
				j = j - 1;
			}
			inputArray[j + 1] = comaprisonElement;
		}
		
//		long b = System.nanoTime();
//		System.out.println((b-a));
		
		return inputArray;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberOFElements = Integer.parseInt(br.readLine());
		int[] inputArray = new int[numberOFElements];

		String inputLine = br.readLine();
		String[] stringArray = inputLine.trim().split("\\s+");

		for (int i = 0; i < numberOFElements; i++) {
			inputArray[i] = Integer.parseInt(stringArray[i]);
		}

		int[] sortedArray = sort(inputArray);

		for (int i = 0; i < numberOFElements; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}
}
