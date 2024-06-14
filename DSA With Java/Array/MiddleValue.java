public class MiddleValue {
    public static void main(String[] args) {
        int[] arr={1,2,3,34,5,6,7,7,7833,4,5,55};
        int mid=midValue(arr);
        System.out.println("Middle value is: "+ mid);
    }

    public static int midValue(int[] arr){
        int mid=0;
        int start=arr[0];
        int end=arr.length-1;

        for(int value:arr){
            mid=(start+end)/2;
            if (value==mid) {
                mid=value;
            }
        }
        return mid;
    }
}
