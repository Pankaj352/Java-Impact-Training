public class StaticKeyword {
    static int cube(int x){
        return x*x*x;
    }
    public static void main(String[] args) {
        int result=StaticKeyword.cube(2);
        System.out.println(result);
    }
}
