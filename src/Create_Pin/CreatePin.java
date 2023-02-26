package com.wipro.practice;

import java.util.Scanner;

public class CreatePin {
    static int createPin(int input1,int input2,int input3){
        String s1=Integer.toString(input1);
        String s2=Integer.toString(input2);
        String s3=Integer.toString(input3);

        int pin;
        int i1,i2,i3;
        String out="";
         /*to find 1000th digit*/
        i1=Math.max(s1.charAt(0),s1.charAt(1));
        i1=Math.max(i1,s1.charAt(2));

        i2=Math.max(s2.charAt(0),s2.charAt(1));
        i2=Math.max(i2,s2.charAt(2));

        i3=Math.max(s3.charAt(0),s3.charAt(1));
        i3=Math.max(i3,s3.charAt(2));

        pin=Math.max(i1,i2);
        pin=Math.max(pin,i3);

        pin=Character.getNumericValue(pin);
        out+=pin;
        /*to find 100th digit*/
        pin=Math.min(s1.charAt(0),s2.charAt(0));
        pin=Math.min(pin,s3.charAt(0));
        pin=Character.getNumericValue(pin);
        out+=pin;
        
        /*to find 10th digit*/
        pin=Math.min(s1.charAt(1),s2.charAt(1));
        pin=Math.min(pin,s3.charAt(1));
        pin=Character.getNumericValue(pin);
        out+=pin;
        
        /*to find unit digit*/
        pin=Math.min(s1.charAt(2),s2.charAt(2));
        pin=Math.min(pin,s3.charAt(2));
        pin=Character.getNumericValue(pin);
        out+=pin;

        System.out.println(Integer.parseInt(out));






        return 0;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        createPin(input1,input2,input3);

    }
}
