import java.util.Scanner;

public class NoArgumentWithReturn {

    int sub(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        return a-b;
    }
    int add(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        return a+b;
    }
    int mul(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        return a*b;
    }
    int div(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        return a/b;
    }
    public static void main(String[] args) {
        NoArgumentWithReturn obj=new NoArgumentWithReturn();
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());
        System.out.println(obj.add());
    }
}