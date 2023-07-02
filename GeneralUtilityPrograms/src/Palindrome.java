import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a,b;
        StringBuffer sb;
        System.out.println("Enter the string to check if it is a palindrome :");
        a=sc.nextLine();
        sb=new StringBuffer(a);
        b=sb.reverse().toString();
        if (a.equals(b)){
            System.out.println("Entered string is a palindrome. ");
        }
        else {
            System.out.println("Entered string is not a palindrome.");
        }
    }
}
