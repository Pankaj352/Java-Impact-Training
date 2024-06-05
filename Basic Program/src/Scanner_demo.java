import java.util.Scanner;
public class Scanner_demo {
    public static void main(String[] args) {
        //Student data
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter your course:");
        String course = sc.nextLine();
        System.out.println("Enter semester :");
        int sem =sc.nextInt();
        System.out.println("Enter your roll no. :");
        int roll_no =sc.nextInt();
        // All detail
        System.out.println("--------------------------All Detail-----------------------------------------");
        System.out.println("Name :"+name);
        System.out.println("Course :"+course);
        System.out.println("Semester :"+sem);
        System.out.println("Roll No. :"+ roll_no);
    }
}
