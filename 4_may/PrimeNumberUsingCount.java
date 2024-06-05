import java.util.Scanner;

public class PrimeNumberUsingCount {
    
    static void prime(){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int count=0;

    for(int i=1;i<=a;i++){
        if(a%i==0){
            count++;
        }
    }

    if (count == 2) {
        System.out.println("The number is prime");
    } else{
        System.out.println("The number is not prime");
    }
    }
    public static void main(String[] args) {
        PrimeNumberUsingCount.prime();
    }
}
