import java.util.Scanner;

public class FIbbonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userNo=sc.nextInt();
        int firstNUm=0;
        int secondNum=1;
        int result;
        System.out.println(firstNUm);
        System.out.println(secondNum);
        for(int i=0;i<=userNo;++i)
        {
            result=firstNUm+secondNum;
            System.out.println(""+result);
            firstNUm=secondNum;
            secondNum=result;
        }

    }
}
