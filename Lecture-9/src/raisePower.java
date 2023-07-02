

import java.util.Scanner;
public class raisePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("Enter the power of the given number: ");
        int b=sc.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++)
        {
            ans *= a;
        }
        System.out.println(ans);
    }
}
