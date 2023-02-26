package com.wipro.javapractice;

import java.util.Arrays;

public class DecreasingSequence {
	public static int DecreasingSequence(int[] arr, int input2) {

		int temp = 0;
		int largeSequence = 1;
		int NoOfSequence = 0;
		
		for (int i = 0; i < input2 - 1; i++) {
			if (input2 == 1) {
				largeSequence = 0;
				NoOfSequence = 0;
			} else {
				if (arr[i] > arr[i + 1]) {
					if (largeSequence == 1) {
						NoOfSequence++;
					}
					largeSequence++;
					if (largeSequence >= temp) {
						temp = largeSequence;
					}
				} else {
					largeSequence = 1;
				}
			}
		}
		System.out.println(NoOfSequence + " " + temp);

		return 0;

	}

	public static void main(String[] args) {
		DecreasingSequence(new int[] { 11, 3, 1, 4, 7, 8, 12, 2, 3, 7 }, 10);
		DecreasingSequence(new int[] { 7, 3, 1, 8, 10, 13, 12, 9, 8, 11, 14, 20, 7, 6, 3, 2 }, 16);
		DecreasingSequence(new int[] { 9 }, 1);
	}

}
