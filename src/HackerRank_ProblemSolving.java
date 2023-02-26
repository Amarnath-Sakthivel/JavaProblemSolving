package com.practice.coding;

import java.util.Arrays;

public class HackerRank_ProblemSolving {
	static String passwordDecryption(String input) {
		char[] arr = input.toCharArray();
		System.err.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i]) && arr[i] != '0') {
				for (int j = arr.length - 1; j >= 0; j--) {
					if (arr[j] == '0') {
						arr[j] = arr[i];
						arr[i] = ' ';
						break;
					}
				}
			}
			if (arr[i] == '*') {
				char temp = arr[i - 2];
				arr[i - 2] = arr[i - 1];
				arr[i - 1] = temp;
				arr[i]=' ';
			}
		}
		String OriginalString="";
		for(char c : arr) {
			if(c!=' ') {
				OriginalString+=c;
			}
		}
		//System.out.println(OriginalString);
		return OriginalString;
	}

	public static void main(String[] args) {
		passwordDecryption("43Ah*ck0rr0nk");
		passwordDecryption("51Pa*0Lp*0e");
		passwordDecryption("pTo*Ta*O");
	}

}
