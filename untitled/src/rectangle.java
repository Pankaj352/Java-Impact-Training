import java.util.Scanner;

public class rectangle {
    int length;
    int breadth;

    public void area() {
        int area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        length=sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        breadth=sc.nextInt();
        area=length*breadth;
        System.out.println("Area of rectangle "+area);
    }
}
