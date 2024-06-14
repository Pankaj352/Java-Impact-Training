public class HighestValue {
    public static void main(String[] args) {
        int[] arr={12,23,45,1,2,4,5,6,7,8,9};
        int max=maxValue(arr);
        System.out.println(max);
    }
    public static int maxValue(int[] arr){
        int max=arr[0];
        for(int value: arr){
            if (value>max) {
                max=value;
            }
        }
        return max;
    }
}
