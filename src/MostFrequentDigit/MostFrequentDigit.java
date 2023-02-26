package com.wipro.practice;

import java.util.*;

class MostFrequenrDigit {
    static int MostFrequenrDigit(int input1,int input2,int input3,int input4) {
        //Convert Int to String
        String s1=Integer.toString(input1);
        String s2=Integer.toString(input2);
        String s3=Integer.toString(input3);
        String s4=Integer.toString(input4);
        //append string
        String apend=s1.concat(s2);
        apend=apend.concat(s3);
        apend=apend.concat(s4);
        
        //logic to find *Most Frequent Digit*
        int temp=1;
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<apend.length();i++){
            int count=0;
            for(int j=0;j<apend.length();j++){
                if(apend.charAt(i)==apend.charAt(j))
                    count++;
            }if(count>=temp) {
                temp = count;
                arr.add(Character.getNumericValue(apend.charAt(i))); //get Numeric values

            }
        }
       
        System.out.println(Collections.max(arr));
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int input4=sc.nextInt();
        MostFrequenrDigit(input1,input2,input3,input4);


    }

}
