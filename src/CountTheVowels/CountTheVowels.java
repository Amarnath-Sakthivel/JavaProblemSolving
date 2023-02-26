import java.util.Scanner;

public class CountTheVowels {
    static String CountTheVowels(String input1) {
        char[] arr = input1.toLowerCase().toCharArray();
        int count = 0;
        String output ="";
        String rev="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                count++;
            } else {
                output += arr[i];
            }
        }
        if (count == 5) {
            String s1 = output.toUpperCase();
            int len1 = output.toUpperCase().length();
            String s2 = Integer.toString(len1);
            return s1+":"+s2;

        }

        else {

            for (int i = (arr.length) - 1; i >= 0; i--) {
                rev += arr[i];
            }
                return rev.toUpperCase()+":"+"ERROR";
        }
        
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        CountTheVowels(input1);
    }

}
