import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a string value: ");
        String str=scn.nextLine();
        String reverseStr="";
        int strLength=str.length();
        for(int i=(strLength-1); i>=0;--i){
            reverseStr=reverseStr+str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str + " is a Palindrome");
        }
        else{
            System.out.println(str+"is not a Palindrome");
        }
    }
}
