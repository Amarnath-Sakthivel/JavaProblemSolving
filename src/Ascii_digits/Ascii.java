import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ascii {
    public static int AsciiValues(char[] input1,char[] input2){
        int len1=input1.length;
        int len2=input2.length;
        int a1 = 0, a2 = 0,sum=0,ascii_sum=0;
        if((len1>1 && len1<16) && (len2>1 && len2<16)) {
            for (int i = 0; i < len1; i++) {
                if (Character.isUpperCase(input1[i])) {
                    int ch = input1[i] - 'a';
                    a1 = a1 | (1 << ch);
                }
            }
            for (int i = 0; i < len2; i++) {
                if (Character.isUpperCase(input2[i])) {
                    int ch = input2[i] - 'a';
                    a2 = a2 | (1 << ch);
                }
            }
            int ans = a1 ^ a2;

            int i = 0;
            System.out.println("\nUNCOMMON CHAR WITH ASCII VALUE");
            while (i < 26) {
                if (ans % 2 == 1) {

                    System.out.print(Character.toUpperCase((char) ('a'+i)));
                    int ascii = Character.toUpperCase((int) ('a' + i));
                    System.out.println("\t"+ascii);
                    ascii_sum += ascii;
                }
                ans = ans / 2;
                i++;
            }
            System.out.println("\nSum of ASCII digits: " + ascii_sum);
            while (ascii_sum > 0 || sum > 9) {
                if (ascii_sum == 0) {
                    ascii_sum = sum;
                    sum = 0;
                }

                sum += ascii_sum % 10;
                ascii_sum = ascii_sum / 10;
            }
        }

        System.out.println("\nThe sum of Digits: "+sum);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("char_arr1:");
        char[] input1=sc.next().toCharArray();
        for(int i=0;i<input1.length;i++){
           System.out.println(input1[i]);
        }

        System.out.println("char_arr2:");
        char[] input2=sc.next().toCharArray();
        for (int i=0;i<input2.length;i++){
            System.out.println(input2[i]);
        }
        AsciiValues(input1,input2);

    }
}
