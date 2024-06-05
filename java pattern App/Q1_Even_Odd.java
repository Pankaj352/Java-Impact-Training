import java.util.Scanner;

class Q1_Even_Odd {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd :");
        x = sc.nextInt();
        sc.close();
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}