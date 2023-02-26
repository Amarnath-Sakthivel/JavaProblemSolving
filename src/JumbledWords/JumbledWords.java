package com.wipro.javapractice;

public class JumbledWords {
	public static void JumbledWords(String input1, int input2) {

		String out="";
		for (String split : input1.split(" ")) {
			String odd ="", even ="";
			for (int i = 0; i < split.length(); i++) {
				if (i % 2 == 0)
					odd += split.charAt(i);
				else {
					even += split.charAt(i);
				}
			}
			if (input2 == 2)
				out+= odd.concat(even)+" ";
			else if (input2 == 1)
				out+= odd.concat(new StringBuilder(even).reverse().toString())+" ";

		}
		System.out.println(out.trim());
	}

	

	public static void main(String[] args) {
		JumbledWords("Wipro Technologies Bangalore", 1);  //output: Wpori Tcnlgesioohe Bnaoerlga
		JumbledWords("Wipro Technologies Bangalore ", 2); // output: Wpoir Tcnlgeehoois Bnaoeaglr
	}

}
