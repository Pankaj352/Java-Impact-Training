import java.util.Scanner;
public class SUmOfDigitsOfGivenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sumOfDigits=0;
        int original_n=n;

        while(n>0){
            sumOfDigits+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits in "+original_n+" is "+sumOfDigits);
    }
}
