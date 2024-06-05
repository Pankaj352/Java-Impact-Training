import java.util.Scanner;

public class FindLastDigitOfNumber {
    public int lastDigit(int n) {
        return n %= 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter a number to Find Last Digit Of the Number:");
            int num=scanner.nextInt();
            FindLastDigitOfNumber ld=new FindLastDigitOfNumber();
            System.out.println("Last Digit of "+num+" is "+ ld.lastDigit(num)+".");
        
    
}
}
