package com.wipro.javapractice;

import java.util.Arrays;

public class IPLSchedule {
	static void IPLSchedule(String[] teams) {
		
		System.out.println("\n\t\t ------IPL SCHEDULE----- \t\t\n ");
		
		String dup = "";
		for (int i = 0; i < teams.length; i++) {
			if (teams[i] != "Q") 
				dup += teams[i]+" ";
			else 
				break;
		}
		String[] arr=dup.split(" ");
		System.out.println("\t\t Total Teams :"+Arrays.toString(arr)+"\n");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				if(i!=j)
					System.out.println("\t\t "+arr[i]+" vs "+arr[j]);
		}	
	}
	public static void main(String[] args) {
		IPLSchedule(new String[] { "Chennai", "Mumbai",  "Delhi", "Bangalore", "Q",  "Punjab", "Rajastan", "Kolkatha", "Hyderbad" });
		IPLSchedule(new String[] { "Chennai", "Mumbai",  "Delhi", "Q" });
	}

}
