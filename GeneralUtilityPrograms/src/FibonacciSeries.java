import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNum=0;
        int secondNum=1;
        int result;
        int count=0;
        int userNum;
        userNum=sc.nextInt();
        while (true){
            result=firstNum+secondNum;
            count++;
            if (result>=userNum){
                break;
            }
            firstNum=secondNum;
            secondNum=result;
            System.out.println("Fibonacci number ["+count+"]->"+result);
        }
    }
}
