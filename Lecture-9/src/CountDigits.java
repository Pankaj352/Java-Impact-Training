import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int original_n = n;
        int numberOfDigits =0;
        while (n>0){
            n=n/10;
            numberOfDigits++;// Increment by 1
        }
        System.out.println("Number of digits in"+original_n+" is "+numberOfDigits);
    }
}
