package com.wipro.javapractice;

public class ReducedSubractedForm {
	static int reducedSubractedForm(int input1) {
		String IntToString = Integer.toString(input1);
		String duplicate = IntToString;
		while (true) {
			String difference = "";
			if (duplicate.length() > 2) {
				for (int i = 0; i < duplicate.length() - 1; i++) {
					difference += Math.abs(Character.getNumericValue(duplicate.charAt(i))
							- Character.getNumericValue(duplicate.charAt(i + 1)));
				}
				duplicate = difference;
			} else {
				break;
			}
		}
		System.out.println(duplicate);
		return Integer.parseInt(duplicate);
	}
	public static void main(String[] args) {
		reducedSubractedForm(6928);
		reducedSubractedForm(5271);
		reducedSubractedForm(123456789);
		reducedSubractedForm(12);

	}

}
