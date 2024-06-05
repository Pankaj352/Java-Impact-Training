import java.util.Scanner;
class findLastDigit{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        scanner.close();
        int x=Math.abs(num);
        int ans=x%10;
        System.out.println("Last digit of "+num+"="+ans);


    }
}