import java.util.Scanner;
public class LargestAmong_n_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max, i, n;
        int a[];
        System.out.println("Enter a number: ");
        n=sc.nextInt();

        a=new int[n];
        System.out.println("Enter the numbers: ");
        for (i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        max=max_num(a,n);
        System.out.println("The biggest number is " + max);
    }
    static int max_num(int a[], int n){
        int i;
        int m=0;
        for (i=0;i<n;i++){
            if (a[i]>m){
                m=a[i];
            }

        }
        return m;
    }
}
