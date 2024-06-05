import javax.crypto.spec.PSource;

public class BitwiseOPerator {
    public static void main(String[] args) {
        int x=3,y=6,z=-1,m=-2;
        //Bitwise AND
        System.out.println(x & y);//2


        //Bitwise OR
        System.out.println(x|y);//7

        //XOR

        System.out.println(x^y);//5

        //NOT
        System.out.println(~x);//-4

       //left shift
        System.out.println(x<<1);//6
        System.out.println(x<<2);//12
        System.out.println(x<<30);//-1073741824
        System.out.println(z<<1);//-2

        //Right shift
        System.out.println(m>>4);//in every condition it returns -1

        //Unsigned right shift
        System.out.println(m>>>1);//2147483647
    }
}
