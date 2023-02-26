package com.wipro.javapractice;

import java.util.HashSet;

public class DigitBattle {

	static void method(int number) {
		
		String str=Integer.toString(number);
		char[] input=str.toCharArray();
		int len = input.length;
		String res = "";
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < len - 1; i += 2) {
			if (input[i] == input[i + 1]) {
				continue;
			}
				int num1=Character.getNumericValue(input[i]);
				int num2=Character.getNumericValue(input[i+1]);
				int max = Math.max(num1,num2);
				res += max;
			}
			if (len % 2 != 0) {
				res += input[len - 1];
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method( 32531 );
		method( 111 );
		method( 76811 );
		method(3245196 );
		method( 93552129 );
		method(5289);

	}

}
