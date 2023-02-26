package com.wipro.javapractice;

public class UserJavaCode {
	static void fixTheFormula(String str) {
		String str1 = "", op = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				str1 += str.charAt(i);
			if (!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i)))
				op += str.charAt(i);
		}
		int sum = 0;
		for (int i = 0; i < str1.length() - 1; i++) {
			int a = Character.getNumericValue(str1.charAt(i));
			int b = Character.getNumericValue(str1.charAt(i + 1));
			for (int j = i; j <= i; j++) {
				char c = op.charAt(j);
				switch (c) {
				case '+':
					if (i == 0) {
						sum += (a + b);

					} else {
						sum += b;
					}
					break;
				case '-':
					if (i == 0) {
						sum += a - b;
					} else {
						sum -= b;
					}
					break;
				case '*':
					if (i == 0) {
						sum += a * b;
					} else {
						sum *= b;
					}

					break;
				case '/':
					if (i == 0) {
						sum += a / b;
					} else {
						sum /= b;
					}
					break;
				}
			}
		}
		System.out.println("sum " + Math.abs(sum));

	}

	public static void main(String[] args) {

		fixTheFormula("we8+you2-7to/*32");
		fixTheFormula("for+23the3*like2+");
	}

}
