import java.util.Scanner;

public class triangularPattern {
    public static void main(String[] args) {
        System.out.println("======================Triangular Pattern========================");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row :");
        int row=sc.nextInt();

        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
