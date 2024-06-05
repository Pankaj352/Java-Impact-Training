import java.util.Scanner;

class nThTermInAP{
    public int nThTerm(int a,int d, int n){
        return a+(n-1)*d;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first element of the AP series:");
        int a=scanner.nextInt();
        System.out.println("Enter the common difference between each element: ");
        int d=scanner.nextInt();
        System.out.println("Enter the term that you find in AP:");
        int n=scanner.nextInt();

        nThTermInAP T=new nThTermInAP();
        System.out.println("So the nth term of AP is "+T.nThTerm(a,d,n));

    }
}