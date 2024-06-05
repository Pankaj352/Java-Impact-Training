public class Armstrong {

    void armstr() {
        int n = 153, r, sum = 0;
        int tempnum=n;
        System.out.println("Number of digits in " + n + " is : ");
        while (n != 0) {
            r = n % 10;
            sum += (r * r * r);
            n /= 10;
        }
        if (tempnum == sum)
            System.out.print("The number " + sum + " is an Armstrong number");
        else
            System.out.print("The number " + sum + " is not an Armstrong number");
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        obj.armstr();
    }
}
