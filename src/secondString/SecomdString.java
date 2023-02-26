package com.wipro.practice;

import java.util.Scanner;

public class SecomdString {
        public static void main(String[] arg )
        {
            Scanner sc=new Scanner(System.in);
            String in=sc.nextLine();
            String out="";
            int count=0;
            for(int i=0;i<in.length();i++){
                if(in.charAt(i)==' ')
                    count++;
            }
            if(count==0){
                in="LESS";}
            else if(count==1){
                in=in.substring(in.indexOf(' '),in.length());
                in=in.trim();}
            else{
                in=in.substring(in.indexOf(' '),in.length());
                in=in.trim();
                in=in.substring(0,in.indexOf(' '));}

            System.out.println(in);


        }
    
}
