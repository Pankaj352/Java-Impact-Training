import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,temp;
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of y:");
        y=sc.nextInt();
        System.out.println("Before swapping the value of "+x+"and"+y);
        temp=x;
        x=y;
        y=temp;

        System.out.println("After swapping the value of "+x+" and " +y);

    }
}
