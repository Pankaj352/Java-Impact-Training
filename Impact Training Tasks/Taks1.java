// If salary is greater than or equal to 30000 then add 10000 in salary, else add 5000

import java.util.Scanner;

public class Taks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
        if (salary >= 30000) {
            salary += 10000;
        } else {
            salary += 5000;
        }
        System.out.println(salary);
        sc.close();
    }
}
