import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter how many book details you want to enter");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        book obj=new book();
        for(int i=0;i<n;i++)
        {
            obj.getdata();
            obj.show_data();
        }
    }
}