public class multipleTryAndCatch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try {
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Enter valid array");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the element is out of Index");
        }
    }
}
