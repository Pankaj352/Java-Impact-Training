public class precedenceOperator {
    public static void main(String[] args) {
        int a=20, b=35,c=40,result;
        result=a-++c-++b;
        System.out.println(result);

        int x=4,y=2,z=3,sol;
        sol=x+--y+--z;
        System.out.println(sol);

    }
}
