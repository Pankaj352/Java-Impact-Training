import java.util.Scanner;
public class ConditionalOperatorOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value = sc.nextInt();
        if (value%3==0 || value%5==0){
            System.out.println("Found answer-"+value);
        }
    }
}
