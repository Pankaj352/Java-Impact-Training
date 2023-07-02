public class UnaryOperator {
    public static void main(String[] args) {
        int x=10, y=10;

//        Plus
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++y);
        System.out.println(y);

        int m=x++;
        int n = ++y;

        System.out.println(m);
        System.out.println(n);
        System.out.println(x);
        System.out.println(y);
    }
}
