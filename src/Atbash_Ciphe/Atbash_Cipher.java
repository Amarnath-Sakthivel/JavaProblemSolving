package com.wipro.javapractice;

public class Atbash_Cipher {
	static String secretCode(String str) {
	     String decrypt = "";
		for (String split : str.split(" ")) {
			for (int i = 0; i < split.length(); i++) {
				char c = split.charAt(i);
				char getChar = (char) ((boolean) Character.isLowerCase(c) ? (char) 122 - (c - 'a'): Character.isUpperCase(c) ? (char) 90 - (c - 'A') : c);
				decrypt += getChar;
			}
			decrypt += " ";
		}
		return decrypt.trim();
	}
}
