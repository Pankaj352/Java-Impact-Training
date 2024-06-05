import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("You are inside do-while loop.");
            System.out.println("Press 1 to exit from loop.");
            i=sc.nextInt();
        }
        while (i!=1);
        {
            System.out.println("You are out of do-while loop.");
        }
    }
}
