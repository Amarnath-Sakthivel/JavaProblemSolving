package com.wipro.javapractice;

public class UserCodeJava7 {
	static String reverseWordsCase(String s,int in)
    {
    
        String out="";
        StringBuffer sb=new StringBuffer(s);
    
    for(String split:s.split(" ")){
           sb=new StringBuffer(split);
              sb=sb.reverse();
              out+=sb.toString()+" ";
             }
            if(in==1){
                out=out.toLowerCase();
                StringBuilder st=new StringBuilder(out);
                char[] arr=s.toCharArray();
             char[] arr1=(out.toCharArray());
            
                for(int i=0;i<arr.length;i++){
                        if(Character.isUpperCase(arr[i])){
                                int pos=i;
                             char c= Character.toUpperCase(arr1[i]);
                                st.setCharAt(pos,c);
                    
                }
                }
                    out=st.toString();
          // System.out.println(out);
        
        }
        
        else{
           // System.out.println(out);
           out=out;
        }
        return out;
        }
        
        public static void main(String args []){
           String input1="Wipro TechNologies BangaLore";
           
           String input2="Wipro Technologies, Bangalore";
        String input3="Wipro TechNologies, BangaLore";
           
           String result1=reverseWordsCase(input1,0);
        String result2=reverseWordsCase(input2,0);
        String result3=reverseWordsCase(input3,0);
        String result4=reverseWordsCase(input2,1);
        String  result5=reverseWordsCase(input2,1);
        String result6=reverseWordsCase(input3,1);
        System.out.println("Test Case 1");
        System.out.println(input1);
        System.out.println(result1);
        System.out.println("Test Case 2");
        System.out.println(input2);
        System.out.println(result2);
        System.out.println("Test Case 3");
        System.out.println(input3);
        System.out.println(result3);
        System.out.println("Test Case 4");
        System.out.println(input1);
        System.out.println(result4);
        System.out.println("Test Case 5");
        System.out.println(input2);
        System.out.println(result5);
        System.out.println("Test Case 6");
        System.out.println(input3);
        System.out.println(result6);
}

}
