package com.wipro.javapractice;

public class StringDivisionWipro {
	public static void main(String[] args) {
		stringDivisionWipro("Have a nice day", 1, 3);
	}

	static void stringDivisionWipro(String input, int input1, int input2) {
		String[] strArray = input.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			if (i == input1 - 1 || i == input2 - 1) {
				StringBuilder builder = new StringBuilder();
				for (int j = 0; j < strArray[i].length() / 2; j++) {
					builder.append(strArray[i].charAt(j));
				}
				for (int k = strArray[i].length() / 2; k < strArray[i].length(); k++) {
					builder.append(strArray[i].charAt(k));
				}
				System.out.println(builder.reverse());
			}
		}
	}
}
