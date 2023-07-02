public class Write_a_Java_program_to_swap_two_numbers_with_the_help_of_a_third_variable {
    public static void main(String[] args) {
        int num1=2;
        int num2=3;
        System.out.println("The first number before swap is :" + num1);
        System.out.println("The second number before swap is : " + num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The first number after swap is :" + num1);
        System.out.println("The second number after swap is : " + num2);
    }
}
