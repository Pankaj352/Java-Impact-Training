import java.util.Scanner;
//Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
//i) both the conditions 'a < 50' and 'a < b' are true.
//        ii) at least one of the conditions 'a < 50' or 'a < b' is true.

public class Q4 {
    public static void main(String[] args) {
        int a = 55,b=70;
        System.out.println(a<50 && a<b);

        System.out.println(a<50 || a<b);

    }
}
