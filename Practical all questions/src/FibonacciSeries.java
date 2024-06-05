import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNum=0;
        int secondNum=1;
        int nextNum;
        int num;

        System.out.println("Enter the number:");
        num=sc.nextInt();
        for (int i=1;i<=num;i++){
            nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
            System.out.println("\n Fibonacci Series: ["+nextNum+"]");
        }
    }
}
