public class swappingWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println("Before swapping the value of x and y :"+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping the value of x and y :"+x+" "+y);
    }
}

