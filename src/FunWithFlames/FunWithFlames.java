import java.util.Scanner;

public class FunWithFlames {
        static String FlamesProgram(String input1,String input2){
            int count;
            String output="";
            input1=input1.toUpperCase();
            input2=input2.toUpperCase();

            for (int i=0;i<input1.length();i++){
                count=0;
                for (int j=0;j<input2.length();j++){
                    if(input1.charAt(i)!=input2.charAt(j)){
                        count++;
                    }
                }
                if(count==input2.length()){
                    output+=input1.charAt(i);
                }
            }
            for (int i=0;i<input2.length();i++){
                count=0;
                for (int j=0;j<input1.length();j++){
                    if(input2.charAt(i)!=input1.charAt(j)){
                        count++;
                    }
                }
                if(count==input1.length()){
                    output+=input2.charAt(i);
                }

            }
//        System.out.println(output);
            int len=output.length();
            char flames=0;
            String flm="flames";
            StringBuilder sb=new StringBuilder(flm);
            while(sb.length()!=1){
                int n=len%sb.length();
                String t;
                if(n!=0) {
                    t = sb.substring(n) + sb.substring(0, n- 1);
                }
                else {
                    t=sb.substring(0,sb.length()-1);

                }
                sb=new StringBuilder(t);
                flames=sb.charAt(0);

            }
            System.out.println("\n******Result******");
            switch (flames){
                case 'f':
                    System.out.println(input1+" + "+ input2+" = "+"Friend");
                    break;
                case 'l':
                    System.out.println(input1+" + "+ input2+" = "+"Love");
                    break;
                case 'a':
                    System.out.println(input1+" + "+ input2+" = "+ "Affection");
                    break;
                case 'm':
                    System.out.println(input1+" + "+ input2+" = "+"Marriage");
                    break;
                case 'e':
                    System.out.println(input1+" + "+ input2+" = "+"Enemies");
                    break;
                case 's':
                    System.out.println(input1+" + "+ input2+" = "+"Siblings");
                    break;
            }

            return null;
        }



        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("\n******FLAMES******");
            System.out.println("Male:");
            String input1=sc.next();
            System.out.println("Female:");
            String input2=sc.next();
            FlamesProgram(input1,input2);

        }

    }

}
