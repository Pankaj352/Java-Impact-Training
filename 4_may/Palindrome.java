import java.util.Scanner;

public class Palindrome {

    static void palindromeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Enter a number to check palindrome: ");
        System.out.println("=================================================");
        int n = sc.nextInt();
        int reverse = 0, temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        if (n == reverse)
            System.out.println("The given number " + n + " is a palindrome number.");
        else
            System.out.println("The given number " + n + " is not a palindrome number.");
    }

    public static void main(String[] args) {
        Palindrome.palindromeNumber();
    }
}
