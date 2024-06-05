import java.util.Scanner;

public class LabelledLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       outer_loop: for (int i=1;i<=3;i++){
        inner_loop:    for (int j=1;j<=3;i++){
                if (i==2&&j==2){
                    System.out.println("Continue Executes for outer loop at i=2 & j=2");
                    continue outer_loop;
                }
                System.out.println("Value of i:" + i+" Value of j : "+j);
            }
        }
    }
}
