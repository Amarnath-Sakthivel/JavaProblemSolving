package com.wipro.practice;

import java.util.Scanner;
import java.math.*;

public class BigInteger {
    static int bigInteger(String input1,String input2){

        BigInteger a=new BigInteger(input1);
        BigInteger b=new BigInteger(input2);
        BigInteger sum=a.add(b);
        System.out.println(sum.toString());

        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input1=sc.next();
        String input2=sc.next();
        bigInteger(input1,input2);
    }

}
