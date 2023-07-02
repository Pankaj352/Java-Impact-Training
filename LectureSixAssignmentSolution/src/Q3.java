import java.util.Scanner;
//Write a program to calculate the sum of the digits of a 3-digit number.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        while (x>0){
            sum +=x%10;
            x/=10;

        }
        System.out.println(sum);
    }
}
