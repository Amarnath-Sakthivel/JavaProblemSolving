import java.util.Scanner;

public class FindStepNumber {
    static int FindStepNumber(int input1) {
        String s = String.valueOf(input1);
        int diff, count = 0;
        char[] arr = s.toCharArray();
        int i = 0, j = 1;
            while (i < arr.length && j < arr.length) {
                diff = arr[i] - arr[j];
                if (diff == -1 || diff == 1) {
                    i++;
                    j++;
                }else{
                    count++;
                    break;
                }

            }
            if (count >0 || arr.length==1) {
                System.out.println(s + "-false");
            } else {
                System.out.println(s + "-true");
            }



        return 0;
    }


    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        FindStepNumber(input1);
        }
    }






















