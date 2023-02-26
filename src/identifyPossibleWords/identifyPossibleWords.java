package com.wipro.practice;

import java.util.Scanner;

public class identifyPossibleWords {
       static String  identifyPossibleWords(String in,String out){
        in=in.toUpperCase();
        out=out.toUpperCase();
        String f = "";
        int count;
        for (String s : out.split(":")) {
            count = 0;
            if (s.length() == in.length()) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == in.charAt(i)) {
                        count++;
                    }
                }
                if (count == in.length() - 1) {
                    f += s + ":";
                }
            }
        }
        System.out.println("\n");
           if (f.length() == 0) {
               System.out.println("error");
           }else {
               f = f.substring(0, f.length() - 1);
               System.out.println(f);
           }

        return null;
    }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            String in = sc.nextLine();
            //System.out.println(in.length());
            String out = sc.nextLine();
            identifyPossibleWords(in,out);
        }


    }
