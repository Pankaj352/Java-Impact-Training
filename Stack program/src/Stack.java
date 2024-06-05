import java.util.Scanner;

public class Stack {
    int top;
    int n;

        System.out.println("Enter the size of stack");
    Scanner sc =new Scanner(System.in);
    n =sc.nextInt();
    public void push()
    {
        if (top >= n) {
            System.out.println("Stack overflow");
        }
        else{
            top=top+1;
            stack[top]=item;
        }

    }
    public void pop()
    {

    }

}
