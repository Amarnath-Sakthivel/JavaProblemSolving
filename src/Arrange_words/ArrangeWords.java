

import java.util.Scanner;

public class ArrangeWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] in=new String[n];
		for(int i=0;i<n;i++) {
			in[i]=sc.next();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			char a=in[i].charAt(in[i].length()-1);
			for(int j=0;j<n;j++) {
				char b= in[j].charAt(0);
				if(a==b) {
					count++;
				}
			}
		}
			if(count==n-1) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
}
		
	