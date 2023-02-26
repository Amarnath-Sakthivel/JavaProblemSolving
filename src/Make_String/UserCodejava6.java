package com.wipro.javapractice;

public class UserCodejava6 {
	
	static String makeString(String input1) {
		
	    input1=input1.toUpperCase();
	    String makeString="";
	    for(String split:input1.split(":")) {
	    	int split_len=split.length();
	    	for(int i=0;i<split_len-1;i++) {
	    		if(split.charAt(i)==split.charAt(i+1))
	    			makeString+=split.charAt(i);
	    		else {
	    			int pos1=split.charAt(i)-'A'+1;
	    			int pos2=split.charAt(i+1)-'A'+1;
	    			int val='A'+Math.abs(pos1-pos2)-1;
	    			char getChar=(char)val;
	    			makeString+=getChar;
	    		}
	    	}
	    }
// 		System.out.println(makeString);
		return makeString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeString("ww:ii:pp:rr:oo");
		makeString("ab:cd:ef");

	}

}
