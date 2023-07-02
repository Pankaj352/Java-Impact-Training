import java.util.Scanner;
public class SwapWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a ;//first_number
        int  b; //second number
        System.out.println("Enter the first value : ");
        a=sc.nextInt();
        System.out.println("Enter the second value : ");
        b=sc.nextInt();
        System.out.println("Before swapping the value of " + a+ "and"+b);
        a=a+b; //   }
        b=a-b;//      }swap the values
        a=a-b;//    }
        System.out.println("After swapping the value of "+ a+ "and" + b);
    }
}
