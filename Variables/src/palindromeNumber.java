import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int palindromeNum=scn.nextInt();
        int reverseNum=0;
        int reminder;
       if((palindromeNum<0 || palindromeNum!=0) && palindromeNum%10==0 )
     {
//            System.out.println("Not Palindrome");
        }
        while(palindromeNum>reverseNum){
            reminder=palindromeNum%10;
            reverseNum=(reverseNum*10)+reminder;
            palindromeNum =palindromeNum/10;
        }
        System.out.println(palindromeNum==reverseNum || palindromeNum==reverseNum/10);

    }
}
