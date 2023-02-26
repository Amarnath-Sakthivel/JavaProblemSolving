import java.util.Scanner;
public abstract class CgpaCalculaltion {
    int choice, sem;
    int t_credit = 0;
    double t_cgpa = 0;
    Scanner sc = new Scanner(System.in);
    abstract void display();

}
class  gpa extends CgpaCalculaltion{
    Scanner sc=new Scanner(System.in);
    int t_subject,s_credit,gradeValue,cp,sum,sum1;
    //String s_grade;
    void display(){
        System.out.println("-----*GPA CALCULATOR*--------");
        System.out.println("Enter the no: of Subject:");
        t_subject=sc.nextInt();
        for (int i=1;i<=t_subject;i++){
            System.out.println("Enter the grade for subject"+i);
            String[] s_grade = new String[t_subject+1];
            s_grade[i]=sc.next();
            System.out.println("Enter the credit for subject"+i);
            s_credit=sc.nextInt();
            for (int j=0;j<5;j++) {
                    switch (s_grade[i]) {
                        case "S":
                            cp = 10 * s_credit;
                            break;
                        case "A":
                            cp = 9 * s_credit;
                            break;
                        case "B":
                            cp = 8 * s_credit;
                            break;
                        case "C":
                            cp = 7 * s_credit;
                            break;
                        case "D":
                            cp = 6 * s_credit;
                            break;
                        case "E":
                            cp = 5 * s_credit;
                            break;
                    }

            }
                sum=sum+cp;
                sum1=sum1+s_credit;
            }
        double gpa=sum/sum1;
        System.out.println("GPA:"+gpa);


        }

    }

class MyCalc extends CgpaCalculaltion {

    void display() {
        System.out.println("\nHow many Semester completed:");
        sem = sc.nextInt();
        int[] arr = new int[sem + 1];
        double arr1[] = new double[sem + 1];
        for (int i = 1; i <= sem; i++) {
            System.out.println("\nEnter the CREDIT for" + " " + i + ":");
            arr[i] = sc.nextInt();
            System.out.println("Enter the GPA for sem" + " " + i + ":");
            arr1[i] = sc.nextDouble();
            double cgpa = arr[i] * arr1[i];
            t_cgpa = t_cgpa + cgpa;
            t_credit = t_credit + arr[i];
        }
       // System.out.println("Subject"+"|"+"Credit"+"|"+"Grade\n"+i);
        double CGPA = t_cgpa / t_credit;
        System.out.println("CGPA is:" + CGPA);
    }

}







