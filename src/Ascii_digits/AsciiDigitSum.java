import java.text.NumberFormat;
import java.util.*;

public class AsciiDigitSum {
     static int AsciiValues(char[] input1,char[] input2){
         int count,ascii_sum=0,ascii,sum=0;
         for (int i=0;i<input1.length;i++){                 // comparing input 1 with input 2.
             count=0;
             for (int j=0;j<input2.length;j++){
                   if(Character.isUpperCase(input1[i]) && Character.isUpperCase(input2[j])){   //    // find ascii values for UpperCase
                         if(input1[i]!=input2[j]){
                         count++;
                    }
                 }
             }if(count==input2.length){

                 ascii=(int)(input1[i]); 

                 System.out.println((input1[i])+" "+ascii);     // find ascii values for UpperCase
                 ascii_sum+=ascii;                                // sum of ascii values for input 1

             }
         }
         for (int i=0;i<input2.length;i++){                     // comparing input 2 with input 1.
             count=0;
             for (int j=0;j<input1.length;j++){
                   if(Character.isUpperCase(input1[i]) && Character.isUpperCase(input2[j])) {
                         if(input2[i]!=input1[j]){
                         count++;
                    }
                 }
             }if(count==input1.length){

                 ascii=(int)(input2[i]);            
                 System.out.println((input2[i])+" "+ascii);
                 ascii_sum+=ascii;                                          // sum of ascii values for input1(already found above) and input2

             }
         }System.out.println(ascii_sum);
         while (ascii_sum>0 || sum>9){                         // logic to find sum of digits until its become single digit.
             if(ascii_sum==0){
                 ascii_sum=sum;
                 sum=0;
             }
             sum+=ascii_sum%10;
             ascii_sum/=10;
         }
         System.out.println(sum);

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
        System.out.println("\n");
        AsciiValues(input1,input2);

    }
}





























