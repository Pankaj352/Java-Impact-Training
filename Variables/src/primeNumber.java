import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       int count = 0;
        System.out.println("Enter a number: ");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
                System.out.println(n +" is a Prime Number");
            }
        else {
            System.out.println(n+" is not a Prime Number");
        }

    }
}
