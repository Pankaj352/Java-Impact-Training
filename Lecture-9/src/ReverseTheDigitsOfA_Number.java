import java.util.Scanner;
public class ReverseTheDigitsOfA_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int answer=0;

        while (n>0){
            answer =answer*10 + n%10;
            n/=10;
        }
        System.out.println(answer);
    }
}
