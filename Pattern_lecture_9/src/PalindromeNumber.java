import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("========To Check Palindrome Number==========");
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=scn.nextInt();
        int reminder;
        int result=0;
        int temp=num;
        while(temp>0) {
                reminder = temp % 10;
                result = result*10 + reminder;
                temp/=10;
        }
         if(num==result){
             System.out.println("Palindrome");
         }
         else {
             System.out.println("Not d Palindrome");
         }

    }
}
