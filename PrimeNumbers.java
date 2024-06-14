public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i) && String.valueOf(i).contains("3")) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}