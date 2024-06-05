import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The String to check the Palindrome String: ");
        String str=sc.nextLine();
        String reverseStr="";
        int strLength=str.length();
        for(int i=(strLength-1);i>=0;i--){
            reverseStr=reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str+ " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
