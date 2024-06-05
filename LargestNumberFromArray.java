import java.util.Scanner;

public class LargestNumberFromArray {
    public static void main(String[] args) {
        int max, i, n;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of element in array: ");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter the elements in array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        max = max_num(a, n);
        System.out.println("The largest number is: " + max);
    }

    static int max_num(int[] a, int n) {
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }
}
