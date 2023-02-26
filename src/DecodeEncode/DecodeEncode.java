package com.wipro.javapractice;

public class DecodeEncode {
	public static int[] encrypt(String str) {
		int[] arr = new int[str.length()];
		arr[0] = (int) str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			arr[i] = ((int) str.charAt(i) - (int) str.charAt(i - 1));
		}
		for (int i : arr) {
			System.out.println(i);
		}
		return arr;

	}

	public static String decrypt(int[] arr) {

		String decrypt="";
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
             decrypt+=(char)sum;
		}
		System.out.println(decrypt);

		return null;

	}
}
