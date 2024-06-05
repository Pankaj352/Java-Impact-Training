import java.util.Scanner;

public class OppositeTrangularPattern {
    public static void main(String[] args) {
        System.out.println("======================tangular Pattern========================");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row :");
        int row=sc.nextInt();

        for (int i=row;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
