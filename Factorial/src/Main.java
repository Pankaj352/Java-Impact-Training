import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        First we will take number(n) to take Integer
        int n;
//        Now here, We will take factorial value is 1
        int factorial=1;
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        n=scn.nextInt();

        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+n+" is " + factorial);
    }
}