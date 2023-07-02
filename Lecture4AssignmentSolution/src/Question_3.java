//Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
//        100), write a program to calculate his total marks and percentage marks.

import  java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int first_subject=sc.nextInt();
        int second_subject=sc.nextInt();
        int third_subject=sc.nextInt();

        int total =first_subject+second_subject+third_subject;

        System.out.println("Total marks:"+total);


        int percentage = (total*100)/300;
        System.out.println("Percentage marks:"+percentage);

    }
}
