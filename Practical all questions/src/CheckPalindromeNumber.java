import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int num,revNum=0,rem,originalNum;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to check palindrome:");
        num=sc.nextInt();
        originalNum=num;
        while (num!=0){
            rem=num%10;
            revNum=revNum*10+rem;
            num/=10;
        }
        if(originalNum==revNum){
            System.out.println(revNum+" is a Palindrome Number.");
        }
        else {
            System.out.println(revNum+" is not a Palindrome Number.");
        }
    }
}
