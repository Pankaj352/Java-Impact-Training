import java.util.Scanner;

/**
 * primeNumbersBetweenTwoNumbers
 */
public class primeNumbersBetweenTwoNumbers {

    static void prime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        
            for (int i = 10; i <= n1; i++) {
                if (n1 % i == 0) {
                    isPrime = false;
                    break;
                }
                System.out.println(i);
            }
            if (isPrime) {
                System.out.print(n1 + " ");
            }
            n1++;
        }
    }

    public static void main(String[] args) {

    }
}