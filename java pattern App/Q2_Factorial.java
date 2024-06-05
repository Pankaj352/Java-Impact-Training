import java.util.Scanner;

public class Q2_Factorial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find factorial : ");
        int n= scanner.nextInt();
        int fact=1;
        scanner.close();
        for (int i=0;i<=n;i++) {
            fact=fact*i;
        
    }
    System.out.println("Factorial of "+n+" is "+fact);
    
}
}
