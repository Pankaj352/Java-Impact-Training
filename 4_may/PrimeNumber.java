import java.util.Scanner;

public class PrimeNumber {
    void prime(){
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter a number:");
        int n =sc.nextInt();

        if(n==0 || n==1){
            System.out.println("The number is not a prime number.");
        }else{
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("The number is not a prime number.");
                flag=1;
                break;
            }
        }
        if (flag == 0) 
            {
                System.out.println("It is a prime number.");
            }
        }
    }
    public static void main(String[] args) { 
        PrimeNumber obj=new PrimeNumber();
        obj.prime();
    }
}

