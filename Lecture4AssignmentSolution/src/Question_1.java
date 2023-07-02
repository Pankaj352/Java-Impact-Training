//Q1 - Input name, roll number and field of interest from user and print in the format below :
//       Name: xyz, Roll number: xyz, Field of interest: xyz


import java.util.Scanner;
public class Question_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name = sc.nextLine();
        int roll_number=sc.nextInt();
        String fieldOfInterest = sc.next();

        System.out.println("Name: "+ name );
        System.out.println("Roll Number: "+ roll_number);
        System.out.println("Field of interest: "+fieldOfInterest);

    }
}
