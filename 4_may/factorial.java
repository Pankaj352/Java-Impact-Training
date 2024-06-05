import java.util.Scanner;

public class factorial {

    void fact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of factorial: ");
        int num=sc.nextInt();
        int i;
        int res=1;
        for(i=1;i<=num;i++){
            res=res*i;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        factorial obj=new factorial();
        obj.fact();

    }
}
