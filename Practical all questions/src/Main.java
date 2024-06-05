import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         int x=10,y=20;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of y:");
        y=sc.nextInt();
        System.out.println("===Before Swapping the of x and y "+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("===After Swapping the of x and y "+x+" "+y);
    }
}