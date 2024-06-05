public class Access_Specifier_77 {
    public int a = 10;
    int b = 20;//default
    private int c = 30;

    public void method1() {
        System.out.println("Public Method");
    }

    public void method2() {
        System.out.println("Private Method");
    }
}
class Main {
    public static void main(String a[]) {
        Access_Specifier_77 obj = new Access_Specifier_77();
        int a1 = obj.a;//allowed
        int b = obj.b;//allowed


    }
}
