public class CommandLineArgs {
    public static void main(String user_input[]) {
        int length=Integer.parseInt(user_input[0]);
        int height=Integer.parseInt(user_input[1]);
        int area=(length*height)/2;
        System.out.println("Area of triangle is"+area);
    }
}
