import java.util.Scanner;
public class FindSquareRootOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Find Square Of A Number>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the Number :");
        int num =sc.nextInt();
        int squareRoot = num* num;
        System.out.println("The Square Root of "+num+" is "+squareRoot);

    }
}
