import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        while (i!=1){
            System.out.println("You are inside while loop.");
            System.out.println("Press 1 to exit from loop.");
            i=sc.nextInt();
        }
        System.out.println("You are out of while loop.");
    }
}
