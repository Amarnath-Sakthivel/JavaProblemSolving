import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n--------Enter Calculator(GPA/CGPA)------------");
        System.out.println("1.GPA");
        System.out.println("2.CGPA");
        choice=sc.nextInt();
        switch (choice){
            case  1:
                CgpaCalculaltion c2=new gpa();
                c2.display();
                break;
            case 2:
                CgpaCalculaltion c1 = new MyCalc();
                c1.display();
                break;

        }
    }
}
