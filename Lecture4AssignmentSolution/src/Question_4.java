//Q4 - Given two numbers, return their sum in the following format:
//        Int t representing number of test cases
//        T lines of Two integers representing the numbers to be added

import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
