import java.util.Scanner;

//Prime number is a number that is divisible by only 1 and itself
public class PrimeNumber_logic1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int count=0; //division counter
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if (n%i==0)//check divisibility
            {
                count++;
            }
        }
        if (count==2) //exactly 2 if no. is prime
        {
            System.out.println(n+ " is a Prime Number.");
        }
        else{
            System.out.println(n+" is not a Prime Number.");
        }
    }
}
