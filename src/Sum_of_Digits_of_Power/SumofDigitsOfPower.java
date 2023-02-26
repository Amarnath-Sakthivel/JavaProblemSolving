package com.wipro.practice;

import java.util.Scanner;

public class SumofDigitsOfPower {
    static int power(int in) {
        int power;
        int sum = 0;
        String str = Integer.toString(in);
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            int n1=Character.getNumericValue(str.charAt(i));
            System.out.println("n1"+ n1);
            int n2=Character.getNumericValue(str.charAt(i+1));
            System.out.println("n2"+n2);
            power = (int) Math.pow(n1,n1);
            System.out.println("power "+power);
            sum += power;
        }
        System.out.println(sum);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        power(in);
    }
}

