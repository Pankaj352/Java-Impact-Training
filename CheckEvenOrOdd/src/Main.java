import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int number=scn.nextInt();
        if(number%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd");
        }
    }
}