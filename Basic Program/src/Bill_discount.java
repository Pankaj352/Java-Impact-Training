import java.util.Scanner;
public class Bill_discount {
    public static void main(String user_input[]) {
        Scanner sc=new Scanner(System.in);
        int amount =Integer.parseInt(user_input[0]);

        if (amount>=1000){
            amount=amount-200;
        } else if (amount>=500) {
            amount=amount-100;
        }
        else if (amount>=100){
            amount=amount-50;
        }
        else {
            System.out.println("No discount");
        }
        System.out.println("Bill to pay after discount : " +amount);
    }
}
