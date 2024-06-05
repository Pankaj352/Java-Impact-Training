import java.util.Scanner;

class SumOf_n_naturalNumbers{

    public int sumOfNaturalNumbers(int n){
        int sum_natural_num=(n*(n+1)/2);
        return sum_natural_num;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        SumOf_n_naturalNumbers sum=new SumOf_n_naturalNumbers();
        System.out.println("Sum of " + num +" is "+ sum.sumOfNaturalNumbers(num)+".");
    }
}