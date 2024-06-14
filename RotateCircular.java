public class RotateCircular {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int temp=arr[0];
        int length=arr.length-1;
        for(int i=0;i<length-1;i++){
            temp=arr[0];
            arr[0]=arr[length];
            arr[length]=temp;
        }

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
