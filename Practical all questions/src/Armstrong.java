import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num,tempNum,rem,sum=0;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        tempNum=num;
        while (num>0){
            rem=num%10;
            num=num/10;
            sum=sum+(rem*rem*rem);
        }
        if (sum==tempNum){
            System.out.println(tempNum+" is an Armstrong Number.");
        }
        else {
            System.out.println(tempNum+" is not an Armstrong Number.");
        }
    }
}
