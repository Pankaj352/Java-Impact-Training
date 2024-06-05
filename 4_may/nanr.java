import java.util.Scanner;
public class nanr {

    void method1(){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        nanr obj=new nanr();
        obj.method1();
    }
}
