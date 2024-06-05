import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===========================Pyramid====================================");
        System.out.println("Enter the number of row in Pyramid: ");
        int row=sc.nextInt();
        for (int i=1;i<=row;i++){ //traversing over rows

            //print row-1
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }


            //print 2*i-1
            for (int k = 1; k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
