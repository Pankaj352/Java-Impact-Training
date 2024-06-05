import java.util.Scanner;
public class PrintNumberInString {
    public static void main(String user_input[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 5");
        int n =Integer.parseInt(user_input[0]);
        switch (n){
            case 1:
            {
                System.out.println("ONE");
                break;
            }
            case 2:
            {
                System.out.println("TWO");
                break;
            }
            case 3:
            {
                System.out.println("THREE");
                break;
            }
            case 4:
            {
                System.out.println("FOUR");
                break;
            }
            case 5:
            {
                System.out.println("FIVE");
                break;
            }
        }

    }
}
