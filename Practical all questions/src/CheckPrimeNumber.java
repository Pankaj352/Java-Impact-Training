import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int count=0;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        if(num<=1){
            System.out.println("The number is not prime.");
        }

        for(int i=1;i>=num/2;i++){
            if (num%i==0){
                count++;
            }
        }

        if(count>1){
            System.out.println("The number is not prime.");
        }
        else {
            System.out.println("The number is prime.");
        }
    }
}
