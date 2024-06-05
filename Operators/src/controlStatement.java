import java.util.Scanner;

public class controlStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of High School :");
        int marks=sc.nextInt();
        if(marks>=600){
            System.out.println("error ! Enter the correct marks");
        } else if (marks>=550) {
            System.out.println("Excellent");
        } else if (marks>=500) {
            System.out.println("Very Good");
        } else if (marks>=400) {
            System.out.println("Good");
        } else{
            System.out.println("Improve Your Skills");
        }
    }
}
