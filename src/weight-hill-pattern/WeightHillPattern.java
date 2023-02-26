import java.util.Scanner;

public class WeightHillPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total_levels=sc.nextInt();
		int first_row=sc.nextInt();
		int  weight_increments=sc.nextInt();
		int sum=weight_increments+first_row;
		int weigth=first_row;
		for(int i=2;i<=total_levels;i++) {
			 weigth+=i*(sum);
			 sum+=weight_increments;
		}
		System.out.println(weigth);

	}

}
