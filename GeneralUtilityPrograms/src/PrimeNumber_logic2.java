import java.util.Scanner;
public class PrimeNumber_logic2 {
    public static void main(String[] args) {
        int i;
        int j=2;
        int ch=0;
        Scanner sc=new Scanner(System.in);
        i =sc.nextInt();
        //check for 1

        if (i<=1){
            ch=1;
        }
        while (j<=i/2){
            if (i%j==0){
                j++;
            }
        }
        if (ch==0){
            System.out.println(i + " is Prime.");
        }
        else {
            System.out.println(i + "is not Prime.");
        }
    }
}
