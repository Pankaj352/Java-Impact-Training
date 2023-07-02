import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Sting
//        System.out.println("Enter Your first name");
//        String name = sc.next();
//        System.out.println(name);
        System.out.println("Enter Your full  name");
        String full_name = sc.nextLine();
        System.out.println(full_name);

//Integer
        int num_1 = sc.nextInt();
        System.out.println(num_1);

    }
}
