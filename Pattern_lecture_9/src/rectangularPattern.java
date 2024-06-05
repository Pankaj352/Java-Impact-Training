import java.util.Scanner;

public class rectangularPattern {
    public static void main(String[] args) {
        System.out.println("======================Rectangular Pattern========================");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row :");
        int row=sc.nextInt();
        System.out.println("Enter the number of column");
        int col = sc.nextInt();
        for (int i=1;i<=col;i++){
            for (int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
