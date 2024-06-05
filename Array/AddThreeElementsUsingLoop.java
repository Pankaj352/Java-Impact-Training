public class AddThreeElementsUsingLoop {
    public static void main(String[] args) {
        int []a=new int[5];
        int x=5;
        for (int i = 0; i < a.length; i++) {
            a[i]=x;
            x+=5;
            System.out.println(a[i]);
        }
        
    }
    
}
